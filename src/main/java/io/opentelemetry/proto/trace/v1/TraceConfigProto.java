// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trace/v1/trace_config.proto

package io.opentelemetry.proto.trace.v1;

public final class TraceConfigProto {
  private TraceConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_trace_v1_TraceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_trace_v1_TraceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_trace_v1_ConstantSampler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_trace_v1_ConstantSampler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033trace/v1/trace_config.proto\022\034opentelem" +
      "etry.proto.trace.v1\"\310\003\n\013TraceConfig\022I\n\020c" +
      "onstant_sampler\030\001 \001(\0132-.opentelemetry.pr" +
      "oto.trace.v1.ConstantSamplerH\000\022O\n\024trace_" +
      "id_ratio_based\030\002 \001(\0132/.opentelemetry.pro" +
      "to.trace.v1.TraceIdRatioBasedH\000\022R\n\025rate_" +
      "limiting_sampler\030\003 \001(\01321.opentelemetry.p" +
      "roto.trace.v1.RateLimitingSamplerH\000\022 \n\030m" +
      "ax_number_of_attributes\030\004 \001(\003\022\"\n\032max_num" +
      "ber_of_timed_events\030\005 \001(\003\0220\n(max_number_" +
      "of_attributes_per_timed_event\030\006 \001(\003\022\033\n\023m" +
      "ax_number_of_links\030\007 \001(\003\022)\n!max_number_o" +
      "f_attributes_per_link\030\010 \001(\003B\t\n\007sampler\"\251" +
      "\001\n\017ConstantSampler\022P\n\010decision\030\001 \001(\0162>.o" +
      "pentelemetry.proto.trace.v1.ConstantSamp" +
      "ler.ConstantDecision\"D\n\020ConstantDecision" +
      "\022\016\n\nALWAYS_OFF\020\000\022\r\n\tALWAYS_ON\020\001\022\021\n\rALWAY" +
      "S_PARENT\020\002\"*\n\021TraceIdRatioBased\022\025\n\rsampl" +
      "ingRatio\030\001 \001(\001\"\"\n\023RateLimitingSampler\022\013\n" +
      "\003qps\030\001 \001(\003Bh\n\037io.opentelemetry.proto.tra" +
      "ce.v1B\020TraceConfigProtoP\001Z1go.openteleme" +
      "try.io/proto/otlp/collector/trace/v1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_opentelemetry_proto_trace_v1_TraceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_trace_v1_TraceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_trace_v1_TraceConfig_descriptor,
        new java.lang.String[] { "ConstantSampler", "TraceIdRatioBased", "RateLimitingSampler", "MaxNumberOfAttributes", "MaxNumberOfTimedEvents", "MaxNumberOfAttributesPerTimedEvent", "MaxNumberOfLinks", "MaxNumberOfAttributesPerLink", "Sampler", });
    internal_static_opentelemetry_proto_trace_v1_ConstantSampler_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opentelemetry_proto_trace_v1_ConstantSampler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_trace_v1_ConstantSampler_descriptor,
        new java.lang.String[] { "Decision", });
    internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_trace_v1_TraceIdRatioBased_descriptor,
        new java.lang.String[] { "SamplingRatio", });
    internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_trace_v1_RateLimitingSampler_descriptor,
        new java.lang.String[] { "Qps", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}