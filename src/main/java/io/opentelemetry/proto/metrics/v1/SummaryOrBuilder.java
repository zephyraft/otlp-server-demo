// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public interface SummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Summary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.v1.SummaryDataPoint> 
      getDataPointsList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.SummaryDataPoint getDataPoints(int index);
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.v1.SummaryDataPointOrBuilder> 
      getDataPointsOrBuilderList();
  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.SummaryDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.SummaryDataPointOrBuilder getDataPointsOrBuilder(
      int index);
}
