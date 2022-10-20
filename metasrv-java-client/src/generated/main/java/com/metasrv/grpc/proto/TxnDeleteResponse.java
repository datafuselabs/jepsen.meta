// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package com.metasrv.grpc.proto;

/**
 * Protobuf type {@code meta.TxnDeleteResponse}
 */
public final class TxnDeleteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:meta.TxnDeleteResponse)
    TxnDeleteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxnDeleteResponse.newBuilder() to construct.
  private TxnDeleteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnDeleteResponse() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxnDeleteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TxnDeleteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            key_ = s;
            break;
          }
          case 16: {

            success_ = input.readBool();
            break;
          }
          case 26: {
            com.metasrv.grpc.proto.SeqV.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = prevValue_.toBuilder();
            }
            prevValue_ = input.readMessage(com.metasrv.grpc.proto.SeqV.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(prevValue_);
              prevValue_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.metasrv.grpc.proto.TxnDeleteResponse.class, com.metasrv.grpc.proto.TxnDeleteResponse.Builder.class);
  }

  private int bitField0_;
  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private boolean success_;
  /**
   * <code>bool success = 2;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int PREV_VALUE_FIELD_NUMBER = 3;
  private com.metasrv.grpc.proto.SeqV prevValue_;
  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   * @return Whether the prevValue field is set.
   */
  @java.lang.Override
  public boolean hasPrevValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   * @return The prevValue.
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqV getPrevValue() {
    return prevValue_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prevValue_;
  }
  /**
   * <code>optional .meta.SeqV prev_value = 3;</code>
   */
  @java.lang.Override
  public com.metasrv.grpc.proto.SeqVOrBuilder getPrevValueOrBuilder() {
    return prevValue_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prevValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (success_ != false) {
      output.writeBool(2, success_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPrevValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, success_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrevValue());
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
    if (!(obj instanceof com.metasrv.grpc.proto.TxnDeleteResponse)) {
      return super.equals(obj);
    }
    com.metasrv.grpc.proto.TxnDeleteResponse other = (com.metasrv.grpc.proto.TxnDeleteResponse) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (getSuccess()
        != other.getSuccess()) return false;
    if (hasPrevValue() != other.hasPrevValue()) return false;
    if (hasPrevValue()) {
      if (!getPrevValue()
          .equals(other.getPrevValue())) return false;
    }
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (hasPrevValue()) {
      hash = (37 * hash) + PREV_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getPrevValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.metasrv.grpc.proto.TxnDeleteResponse parseFrom(
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
  public static Builder newBuilder(com.metasrv.grpc.proto.TxnDeleteResponse prototype) {
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
   * Protobuf type {@code meta.TxnDeleteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:meta.TxnDeleteResponse)
      com.metasrv.grpc.proto.TxnDeleteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.metasrv.grpc.proto.TxnDeleteResponse.class, com.metasrv.grpc.proto.TxnDeleteResponse.Builder.class);
    }

    // Construct using com.metasrv.grpc.proto.TxnDeleteResponse.newBuilder()
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
        getPrevValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = "";

      success_ = false;

      if (prevValueBuilder_ == null) {
        prevValue_ = null;
      } else {
        prevValueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.metasrv.grpc.proto.RequestProtobuf.internal_static_meta_TxnDeleteResponse_descriptor;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteResponse getDefaultInstanceForType() {
      return com.metasrv.grpc.proto.TxnDeleteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteResponse build() {
      com.metasrv.grpc.proto.TxnDeleteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.metasrv.grpc.proto.TxnDeleteResponse buildPartial() {
      com.metasrv.grpc.proto.TxnDeleteResponse result = new com.metasrv.grpc.proto.TxnDeleteResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.key_ = key_;
      result.success_ = success_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (prevValueBuilder_ == null) {
          result.prevValue_ = prevValue_;
        } else {
          result.prevValue_ = prevValueBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.metasrv.grpc.proto.TxnDeleteResponse) {
        return mergeFrom((com.metasrv.grpc.proto.TxnDeleteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.metasrv.grpc.proto.TxnDeleteResponse other) {
      if (other == com.metasrv.grpc.proto.TxnDeleteResponse.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.hasPrevValue()) {
        mergePrevValue(other.getPrevValue());
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
      com.metasrv.grpc.proto.TxnDeleteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.metasrv.grpc.proto.TxnDeleteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private boolean success_ ;
    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private com.metasrv.grpc.proto.SeqV prevValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> prevValueBuilder_;
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     * @return Whether the prevValue field is set.
     */
    public boolean hasPrevValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     * @return The prevValue.
     */
    public com.metasrv.grpc.proto.SeqV getPrevValue() {
      if (prevValueBuilder_ == null) {
        return prevValue_ == null ? com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prevValue_;
      } else {
        return prevValueBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public Builder setPrevValue(com.metasrv.grpc.proto.SeqV value) {
      if (prevValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prevValue_ = value;
        onChanged();
      } else {
        prevValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public Builder setPrevValue(
        com.metasrv.grpc.proto.SeqV.Builder builderForValue) {
      if (prevValueBuilder_ == null) {
        prevValue_ = builderForValue.build();
        onChanged();
      } else {
        prevValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public Builder mergePrevValue(com.metasrv.grpc.proto.SeqV value) {
      if (prevValueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            prevValue_ != null &&
            prevValue_ != com.metasrv.grpc.proto.SeqV.getDefaultInstance()) {
          prevValue_ =
            com.metasrv.grpc.proto.SeqV.newBuilder(prevValue_).mergeFrom(value).buildPartial();
        } else {
          prevValue_ = value;
        }
        onChanged();
      } else {
        prevValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public Builder clearPrevValue() {
      if (prevValueBuilder_ == null) {
        prevValue_ = null;
        onChanged();
      } else {
        prevValueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public com.metasrv.grpc.proto.SeqV.Builder getPrevValueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPrevValueFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    public com.metasrv.grpc.proto.SeqVOrBuilder getPrevValueOrBuilder() {
      if (prevValueBuilder_ != null) {
        return prevValueBuilder_.getMessageOrBuilder();
      } else {
        return prevValue_ == null ?
            com.metasrv.grpc.proto.SeqV.getDefaultInstance() : prevValue_;
      }
    }
    /**
     * <code>optional .meta.SeqV prev_value = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder> 
        getPrevValueFieldBuilder() {
      if (prevValueBuilder_ == null) {
        prevValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.metasrv.grpc.proto.SeqV, com.metasrv.grpc.proto.SeqV.Builder, com.metasrv.grpc.proto.SeqVOrBuilder>(
                getPrevValue(),
                getParentForChildren(),
                isClean());
        prevValue_ = null;
      }
      return prevValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:meta.TxnDeleteResponse)
  }

  // @@protoc_insertion_point(class_scope:meta.TxnDeleteResponse)
  private static final com.metasrv.grpc.proto.TxnDeleteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.metasrv.grpc.proto.TxnDeleteResponse();
  }

  public static com.metasrv.grpc.proto.TxnDeleteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnDeleteResponse>
      PARSER = new com.google.protobuf.AbstractParser<TxnDeleteResponse>() {
    @java.lang.Override
    public TxnDeleteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TxnDeleteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxnDeleteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnDeleteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.metasrv.grpc.proto.TxnDeleteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
