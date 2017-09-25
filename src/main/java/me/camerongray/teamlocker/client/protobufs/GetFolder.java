// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobufs/GetFolder.proto

package me.camerongray.teamlocker.client.protobufs;

public final class GetFolder {
  private GetFolder() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFolderResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFolderResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.OperationResult result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>.OperationResult result = 1;</code>
     */
    me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult getResult();
    /**
     * <code>.OperationResult result = 1;</code>
     */
    me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder getResultOrBuilder();

    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder> 
        getFoldersList();
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.Folder getFolders(int index);
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    int getFoldersCount();
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder> 
        getFoldersOrBuilderList();
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder getFoldersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetFolderResponse}
   */
  public  static final class GetFolderResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFolderResponse)
      GetFolderResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFolderResponse.newBuilder() to construct.
    private GetFolderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFolderResponse() {
      folders_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetFolderResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder subBuilder = null;
              if (result_ != null) {
                subBuilder = result_.toBuilder();
              }
              result_ = input.readMessage(me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(result_);
                result_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                folders_ = new java.util.ArrayList<me.camerongray.teamlocker.client.protobufs.Objects.Folder>();
                mutable_bitField0_ |= 0x00000002;
              }
              folders_.add(
                  input.readMessage(me.camerongray.teamlocker.client.protobufs.Objects.Folder.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          folders_ = java.util.Collections.unmodifiableList(folders_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.camerongray.teamlocker.client.protobufs.GetFolder.internal_static_GetFolderResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.camerongray.teamlocker.client.protobufs.GetFolder.internal_static_GetFolderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.class, me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.Builder.class);
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult result_;
    /**
     * <code>.OperationResult result = 1;</code>
     */
    public boolean hasResult() {
      return result_ != null;
    }
    /**
     * <code>.OperationResult result = 1;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult getResult() {
      return result_ == null ? me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.getDefaultInstance() : result_;
    }
    /**
     * <code>.OperationResult result = 1;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder getResultOrBuilder() {
      return getResult();
    }

    public static final int FOLDERS_FIELD_NUMBER = 2;
    private java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder> folders_;
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder> getFoldersList() {
      return folders_;
    }
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    public java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder> 
        getFoldersOrBuilderList() {
      return folders_;
    }
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    public int getFoldersCount() {
      return folders_.size();
    }
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.Folder getFolders(int index) {
      return folders_.get(index);
    }
    /**
     * <code>repeated .Folder folders = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder getFoldersOrBuilder(
        int index) {
      return folders_.get(index);
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
      if (result_ != null) {
        output.writeMessage(1, getResult());
      }
      for (int i = 0; i < folders_.size(); i++) {
        output.writeMessage(2, folders_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResult());
      }
      for (int i = 0; i < folders_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, folders_.get(i));
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
      if (!(obj instanceof me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse)) {
        return super.equals(obj);
      }
      me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse other = (me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
      }
      result = result && getFoldersList()
          .equals(other.getFoldersList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
      }
      if (getFoldersCount() > 0) {
        hash = (37 * hash) + FOLDERS_FIELD_NUMBER;
        hash = (53 * hash) + getFoldersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parseFrom(
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
    public static Builder newBuilder(me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse prototype) {
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
     * Protobuf type {@code GetFolderResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFolderResponse)
        me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return me.camerongray.teamlocker.client.protobufs.GetFolder.internal_static_GetFolderResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return me.camerongray.teamlocker.client.protobufs.GetFolder.internal_static_GetFolderResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.class, me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.Builder.class);
      }

      // Construct using me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.newBuilder()
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
          getFoldersFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (resultBuilder_ == null) {
          result_ = null;
        } else {
          result_ = null;
          resultBuilder_ = null;
        }
        if (foldersBuilder_ == null) {
          folders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          foldersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.camerongray.teamlocker.client.protobufs.GetFolder.internal_static_GetFolderResponse_descriptor;
      }

      public me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse getDefaultInstanceForType() {
        return me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.getDefaultInstance();
      }

      public me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse build() {
        me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse buildPartial() {
        me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse result = new me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (resultBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
        if (foldersBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            folders_ = java.util.Collections.unmodifiableList(folders_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.folders_ = folders_;
        } else {
          result.folders_ = foldersBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse) {
          return mergeFrom((me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse other) {
        if (other == me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
        }
        if (foldersBuilder_ == null) {
          if (!other.folders_.isEmpty()) {
            if (folders_.isEmpty()) {
              folders_ = other.folders_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFoldersIsMutable();
              folders_.addAll(other.folders_);
            }
            onChanged();
          }
        } else {
          if (!other.folders_.isEmpty()) {
            if (foldersBuilder_.isEmpty()) {
              foldersBuilder_.dispose();
              foldersBuilder_ = null;
              folders_ = other.folders_;
              bitField0_ = (bitField0_ & ~0x00000002);
              foldersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFoldersFieldBuilder() : null;
            } else {
              foldersBuilder_.addAllMessages(other.folders_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult result_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder> resultBuilder_;
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public boolean hasResult() {
        return resultBuilder_ != null || result_ != null;
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult getResult() {
        if (resultBuilder_ == null) {
          return result_ == null ? me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.getDefaultInstance() : result_;
        } else {
          return resultBuilder_.getMessage();
        }
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public Builder setResult(me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          result_ = value;
          onChanged();
        } else {
          resultBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public Builder setResult(
          me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder builderForValue) {
        if (resultBuilder_ == null) {
          result_ = builderForValue.build();
          onChanged();
        } else {
          resultBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public Builder mergeResult(me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult value) {
        if (resultBuilder_ == null) {
          if (result_ != null) {
            result_ =
              me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.newBuilder(result_).mergeFrom(value).buildPartial();
          } else {
            result_ = value;
          }
          onChanged();
        } else {
          resultBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = null;
          onChanged();
        } else {
          result_ = null;
          resultBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder getResultBuilder() {
        
        onChanged();
        return getResultFieldBuilder().getBuilder();
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder getResultOrBuilder() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilder();
        } else {
          return result_ == null ?
              me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.getDefaultInstance() : result_;
        }
      }
      /**
       * <code>.OperationResult result = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResult.Builder, me.camerongray.teamlocker.client.protobufs.MessageComponents.OperationResultOrBuilder>(
                  getResult(),
                  getParentForChildren(),
                  isClean());
          result_ = null;
        }
        return resultBuilder_;
      }

      private java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder> folders_ =
        java.util.Collections.emptyList();
      private void ensureFoldersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          folders_ = new java.util.ArrayList<me.camerongray.teamlocker.client.protobufs.Objects.Folder>(folders_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.Folder, me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder, me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder> foldersBuilder_;

      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder> getFoldersList() {
        if (foldersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(folders_);
        } else {
          return foldersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public int getFoldersCount() {
        if (foldersBuilder_ == null) {
          return folders_.size();
        } else {
          return foldersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.Folder getFolders(int index) {
        if (foldersBuilder_ == null) {
          return folders_.get(index);
        } else {
          return foldersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder setFolders(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.Folder value) {
        if (foldersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoldersIsMutable();
          folders_.set(index, value);
          onChanged();
        } else {
          foldersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder setFolders(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder builderForValue) {
        if (foldersBuilder_ == null) {
          ensureFoldersIsMutable();
          folders_.set(index, builderForValue.build());
          onChanged();
        } else {
          foldersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder addFolders(me.camerongray.teamlocker.client.protobufs.Objects.Folder value) {
        if (foldersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoldersIsMutable();
          folders_.add(value);
          onChanged();
        } else {
          foldersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder addFolders(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.Folder value) {
        if (foldersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoldersIsMutable();
          folders_.add(index, value);
          onChanged();
        } else {
          foldersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder addFolders(
          me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder builderForValue) {
        if (foldersBuilder_ == null) {
          ensureFoldersIsMutable();
          folders_.add(builderForValue.build());
          onChanged();
        } else {
          foldersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder addFolders(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder builderForValue) {
        if (foldersBuilder_ == null) {
          ensureFoldersIsMutable();
          folders_.add(index, builderForValue.build());
          onChanged();
        } else {
          foldersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder addAllFolders(
          java.lang.Iterable<? extends me.camerongray.teamlocker.client.protobufs.Objects.Folder> values) {
        if (foldersBuilder_ == null) {
          ensureFoldersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, folders_);
          onChanged();
        } else {
          foldersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder clearFolders() {
        if (foldersBuilder_ == null) {
          folders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          foldersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public Builder removeFolders(int index) {
        if (foldersBuilder_ == null) {
          ensureFoldersIsMutable();
          folders_.remove(index);
          onChanged();
        } else {
          foldersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder getFoldersBuilder(
          int index) {
        return getFoldersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder getFoldersOrBuilder(
          int index) {
        if (foldersBuilder_ == null) {
          return folders_.get(index);  } else {
          return foldersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder> 
           getFoldersOrBuilderList() {
        if (foldersBuilder_ != null) {
          return foldersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(folders_);
        }
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder addFoldersBuilder() {
        return getFoldersFieldBuilder().addBuilder(
            me.camerongray.teamlocker.client.protobufs.Objects.Folder.getDefaultInstance());
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder addFoldersBuilder(
          int index) {
        return getFoldersFieldBuilder().addBuilder(
            index, me.camerongray.teamlocker.client.protobufs.Objects.Folder.getDefaultInstance());
      }
      /**
       * <code>repeated .Folder folders = 2;</code>
       */
      public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder> 
           getFoldersBuilderList() {
        return getFoldersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.Folder, me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder, me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder> 
          getFoldersFieldBuilder() {
        if (foldersBuilder_ == null) {
          foldersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              me.camerongray.teamlocker.client.protobufs.Objects.Folder, me.camerongray.teamlocker.client.protobufs.Objects.Folder.Builder, me.camerongray.teamlocker.client.protobufs.Objects.FolderOrBuilder>(
                  folders_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          folders_ = null;
        }
        return foldersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetFolderResponse)
    }

    // @@protoc_insertion_point(class_scope:GetFolderResponse)
    private static final me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse();
    }

    public static me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFolderResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetFolderResponse>() {
      public GetFolderResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetFolderResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetFolderResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFolderResponse> getParserForType() {
      return PARSER;
    }

    public me.camerongray.teamlocker.client.protobufs.GetFolder.GetFolderResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFolderResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFolderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031protobufs/GetFolder.proto\032!protobufs/M" +
      "essageComponents.proto\032\027protobufs/Object" +
      "s.proto\"O\n\021GetFolderResponse\022 \n\006result\030\001" +
      " \001(\0132\020.OperationResult\022\030\n\007folders\030\002 \003(\0132" +
      "\007.FolderB,\n*me.camerongray.teamlocker.cl" +
      "ient.protobufsb\006proto3"
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
          me.camerongray.teamlocker.client.protobufs.MessageComponents.getDescriptor(),
          me.camerongray.teamlocker.client.protobufs.Objects.getDescriptor(),
        }, assigner);
    internal_static_GetFolderResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFolderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFolderResponse_descriptor,
        new java.lang.String[] { "Result", "Folders", });
    me.camerongray.teamlocker.client.protobufs.MessageComponents.getDescriptor();
    me.camerongray.teamlocker.client.protobufs.Objects.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
