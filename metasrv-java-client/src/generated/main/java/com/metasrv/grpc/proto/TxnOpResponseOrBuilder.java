// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.metasrv.grpc.proto;

public interface TxnOpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.TxnOpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.meta.TxnGetResponse get = 1;</code>
   * @return Whether the get field is set.
   */
  boolean hasGet();
  /**
   * <code>.meta.TxnGetResponse get = 1;</code>
   * @return The get.
   */
  com.metasrv.grpc.proto.TxnGetResponse getGet();
  /**
   * <code>.meta.TxnGetResponse get = 1;</code>
   */
  com.metasrv.grpc.proto.TxnGetResponseOrBuilder getGetOrBuilder();

  /**
   * <code>.meta.TxnPutResponse put = 2;</code>
   * @return Whether the put field is set.
   */
  boolean hasPut();
  /**
   * <code>.meta.TxnPutResponse put = 2;</code>
   * @return The put.
   */
  com.metasrv.grpc.proto.TxnPutResponse getPut();
  /**
   * <code>.meta.TxnPutResponse put = 2;</code>
   */
  com.metasrv.grpc.proto.TxnPutResponseOrBuilder getPutOrBuilder();

  /**
   * <code>.meta.TxnDeleteResponse delete = 3;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <code>.meta.TxnDeleteResponse delete = 3;</code>
   * @return The delete.
   */
  com.metasrv.grpc.proto.TxnDeleteResponse getDelete();
  /**
   * <code>.meta.TxnDeleteResponse delete = 3;</code>
   */
  com.metasrv.grpc.proto.TxnDeleteResponseOrBuilder getDeleteOrBuilder();

  /**
   * <code>.meta.TxnDeleteByPrefixResponse delete_by_prefix = 4;</code>
   * @return Whether the deleteByPrefix field is set.
   */
  boolean hasDeleteByPrefix();
  /**
   * <code>.meta.TxnDeleteByPrefixResponse delete_by_prefix = 4;</code>
   * @return The deleteByPrefix.
   */
  com.metasrv.grpc.proto.TxnDeleteByPrefixResponse getDeleteByPrefix();
  /**
   * <code>.meta.TxnDeleteByPrefixResponse delete_by_prefix = 4;</code>
   */
  com.metasrv.grpc.proto.TxnDeleteByPrefixResponseOrBuilder getDeleteByPrefixOrBuilder();

  public com.metasrv.grpc.proto.TxnOpResponse.ResponseCase getResponseCase();
}