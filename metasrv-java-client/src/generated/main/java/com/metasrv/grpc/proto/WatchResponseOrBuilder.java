// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.metasrv.grpc.proto;

public interface WatchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.WatchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.meta.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <code>.meta.Event event = 1;</code>
   * @return The event.
   */
  com.metasrv.grpc.proto.Event getEvent();
  /**
   * <code>.meta.Event event = 1;</code>
   */
  com.metasrv.grpc.proto.EventOrBuilder getEventOrBuilder();
}