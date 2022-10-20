// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta.proto

package com.metasrv.grpc.proto;

public final class MetaProtobuf {
  private MetaProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_RaftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_RaftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_RaftReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_RaftReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_MemberListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_MemberListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_MemberListReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_MemberListReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_HandshakeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_HandshakeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_HandshakeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_HandshakeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Auth_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Auth_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_ExportedChunk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_ExportedChunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_WatchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_WatchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_WatchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_WatchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnOp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnOp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnOpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnOpResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_TxnReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_TxnReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmeta.proto\022\004meta\032\rrequest.proto\"\007\n\005Emp" +
      "ty\"\033\n\013RaftRequest\022\014\n\004data\030\001 \001(\t\"(\n\tRaftR" +
      "eply\022\014\n\004data\030\001 \001(\t\022\r\n\005error\030\002 \001(\t\"!\n\021Mem" +
      "berListRequest\022\014\n\004data\030\001 \001(\t\"\037\n\017MemberLi" +
      "stReply\022\014\n\004data\030\001 \003(\t\"=\n\020HandshakeReques" +
      "t\022\030\n\020protocol_version\030\001 \001(\004\022\017\n\007payload\030\002" +
      " \001(\014\">\n\021HandshakeResponse\022\030\n\020protocol_ve" +
      "rsion\030\001 \001(\004\022\017\n\007payload\030\002 \001(\014\"*\n\004Auth\022\020\n\010" +
      "username\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\"\035\n\rExpo" +
      "rtedChunk\022\014\n\004data\030\n \003(\t\"\240\001\n\014WatchRequest" +
      "\022\013\n\003key\030\001 \001(\t\022\024\n\007key_end\030\002 \001(\tH\000\210\001\001\0222\n\013f" +
      "ilter_type\030\003 \001(\0162\035.meta.WatchRequest.Fil" +
      "terType\"-\n\nFilterType\022\007\n\003ALL\020\000\022\n\n\006UPDATE" +
      "\020\001\022\n\n\006DELETE\020\002B\n\n\010_key_end\"j\n\005Event\022\013\n\003k" +
      "ey\030\001 \001(\t\022 \n\007current\030\002 \001(\0132\n.meta.SeqVH\000\210" +
      "\001\001\022\035\n\004prev\030\003 \001(\0132\n.meta.SeqVH\001\210\001\001B\n\n\010_cu" +
      "rrentB\007\n\005_prev\"+\n\rWatchResponse\022\032\n\005event" +
      "\030\001 \001(\0132\013.meta.Event\"\276\001\n\014TxnCondition\022\013\n\003" +
      "key\030\001 \001(\t\022\017\n\005value\030\002 \001(\014H\000\022\r\n\003seq\030\003 \001(\004H" +
      "\000\0224\n\010expected\030\004 \001(\0162\".meta.TxnCondition." +
      "ConditionResult\"A\n\017ConditionResult\022\006\n\002EQ" +
      "\020\000\022\006\n\002GT\020\001\022\006\n\002GE\020\002\022\006\n\002LT\020\003\022\006\n\002LE\020\004\022\006\n\002NE" +
      "\020\005B\010\n\006target\"\300\001\n\005TxnOp\022\"\n\003get\030\001 \001(\0132\023.me" +
      "ta.TxnGetRequestH\000\022\"\n\003put\030\002 \001(\0132\023.meta.T" +
      "xnPutRequestH\000\022(\n\006delete\030\003 \001(\0132\026.meta.Tx" +
      "nDeleteRequestH\000\022:\n\020delete_by_prefix\030\004 \001" +
      "(\0132\036.meta.TxnDeleteByPrefixRequestH\000B\t\n\007" +
      "request\"\315\001\n\rTxnOpResponse\022#\n\003get\030\001 \001(\0132\024" +
      ".meta.TxnGetResponseH\000\022#\n\003put\030\002 \001(\0132\024.me" +
      "ta.TxnPutResponseH\000\022)\n\006delete\030\003 \001(\0132\027.me" +
      "ta.TxnDeleteResponseH\000\022;\n\020delete_by_pref" +
      "ix\030\004 \001(\0132\037.meta.TxnDeleteByPrefixRespons" +
      "eH\000B\n\n\010response\"q\n\nTxnRequest\022%\n\tconditi" +
      "on\030\001 \003(\0132\022.meta.TxnCondition\022\034\n\007if_then\030" +
      "\002 \003(\0132\013.meta.TxnOp\022\036\n\telse_then\030\003 \003(\0132\013." +
      "meta.TxnOp\"R\n\010TxnReply\022\017\n\007success\030\001 \001(\010\022" +
      "&\n\tresponses\030\002 \003(\0132\023.meta.TxnOpResponse\022" +
      "\r\n\005error\030\003 \001(\t2\205\002\n\013RaftService\022-\n\005Write\022" +
      "\021.meta.RaftRequest\032\017.meta.RaftReply\"\000\022/\n" +
      "\007Forward\022\021.meta.RaftRequest\032\017.meta.RaftR" +
      "eply\"\000\0223\n\rAppendEntries\022\021.meta.RaftReque" +
      "st\032\017.meta.RaftReply\0225\n\017InstallSnapshot\022\021" +
      ".meta.RaftRequest\032\017.meta.RaftReply\022*\n\004Vo" +
      "te\022\021.meta.RaftRequest\032\017.meta.RaftReply2\377" +
      "\002\n\013MetaService\022@\n\tHandshake\022\026.meta.Hands" +
      "hakeRequest\032\027.meta.HandshakeResponse(\0010\001" +
      "\022.\n\010WriteMsg\022\021.meta.RaftRequest\032\017.meta.R" +
      "aftReply\022-\n\007ReadMsg\022\021.meta.RaftRequest\032\017" +
      ".meta.RaftReply\022,\n\006Export\022\013.meta.Empty\032\023" +
      ".meta.ExportedChunk0\001\0222\n\005Watch\022\022.meta.Wa" +
      "tchRequest\032\023.meta.WatchResponse0\001\022/\n\013Tra" +
      "nsaction\022\020.meta.TxnRequest\032\016.meta.TxnRep" +
      "ly\022<\n\nMemberList\022\027.meta.MemberListReques" +
      "t\032\025.meta.MemberListReplyB(\n\026com.metasrv." +
      "grpc.protoB\014MetaProtobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.metasrv.grpc.proto.RequestProtobuf.getDescriptor(),
        });
    internal_static_meta_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_meta_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_meta_RaftRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_meta_RaftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_RaftRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_meta_RaftReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_meta_RaftReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_RaftReply_descriptor,
        new java.lang.String[] { "Data", "Error", });
    internal_static_meta_MemberListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_meta_MemberListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_MemberListRequest_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_meta_MemberListReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_meta_MemberListReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_MemberListReply_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_meta_HandshakeRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_meta_HandshakeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_HandshakeRequest_descriptor,
        new java.lang.String[] { "ProtocolVersion", "Payload", });
    internal_static_meta_HandshakeResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_meta_HandshakeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_HandshakeResponse_descriptor,
        new java.lang.String[] { "ProtocolVersion", "Payload", });
    internal_static_meta_Auth_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_meta_Auth_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Auth_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_meta_ExportedChunk_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_meta_ExportedChunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_ExportedChunk_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_meta_WatchRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_meta_WatchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_WatchRequest_descriptor,
        new java.lang.String[] { "Key", "KeyEnd", "FilterType", "KeyEnd", });
    internal_static_meta_Event_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_meta_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Event_descriptor,
        new java.lang.String[] { "Key", "Current", "Prev", "Current", "Prev", });
    internal_static_meta_WatchResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_meta_WatchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_WatchResponse_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_meta_TxnCondition_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_meta_TxnCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnCondition_descriptor,
        new java.lang.String[] { "Key", "Value", "Seq", "Expected", "Target", });
    internal_static_meta_TxnOp_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_meta_TxnOp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnOp_descriptor,
        new java.lang.String[] { "Get", "Put", "Delete", "DeleteByPrefix", "Request", });
    internal_static_meta_TxnOpResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_meta_TxnOpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnOpResponse_descriptor,
        new java.lang.String[] { "Get", "Put", "Delete", "DeleteByPrefix", "Response", });
    internal_static_meta_TxnRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_meta_TxnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnRequest_descriptor,
        new java.lang.String[] { "Condition", "IfThen", "ElseThen", });
    internal_static_meta_TxnReply_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_meta_TxnReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_TxnReply_descriptor,
        new java.lang.String[] { "Success", "Responses", "Error", });
    com.metasrv.grpc.proto.RequestProtobuf.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
