// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource/v1/resource.proto

package io.opentelemetry.proto.resource.v1;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032resource/v1/resource.proto\022\037openteleme" +
      "try.proto.resource.v1\032\026common/v1/common." +
      "proto\"i\n\010Resource\022;\n\nattributes\030\001 \003(\0132\'." +
      "opentelemetry.proto.common.v1.KeyValue\022 " +
      "\n\030dropped_attributes_count\030\002 \001(\rBa\n\"io.o" +
      "pentelemetry.proto.resource.v1B\rResource" +
      "ProtoP\001Z*go.opentelemetry.io/proto/otlp/" +
      "resource/v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.opentelemetry.proto.common.v1.CommonProto.getDescriptor(),
        });
    internal_static_opentelemetry_proto_resource_v1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opentelemetry_proto_resource_v1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opentelemetry_proto_resource_v1_Resource_descriptor,
        new java.lang.String[] { "Attributes", "DroppedAttributesCount", });
    io.opentelemetry.proto.common.v1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
