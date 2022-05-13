package com.zephyraft.otel.service;

import com.zephyraft.otel.OtlpServer;
import io.grpc.stub.StreamObserver;
import io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest;
import io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse;
import io.opentelemetry.proto.collector.trace.v1.TraceServiceGrpc;

import java.util.logging.Logger;

public class TracesServiceImpl extends TraceServiceGrpc.TraceServiceImplBase {

    private static final Logger logger = Logger.getLogger(OtlpServer.class.getName());

    @Override
    public void export(ExportTraceServiceRequest request, StreamObserver<ExportTraceServiceResponse> responseObserver) {
        logger.info(request.toString());
        responseObserver.onNext(ExportTraceServiceResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
