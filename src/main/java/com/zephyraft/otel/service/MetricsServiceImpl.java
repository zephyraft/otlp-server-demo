package com.zephyraft.otel.service;

import com.zephyraft.otel.OtlpServer;
import io.grpc.stub.StreamObserver;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse;
import io.opentelemetry.proto.collector.metrics.v1.MetricsServiceGrpc;

import java.util.logging.Logger;

public class MetricsServiceImpl extends MetricsServiceGrpc.MetricsServiceImplBase {

    private static final Logger logger = Logger.getLogger(OtlpServer.class.getName());

    @Override
    public void export(ExportMetricsServiceRequest request, StreamObserver<ExportMetricsServiceResponse> responseObserver) {
        logger.info(request.toString());
        responseObserver.onNext(ExportMetricsServiceResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}
