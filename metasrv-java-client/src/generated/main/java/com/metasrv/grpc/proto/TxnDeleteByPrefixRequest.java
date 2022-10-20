// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

/**
 * <pre>
 * Delete by prefix request and response
 * </pre>
 *
 * Protobuf type {@code meta.TxnDeleteByPrefixRequest}
 */
public final class TxnDeleteByPrefixRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meta.TxnDeleteByPrefixRequest)
    TxnDeleteByPrefixRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxnDeleteByPrefixRequest.newBuilder() to construct.
  private TxnDeleteByPrefixRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnDeleteByPrefixRequest() {
    prefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxnDeleteByPrefixRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TxnDeleteByPrefixRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            prefix_ = s;
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
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteByPrefixRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteByPrefixRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.class, com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.Builder.class);
  }

  public static final int PREFIX_FIELD_NUMBER = 1;
  private volatile java.lang.Object prefix_;
  /**
   * <code>string prefix = 1;</code>
   * @return The prefix.
   */
  @java.lang.Override
  public java.lang.String getPrefix() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prefix_ = s;
      return s;
    }
  }
  /**
   * <code>string prefix = 1;</code>
   * @return The bytes for prefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrefixBytes() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prefix_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, prefix_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(prefix_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, prefix_);
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
    if (!(obj instanceof com.metasrv.grpc.proto.TxnDeleteByPrefixRequest)) {
      return super.equals(obj);
    }
    com.metasrv.grpc.proto.TxnDeleteByPrefixRequest other = (com.metasrv.grpc.proto.TxnDeleteByPrefixRequest) obj;

    if (!getPrefix()
        .equals(other.getPrefix())) return false;
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
    hash = (37 * hash) + PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPrefix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parseFrom(
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
  public static Builder newBuilder(com.metasrv.grpc.proto.TxnDeleteByPrefixRequest prototype) {
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
   * <pre>
   * Delete by prefix request and response
   * </pre>
   *
   * Protobuf type {@code meta.TxnDeleteByPrefixRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meta.TxnDeleteByPrefixRequest)
      com.metasrv.grpc.proto.TxnDeleteByPrefixRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteByPrefixRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteByPrefixRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.class, com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.Builder.class);
    }

    // Construct using com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.newBuilder()
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
      prefix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteByPrefixRequest_descriptor;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteByPrefixRequest getDefaultInstanceForType() {
      return com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteByPrefixRequest build() {
      com.metasrv.grpc.proto.TxnDeleteByPrefixRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteByPrefixRequest buildPartial() {
      com.metasrv.grpc.proto.TxnDeleteByPrefixRequest result = new com.metasrv.grpc.proto.TxnDeleteByPrefixRequest(this);
      result.prefix_ = prefix_;
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
      if (other instanceof com.metasrv.grpc.proto.TxnDeleteByPrefixRequest) {
        return mergeFrom((com.metasrv.grpc.proto.TxnDeleteByPrefixRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.metasrv.grpc.proto.TxnDeleteByPrefixRequest other) {
      if (other == com.metasrv.grpc.proto.TxnDeleteByPrefixRequest.getDefaultInstance()) return this;
      if (!other.getPrefix().isEmpty()) {
        prefix_ = other.prefix_;
        onChanged();
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
      com.metasrv.grpc.proto.TxnDeleteByPrefixRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.metasrv.grpc.proto.TxnDeleteByPrefixRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object prefix_ = "";
    /**
     * <code>string prefix = 1;</code>
     * @return The prefix.
     */
    public java.lang.String getPrefix() {
      java.lang.Object ref = prefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prefix = 1;</code>
     * @return The bytes for prefix.
     */
    public com.google.protobuf.ByteString
        getPrefixBytes() {
      java.lang.Object ref = prefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prefix = 1;</code>
     * @param value The prefix to set.
     * @return This builder for chaining.
     */
    public Builder setPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prefix = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefix() {
      
      prefix_ = getDefaultInstance().getPrefix();
      onChanged();
      return this;
    }
    /**
     * <code>string prefix = 1;</code>
     * @param value The bytes for prefix to set.
     * @return This builder for chaining.
     */
    public Builder setPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:meta.TxnDeleteByPrefixRequest)
  }

  // @@protoc_insertion_point(class_scope:meta.TxnDeleteByPrefixRequest)
  private static final com.metasrv.grpc.proto.TxnDeleteByPrefixRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.metasrv.grpc.proto.TxnDeleteByPrefixRequest();
  }

  public static com.metasrv.grpc.proto.TxnDeleteByPrefixRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnDeleteByPrefixRequest>
      PARSER = new com.google.protobuf.AbstractParser<TxnDeleteByPrefixRequest>() {
    @java.lang.Override
    public TxnDeleteByPrefixRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxnDeleteByPrefixRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxnDeleteByPrefixRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnDeleteByPrefixRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.metasrv.grpc.proto.TxnDeleteByPrefixRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

