// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector/logs/v1/logs_service.proto

package io.opentelemetry.proto.collector.logs.v1;

public final class LogsServiceProto {
  private LogsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$collector/logs/v1/logs_service.proto\022%" +
      "opentelemetry.proto.collector.logs.v1\032\022l" +
      "ogs/v1/logs.proto\"\\\n\030ExportLogsServiceRe" +
      "quest\022@\n\rresource_logs\030\001 \003(\0132).opentelem" +
      "etry.proto.logs.v1.ResourceLogs\"\033\n\031Expor" +
      "tLogsServiceResponse2\235\001\n\013LogsService\022\215\001\n" +
      "\006Export\022?.opentelemetry.proto.collector." +
      "logs.v1.ExportLogsServiceRequest\032@.opent" +
      "elemetry.proto.collector.logs.v1.ExportL" +
      "ogsServiceResponse\"\000Bp\n(io.opentelemetry" +
      ".proto.collector.logs.v1B\020LogsServicePro" +
      "toP\001Z0go.opentelemetry.io/proto/otlp/col" +
      "lector/logs/v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opentelemetry.proto.logs.v1.LogsProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceRequest_descriptor,
        new java.lang.String[] { "ResourceLogs", });
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_collector_logs_v1_ExportLogsServiceResponse_descriptor,
        new java.lang.String[] { });
    io.opentelemetry.proto.logs.v1.LogsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
