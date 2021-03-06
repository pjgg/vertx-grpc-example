// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.bq.sdk.api.proto;

/**
 * Protobuf type {@code proto.FetchAllRequest}
 */
public  final class FetchAllRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.FetchAllRequest)
    FetchAllRequestOrBuilder {
  // Use FetchAllRequest.newBuilder() to construct.
  private FetchAllRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchAllRequest() {
    from_ = 0;
    to_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FetchAllRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            from_ = input.readInt32();
            break;
          }
          case 16: {

            to_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bq.sdk.api.proto.PersonProto.internal_static_proto_FetchAllRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bq.sdk.api.proto.PersonProto.internal_static_proto_FetchAllRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bq.sdk.api.proto.FetchAllRequest.class, com.bq.sdk.api.proto.FetchAllRequest.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private int from_;
  /**
   * <code>int32 from = 1;</code>
   */
  public int getFrom() {
    return from_;
  }

  public static final int TO_FIELD_NUMBER = 2;
  private int to_;
  /**
   * <code>int32 to = 2;</code>
   */
  public int getTo() {
    return to_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (from_ != 0) {
      output.writeInt32(1, from_);
    }
    if (to_ != 0) {
      output.writeInt32(2, to_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (from_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, from_);
    }
    if (to_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, to_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bq.sdk.api.proto.FetchAllRequest)) {
      return super.equals(obj);
    }
    com.bq.sdk.api.proto.FetchAllRequest other = (com.bq.sdk.api.proto.FetchAllRequest) obj;

    boolean result = true;
    result = result && (getFrom()
        == other.getFrom());
    result = result && (getTo()
        == other.getTo());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom();
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + getTo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bq.sdk.api.proto.FetchAllRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bq.sdk.api.proto.FetchAllRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code proto.FetchAllRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.FetchAllRequest)
      com.bq.sdk.api.proto.FetchAllRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bq.sdk.api.proto.PersonProto.internal_static_proto_FetchAllRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bq.sdk.api.proto.PersonProto.internal_static_proto_FetchAllRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bq.sdk.api.proto.FetchAllRequest.class, com.bq.sdk.api.proto.FetchAllRequest.Builder.class);
    }

    // Construct using com.bq.sdk.api.proto.FetchAllRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      from_ = 0;

      to_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bq.sdk.api.proto.PersonProto.internal_static_proto_FetchAllRequest_descriptor;
    }

    public com.bq.sdk.api.proto.FetchAllRequest getDefaultInstanceForType() {
      return com.bq.sdk.api.proto.FetchAllRequest.getDefaultInstance();
    }

    public com.bq.sdk.api.proto.FetchAllRequest build() {
      com.bq.sdk.api.proto.FetchAllRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.bq.sdk.api.proto.FetchAllRequest buildPartial() {
      com.bq.sdk.api.proto.FetchAllRequest result = new com.bq.sdk.api.proto.FetchAllRequest(this);
      result.from_ = from_;
      result.to_ = to_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bq.sdk.api.proto.FetchAllRequest) {
        return mergeFrom((com.bq.sdk.api.proto.FetchAllRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bq.sdk.api.proto.FetchAllRequest other) {
      if (other == com.bq.sdk.api.proto.FetchAllRequest.getDefaultInstance()) return this;
      if (other.getFrom() != 0) {
        setFrom(other.getFrom());
      }
      if (other.getTo() != 0) {
        setTo(other.getTo());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bq.sdk.api.proto.FetchAllRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bq.sdk.api.proto.FetchAllRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int from_ ;
    /**
     * <code>int32 from = 1;</code>
     */
    public int getFrom() {
      return from_;
    }
    /**
     * <code>int32 from = 1;</code>
     */
    public Builder setFrom(int value) {
      
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 from = 1;</code>
     */
    public Builder clearFrom() {
      
      from_ = 0;
      onChanged();
      return this;
    }

    private int to_ ;
    /**
     * <code>int32 to = 2;</code>
     */
    public int getTo() {
      return to_;
    }
    /**
     * <code>int32 to = 2;</code>
     */
    public Builder setTo(int value) {
      
      to_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 to = 2;</code>
     */
    public Builder clearTo() {
      
      to_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.FetchAllRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.FetchAllRequest)
  private static final com.bq.sdk.api.proto.FetchAllRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bq.sdk.api.proto.FetchAllRequest();
  }

  public static com.bq.sdk.api.proto.FetchAllRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchAllRequest>
      PARSER = new com.google.protobuf.AbstractParser<FetchAllRequest>() {
    public FetchAllRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FetchAllRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchAllRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchAllRequest> getParserForType() {
    return PARSER;
  }

  public com.bq.sdk.api.proto.FetchAllRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

