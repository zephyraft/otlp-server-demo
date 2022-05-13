package com.zephyraft.otel.service;

import com.zephyraft.otel.OtlpServer;
import io.grpc.stub.StreamObserver;
import io.opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest;
import io.opentelemetry.proto.collector.logs.v1.ExportLogsServiceResponse;
import io.opentelemetry.proto.collector.logs.v1.LogsServiceGrpc;

import java.util.logging.Logger;

public class LogsServiceImpl extends LogsServiceGrpc.LogsServiceImplBase {

    private static final Logger logger = Logger.getLogger(OtlpServer.class.getName());

    @Override
    public void export(ExportLogsServiceRequest request, StreamObserver<ExportLogsServiceResponse> responseObserver) {
        logger.info(request.toString());
        responseObserver.onNext(ExportLogsServiceResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

}
