// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobufs/Libsodium.proto

package me.camerongray.teamlocker.client.protobufs;

public final class Libsodium {
  private Libsodium() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LibsodiumItemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LibsodiumItem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes data = 1;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>optional bytes nonce = 2;</code>
     */
    com.google.protobuf.ByteString getNonce();

    /**
     * <code>optional int64 ops_limit = 3;</code>
     */
    long getOpsLimit();

    /**
     * <code>optional int64 mem_limit = 4;</code>
     */
    long getMemLimit();
  }
  /**
   * Protobuf type {@code LibsodiumItem}
   */
  public  static final class LibsodiumItem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LibsodiumItem)
      LibsodiumItemOrBuilder {
    // Use LibsodiumItem.newBuilder() to construct.
    private LibsodiumItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LibsodiumItem() {
      data_ = com.google.protobuf.ByteString.EMPTY;
      nonce_ = com.google.protobuf.ByteString.EMPTY;
      opsLimit_ = 0L;
      memLimit_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LibsodiumItem(
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
            case 10: {

              data_ = input.readBytes();
              break;
            }
            case 18: {

              nonce_ = input.readBytes();
              break;
            }
            case 24: {

              opsLimit_ = input.readInt64();
              break;
            }
            case 32: {

              memLimit_ = input.readInt64();
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
      return me.camerongray.teamlocker.client.protobufs.Libsodium.internal_static_LibsodiumItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.camerongray.teamlocker.client.protobufs.Libsodium.internal_static_LibsodiumItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.class, me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int NONCE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString nonce_;
    /**
     * <code>optional bytes nonce = 2;</code>
     */
    public com.google.protobuf.ByteString getNonce() {
      return nonce_;
    }

    public static final int OPS_LIMIT_FIELD_NUMBER = 3;
    private long opsLimit_;
    /**
     * <code>optional int64 ops_limit = 3;</code>
     */
    public long getOpsLimit() {
      return opsLimit_;
    }

    public static final int MEM_LIMIT_FIELD_NUMBER = 4;
    private long memLimit_;
    /**
     * <code>optional int64 mem_limit = 4;</code>
     */
    public long getMemLimit() {
      return memLimit_;
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
      if (!data_.isEmpty()) {
        output.writeBytes(1, data_);
      }
      if (!nonce_.isEmpty()) {
        output.writeBytes(2, nonce_);
      }
      if (opsLimit_ != 0L) {
        output.writeInt64(3, opsLimit_);
      }
      if (memLimit_ != 0L) {
        output.writeInt64(4, memLimit_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, data_);
      }
      if (!nonce_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, nonce_);
      }
      if (opsLimit_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, opsLimit_);
      }
      if (memLimit_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, memLimit_);
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
      if (!(obj instanceof me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem)) {
        return super.equals(obj);
      }
      me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem other = (me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem) obj;

      boolean result = true;
      result = result && getData()
          .equals(other.getData());
      result = result && getNonce()
          .equals(other.getNonce());
      result = result && (getOpsLimit()
          == other.getOpsLimit());
      result = result && (getMemLimit()
          == other.getMemLimit());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + NONCE_FIELD_NUMBER;
      hash = (53 * hash) + getNonce().hashCode();
      hash = (37 * hash) + OPS_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOpsLimit());
      hash = (37 * hash) + MEM_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMemLimit());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parseFrom(
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
    public static Builder newBuilder(me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem prototype) {
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
     * Protobuf type {@code LibsodiumItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LibsodiumItem)
        me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return me.camerongray.teamlocker.client.protobufs.Libsodium.internal_static_LibsodiumItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return me.camerongray.teamlocker.client.protobufs.Libsodium.internal_static_LibsodiumItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.class, me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.Builder.class);
      }

      // Construct using me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.newBuilder()
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
        data_ = com.google.protobuf.ByteString.EMPTY;

        nonce_ = com.google.protobuf.ByteString.EMPTY;

        opsLimit_ = 0L;

        memLimit_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.camerongray.teamlocker.client.protobufs.Libsodium.internal_static_LibsodiumItem_descriptor;
      }

      public me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem getDefaultInstanceForType() {
        return me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.getDefaultInstance();
      }

      public me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem build() {
        me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem buildPartial() {
        me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem result = new me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem(this);
        result.data_ = data_;
        result.nonce_ = nonce_;
        result.opsLimit_ = opsLimit_;
        result.memLimit_ = memLimit_;
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
        if (other instanceof me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem) {
          return mergeFrom((me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem other) {
        if (other == me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem.getDefaultInstance()) return this;
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        if (other.getNonce() != com.google.protobuf.ByteString.EMPTY) {
          setNonce(other.getNonce());
        }
        if (other.getOpsLimit() != 0L) {
          setOpsLimit(other.getOpsLimit());
        }
        if (other.getMemLimit() != 0L) {
          setMemLimit(other.getMemLimit());
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
        me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes data = 1;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>optional bytes data = 1;</code>
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
       * <code>optional bytes data = 1;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString nonce_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes nonce = 2;</code>
       */
      public com.google.protobuf.ByteString getNonce() {
        return nonce_;
      }
      /**
       * <code>optional bytes nonce = 2;</code>
       */
      public Builder setNonce(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nonce_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes nonce = 2;</code>
       */
      public Builder clearNonce() {
        
        nonce_ = getDefaultInstance().getNonce();
        onChanged();
        return this;
      }

      private long opsLimit_ ;
      /**
       * <code>optional int64 ops_limit = 3;</code>
       */
      public long getOpsLimit() {
        return opsLimit_;
      }
      /**
       * <code>optional int64 ops_limit = 3;</code>
       */
      public Builder setOpsLimit(long value) {
        
        opsLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 ops_limit = 3;</code>
       */
      public Builder clearOpsLimit() {
        
        opsLimit_ = 0L;
        onChanged();
        return this;
      }

      private long memLimit_ ;
      /**
       * <code>optional int64 mem_limit = 4;</code>
       */
      public long getMemLimit() {
        return memLimit_;
      }
      /**
       * <code>optional int64 mem_limit = 4;</code>
       */
      public Builder setMemLimit(long value) {
        
        memLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 mem_limit = 4;</code>
       */
      public Builder clearMemLimit() {
        
        memLimit_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:LibsodiumItem)
    }

    // @@protoc_insertion_point(class_scope:LibsodiumItem)
    private static final me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem();
    }

    public static me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LibsodiumItem>
        PARSER = new com.google.protobuf.AbstractParser<LibsodiumItem>() {
      public LibsodiumItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LibsodiumItem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LibsodiumItem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LibsodiumItem> getParserForType() {
      return PARSER;
    }

    public me.camerongray.teamlocker.client.protobufs.Libsodium.LibsodiumItem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LibsodiumItem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LibsodiumItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031protobufs/Libsodium.proto\"R\n\rLibsodium" +
      "Item\022\014\n\004data\030\001 \001(\014\022\r\n\005nonce\030\002 \001(\014\022\021\n\tops" +
      "_limit\030\003 \001(\003\022\021\n\tmem_limit\030\004 \001(\003B,\n*me.ca" +
      "merongray.teamlocker.client.protobufsb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_LibsodiumItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LibsodiumItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LibsodiumItem_descriptor,
        new java.lang.String[] { "Data", "Nonce", "OpsLimit", "MemLimit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
