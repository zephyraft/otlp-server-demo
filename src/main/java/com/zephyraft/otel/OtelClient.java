/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zephyraft.otel;

import com.google.protobuf.ByteString;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest;
import io.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse;
import io.opentelemetry.proto.collector.logs.v1.LogsServiceGrpc;
import io.opentelemetry.proto.common.v1.AnyValue;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.logs.v1.InstrumentationLibraryLogs;
import io.opentelemetry.proto.logs.v1.LogRecord;
import io.opentelemetry.proto.logs.v1.ResourceLogs;
import io.opentelemetry.proto.resource.v1.Resource;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link OtelServer}.
 */
public class OtelClient {
    private static final Logger logger = Logger.getLogger(OtelClient.class.getName());

    private final GreeterGrpc.GreeterBlockingStub blockingStub;
    private final LogsServiceGrpc.LogsServiceBlockingStub logsServiceBlockingStub;

    /**
     * Construct client for accessing HelloWorld server using the existing channel.
     */
    public OtelClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = GreeterGrpc.newBlockingStub(channel);
        logsServiceBlockingStub = LogsServiceGrpc.newBlockingStub(channel);
    }

    /**
     * Say hello to server.
     */
    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = blockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
        try {
            response = blockingStub.sayHelloAgain(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
    }

    public void log() {
        Resource resource = Resource.newBuilder().addAttributes(
                        KeyValue.newBuilder()
                                .setKey("kkk")
                                .setValue(
                                        AnyValue.newBuilder().setStringValue("vvv").build()
                                ).build()
                )
                .setDroppedAttributesCount(0)
                .build();

        LogRecord logRecord = LogRecord.newBuilder()
                .setTimeUnixNano(Instant.now().getNano())
                .setObservedTimeUnixNano(Instant.now().getNano())
                .setSeverityText("INFO")
                .setName("test")
                .setBody(AnyValue.newBuilder().setStringValue("This is a test log.").build())
                .setTraceId(ByteString.copyFromUtf8("109481290347498213478"))
                .setSpanId(ByteString.copyFromUtf8("214124213512"))
                .build();

        InstrumentationLibraryLogs instrumentationLibraryLogs = InstrumentationLibraryLogs.newBuilder()
                .addLogRecords(logRecord)
                .build();

        ResourceLogs resourceLogs = ResourceLogs.newBuilder()
                .setResource(resource)
                .addInstrumentationLibraryLogs(instrumentationLibraryLogs)
                .build();
        ExportLogsServiceRequest request = ExportLogsServiceRequest.newBuilder().addResourceLogs(resourceLogs).build();
        try {
            ExportLogsServiceResponse response = logsServiceBlockingStub.export(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */
    public static void main(String[] args) throws Exception {
        String user = "world";
        // Access a service running on the local machine on port 50051
        String target = "localhost:8080";

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        try {
            OtelClient client = new OtelClient(channel);
            client.greet(user);
            client.log();
        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
