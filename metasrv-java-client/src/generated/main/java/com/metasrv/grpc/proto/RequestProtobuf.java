// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

public final class RequestProtobuf {
  private RequestProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_SeqV_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_SeqV_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnPutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnPutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnPutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnPutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnDeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnDeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnDeleteByPrefixRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnDeleteByPrefixRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnDeleteByPrefixResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnDeleteByPrefixResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rrequest.proto\022\004meta\"!\n\004SeqV\022\013\n\003seq\030\001 \001" +
      "(\004\022\014\n\004data\030\002 \001(\014\"\034\n\rTxnGetRequest\022\013\n\003key" +
      "\030\001 \001(\t\"G\n\016TxnGetResponse\022\013\n\003key\030\001 \001(\t\022\036\n" +
      "\005value\030\002 \001(\0132\n.meta.SeqVH\000\210\001\001B\010\n\006_value\"" +
      "?\n\rTxnPutRequest\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\014\022\022\n\nprev_value\030\003 \001(\010\"Q\n\016TxnPutRespon" +
      "se\022\013\n\003key\030\001 \001(\t\022#\n\nprev_value\030\002 \001(\0132\n.me" +
      "ta.SeqVH\000\210\001\001B\r\n\013_prev_value\"3\n\020TxnDelete" +
      "Request\022\013\n\003key\030\001 \001(\t\022\022\n\nprev_value\030\002 \001(\010" +
      "\"e\n\021TxnDeleteResponse\022\013\n\003key\030\001 \001(\t\022\017\n\007su" +
      "ccess\030\002 \001(\010\022#\n\nprev_value\030\003 \001(\0132\n.meta.S" +
      "eqVH\000\210\001\001B\r\n\013_prev_value\"*\n\030TxnDeleteByPr" +
      "efixRequest\022\016\n\006prefix\030\001 \001(\t\":\n\031TxnDelete" +
      "ByPrefixResponse\022\016\n\006prefix\030\001 \001(\t\022\r\n\005coun" +
      "t\030\002 \001(\rB+\n\026com.metasrv.grpc.protoB\017Reque" +
      "stProtobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_meta_SeqV_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_meta_SeqV_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_SeqV_descriptor,
        new java.lang.String[] { "Seq", "Data", });
    internal_static_meta_TxnGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_meta_TxnGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnGetRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_meta_TxnGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_meta_TxnGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnGetResponse_descriptor,
        new java.lang.String[] { "Key", "Value", "Value", });
    internal_static_meta_TxnPutRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_meta_TxnPutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnPutRequest_descriptor,
        new java.lang.String[] { "Key", "Value", "PrevValue", });
    internal_static_meta_TxnPutResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_meta_TxnPutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnPutResponse_descriptor,
        new java.lang.String[] { "Key", "PrevValue", "PrevValue", });
    internal_static_meta_TxnDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_meta_TxnDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnDeleteRequest_descriptor,
        new java.lang.String[] { "Key", "PrevValue", });
    internal_static_meta_TxnDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_meta_TxnDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnDeleteResponse_descriptor,
        new java.lang.String[] { "Key", "Success", "PrevValue", "PrevValue", });
    internal_static_meta_TxnDeleteByPrefixRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_meta_TxnDeleteByPrefixRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnDeleteByPrefixRequest_descriptor,
        new java.lang.String[] { "Prefix", });
    internal_static_meta_TxnDeleteByPrefixResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_meta_TxnDeleteByPrefixResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnDeleteByPrefixResponse_descriptor,
        new java.lang.String[] { "Prefix", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
