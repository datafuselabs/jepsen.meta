// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

/**
 * Protobuf type {@code meta.SeqV}
 */
public final class SeqV extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meta.SeqV)
    SeqVOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SeqV.newBuilder() to construct.
  private SeqV(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SeqV() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SeqV();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SeqV(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            seq_ = input.readUInt64();
            break;
          }
          case 18: {

            data_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_SeqV_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_SeqV_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.metasrv.grpc.proto.SeqV.class, com.metasrv.grpc.proto.SeqV.Builder.class);
  }

  public static final int SEQ_FIELD_NUMBER = 1;
  private long seq_;
  /**
   * <code>uint64 seq = 1;</code>
   * @return The seq.
   */
  @java.lang.Override
  public long getSeq() {
    return seq_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (seq_ != 0L) {
      output.writeUInt64(1, seq_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seq_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, seq_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.metasrv.grpc.proto.SeqV)) {
      return super.equals(obj);
    }
    com.metasrv.grpc.proto.SeqV other = (com.metasrv.grpc.proto.SeqV) obj;

    if (getSeq()
        != other.getSeq()) return false;
    if (!getData()
        .equals(other.getData())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEQ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSeq());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.metasrv.grpc.proto.SeqV parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.SeqV parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.SeqV parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.SeqV parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.metasrv.grpc.proto.SeqV prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code meta.SeqV}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meta.SeqV)
      com.metasrv.grpc.proto.SeqVOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_SeqV_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_SeqV_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.metasrv.grpc.proto.SeqV.class, com.metasrv.grpc.proto.SeqV.Builder.class);
    }

    // Construct using com.metasrv.grpc.proto.SeqV.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      seq_ = 0L;

      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_SeqV_descriptor;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.SeqV getDefaultInstanceForType() {
      return com.metasrv.grpc.proto.SeqV.getDefaultInstance();
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.SeqV build() {
      com.metasrv.grpc.proto.SeqV result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.SeqV buildPartial() {
      com.metasrv.grpc.proto.SeqV result = new com.metasrv.grpc.proto.SeqV(this);
      result.seq_ = seq_;
      result.data_ = data_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.metasrv.grpc.proto.SeqV) {
        return mergeFrom((com.metasrv.grpc.proto.SeqV)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.metasrv.grpc.proto.SeqV other) {
      if (other == com.metasrv.grpc.proto.SeqV.getDefaultInstance()) return this;
      if (other.getSeq() != 0L) {
        setSeq(other.getSeq());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.metasrv.grpc.proto.SeqV parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.metasrv.grpc.proto.SeqV) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long seq_ ;
    /**
     * <code>uint64 seq = 1;</code>
     * @return The seq.
     */
    @java.lang.Override
    public long getSeq() {
      return seq_;
    }
    /**
     * <code>uint64 seq = 1;</code>
     * @param value The seq to set.
     * @return This builder for chaining.
     */
    public Builder setSeq(long value) {
      
      seq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 seq = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeq() {
      
      seq_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:meta.SeqV)
  }

  // @@protoc_insertion_point(class_scope:meta.SeqV)
  private static final com.metasrv.grpc.proto.SeqV DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.metasrv.grpc.proto.SeqV();
  }

  public static com.metasrv.grpc.proto.SeqV getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SeqV>
      PARSER = new com.google.protobuf.AbstractParser<SeqV>() {
    @java.lang.Override
    public SeqV parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SeqV(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SeqV> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SeqV> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.metasrv.grpc.proto.SeqV getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

