// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VersionMessage.proto

package org.apache.hadoop.hbase.rest.protobuf.generated;

public final class VersionMessage {
  private VersionMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VersionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string restVersion = 1;
    /**
     * <code>optional string restVersion = 1;</code>
     */
    boolean hasRestVersion();
    /**
     * <code>optional string restVersion = 1;</code>
     */
    java.lang.String getRestVersion();
    /**
     * <code>optional string restVersion = 1;</code>
     */
    com.google.protobuf.ByteString
        getRestVersionBytes();

    // optional string jvmVersion = 2;
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    boolean hasJvmVersion();
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    java.lang.String getJvmVersion();
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    com.google.protobuf.ByteString
        getJvmVersionBytes();

    // optional string osVersion = 3;
    /**
     * <code>optional string osVersion = 3;</code>
     */
    boolean hasOsVersion();
    /**
     * <code>optional string osVersion = 3;</code>
     */
    java.lang.String getOsVersion();
    /**
     * <code>optional string osVersion = 3;</code>
     */
    com.google.protobuf.ByteString
        getOsVersionBytes();

    // optional string serverVersion = 4;
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    boolean hasServerVersion();
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    java.lang.String getServerVersion();
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    com.google.protobuf.ByteString
        getServerVersionBytes();

    // optional string jerseyVersion = 5;
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    boolean hasJerseyVersion();
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    java.lang.String getJerseyVersion();
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    com.google.protobuf.ByteString
        getJerseyVersionBytes();
  }
  /**
   * Protobuf type {@code org.apache.hadoop.hbase.rest.protobuf.generated.Version}
   */
  public static final class Version extends
      com.google.protobuf.GeneratedMessage
      implements VersionOrBuilder {
    // Use Version.newBuilder() to construct.
    private Version(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Version(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Version defaultInstance;
    public static Version getDefaultInstance() {
      return defaultInstance;
    }

    public Version getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Version(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              restVersion_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              jvmVersion_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              osVersion_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              serverVersion_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              jerseyVersion_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.class, org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.Builder.class);
    }

    public static com.google.protobuf.Parser<Version> PARSER =
        new com.google.protobuf.AbstractParser<Version>() {
      public Version parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Version(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Version> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string restVersion = 1;
    public static final int RESTVERSION_FIELD_NUMBER = 1;
    private java.lang.Object restVersion_;
    /**
     * <code>optional string restVersion = 1;</code>
     */
    public boolean hasRestVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string restVersion = 1;</code>
     */
    public java.lang.String getRestVersion() {
      java.lang.Object ref = restVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          restVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string restVersion = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRestVersionBytes() {
      java.lang.Object ref = restVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        restVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string jvmVersion = 2;
    public static final int JVMVERSION_FIELD_NUMBER = 2;
    private java.lang.Object jvmVersion_;
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    public boolean hasJvmVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    public java.lang.String getJvmVersion() {
      java.lang.Object ref = jvmVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          jvmVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string jvmVersion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getJvmVersionBytes() {
      java.lang.Object ref = jvmVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jvmVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string osVersion = 3;
    public static final int OSVERSION_FIELD_NUMBER = 3;
    private java.lang.Object osVersion_;
    /**
     * <code>optional string osVersion = 3;</code>
     */
    public boolean hasOsVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string osVersion = 3;</code>
     */
    public java.lang.String getOsVersion() {
      java.lang.Object ref = osVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          osVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string osVersion = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOsVersionBytes() {
      java.lang.Object ref = osVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        osVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string serverVersion = 4;
    public static final int SERVERVERSION_FIELD_NUMBER = 4;
    private java.lang.Object serverVersion_;
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    public boolean hasServerVersion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    public java.lang.String getServerVersion() {
      java.lang.Object ref = serverVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serverVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string serverVersion = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServerVersionBytes() {
      java.lang.Object ref = serverVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string jerseyVersion = 5;
    public static final int JERSEYVERSION_FIELD_NUMBER = 5;
    private java.lang.Object jerseyVersion_;
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    public boolean hasJerseyVersion() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    public java.lang.String getJerseyVersion() {
      java.lang.Object ref = jerseyVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          jerseyVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string jerseyVersion = 5;</code>
     */
    public com.google.protobuf.ByteString
        getJerseyVersionBytes() {
      java.lang.Object ref = jerseyVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jerseyVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      restVersion_ = "";
      jvmVersion_ = "";
      osVersion_ = "";
      serverVersion_ = "";
      jerseyVersion_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getRestVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getJvmVersionBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getOsVersionBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getServerVersionBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getJerseyVersionBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getRestVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getJvmVersionBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getOsVersionBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getServerVersionBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getJerseyVersionBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.apache.hadoop.hbase.rest.protobuf.generated.Version}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.VersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.class, org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        restVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        jvmVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        osVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        serverVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        jerseyVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
      }

      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version build() {
        org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version buildPartial() {
        org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version result = new org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.restVersion_ = restVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.jvmVersion_ = jvmVersion_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.osVersion_ = osVersion_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.serverVersion_ = serverVersion_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.jerseyVersion_ = jerseyVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version) {
          return mergeFrom((org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version other) {
        if (other == org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version.getDefaultInstance()) return this;
        if (other.hasRestVersion()) {
          bitField0_ |= 0x00000001;
          restVersion_ = other.restVersion_;
          onChanged();
        }
        if (other.hasJvmVersion()) {
          bitField0_ |= 0x00000002;
          jvmVersion_ = other.jvmVersion_;
          onChanged();
        }
        if (other.hasOsVersion()) {
          bitField0_ |= 0x00000004;
          osVersion_ = other.osVersion_;
          onChanged();
        }
        if (other.hasServerVersion()) {
          bitField0_ |= 0x00000008;
          serverVersion_ = other.serverVersion_;
          onChanged();
        }
        if (other.hasJerseyVersion()) {
          bitField0_ |= 0x00000010;
          jerseyVersion_ = other.jerseyVersion_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.rest.protobuf.generated.VersionMessage.Version) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string restVersion = 1;
      private java.lang.Object restVersion_ = "";
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public boolean hasRestVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public java.lang.String getRestVersion() {
        java.lang.Object ref = restVersion_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          restVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRestVersionBytes() {
        java.lang.Object ref = restVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          restVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public Builder setRestVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        restVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public Builder clearRestVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        restVersion_ = getDefaultInstance().getRestVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string restVersion = 1;</code>
       */
      public Builder setRestVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        restVersion_ = value;
        onChanged();
        return this;
      }

      // optional string jvmVersion = 2;
      private java.lang.Object jvmVersion_ = "";
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public boolean hasJvmVersion() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public java.lang.String getJvmVersion() {
        java.lang.Object ref = jvmVersion_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          jvmVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public com.google.protobuf.ByteString
          getJvmVersionBytes() {
        java.lang.Object ref = jvmVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jvmVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public Builder setJvmVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        jvmVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public Builder clearJvmVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        jvmVersion_ = getDefaultInstance().getJvmVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string jvmVersion = 2;</code>
       */
      public Builder setJvmVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        jvmVersion_ = value;
        onChanged();
        return this;
      }

      // optional string osVersion = 3;
      private java.lang.Object osVersion_ = "";
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public boolean hasOsVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public java.lang.String getOsVersion() {
        java.lang.Object ref = osVersion_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          osVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public com.google.protobuf.ByteString
          getOsVersionBytes() {
        java.lang.Object ref = osVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          osVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public Builder setOsVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        osVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public Builder clearOsVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        osVersion_ = getDefaultInstance().getOsVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string osVersion = 3;</code>
       */
      public Builder setOsVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        osVersion_ = value;
        onChanged();
        return this;
      }

      // optional string serverVersion = 4;
      private java.lang.Object serverVersion_ = "";
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public boolean hasServerVersion() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public java.lang.String getServerVersion() {
        java.lang.Object ref = serverVersion_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          serverVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public com.google.protobuf.ByteString
          getServerVersionBytes() {
        java.lang.Object ref = serverVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public Builder setServerVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        serverVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public Builder clearServerVersion() {
        bitField0_ = (bitField0_ & ~0x00000008);
        serverVersion_ = getDefaultInstance().getServerVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string serverVersion = 4;</code>
       */
      public Builder setServerVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        serverVersion_ = value;
        onChanged();
        return this;
      }

      // optional string jerseyVersion = 5;
      private java.lang.Object jerseyVersion_ = "";
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public boolean hasJerseyVersion() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public java.lang.String getJerseyVersion() {
        java.lang.Object ref = jerseyVersion_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          jerseyVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public com.google.protobuf.ByteString
          getJerseyVersionBytes() {
        java.lang.Object ref = jerseyVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          jerseyVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public Builder setJerseyVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        jerseyVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public Builder clearJerseyVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        jerseyVersion_ = getDefaultInstance().getJerseyVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string jerseyVersion = 5;</code>
       */
      public Builder setJerseyVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        jerseyVersion_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Version)
    }

    static {
      defaultInstance = new Version(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:org.apache.hadoop.hbase.rest.protobuf.generated.Version)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024VersionMessage.proto\022/org.apache.hadoo" +
      "p.hbase.rest.protobuf.generated\"s\n\007Versi" +
      "on\022\023\n\013restVersion\030\001 \001(\t\022\022\n\njvmVersion\030\002 " +
      "\001(\t\022\021\n\tosVersion\030\003 \001(\t\022\025\n\rserverVersion\030" +
      "\004 \001(\t\022\025\n\rjerseyVersion\030\005 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_apache_hadoop_hbase_rest_protobuf_generated_Version_descriptor,
              new java.lang.String[] { "RestVersion", "JvmVersion", "OsVersion", "ServerVersion", "JerseyVersion", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
