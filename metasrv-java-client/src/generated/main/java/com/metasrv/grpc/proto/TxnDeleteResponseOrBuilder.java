// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

public interface TxnDeleteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.TxnDeleteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>bool success = 2;</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   * @return Whether the prevValue field is set.
   */
  boolean hasPrevValue();
  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   * @return The prevValue.
   */
  com.metasrv.grpc.proto.SeqV getPrevValue();
  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   */
  com.metasrv.grpc.proto.SeqVOrBuilder getPrevValueOrBuilder();
}