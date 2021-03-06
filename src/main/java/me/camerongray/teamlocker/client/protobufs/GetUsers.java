// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobufs/GetUsers.proto

package me.camerongray.teamlocker.client.protobufs;

public final class GetUsers {
  private GetUsers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUsersResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUsersResponse)
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
     * <code>repeated .User users = 2;</code>
     */
    java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User> 
        getUsersList();
    /**
     * <code>repeated .User users = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.User getUsers(int index);
    /**
     * <code>repeated .User users = 2;</code>
     */
    int getUsersCount();
    /**
     * <code>repeated .User users = 2;</code>
     */
    java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> 
        getUsersOrBuilderList();
    /**
     * <code>repeated .User users = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUsersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetUsersResponse}
   */
  public  static final class GetUsersResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUsersResponse)
      GetUsersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUsersResponse.newBuilder() to construct.
    private GetUsersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUsersResponse() {
      users_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetUsersResponse(
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
                users_ = new java.util.ArrayList<me.camerongray.teamlocker.client.protobufs.Objects.User>();
                mutable_bitField0_ |= 0x00000002;
              }
              users_.add(
                  input.readMessage(me.camerongray.teamlocker.client.protobufs.Objects.User.parser(), extensionRegistry));
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
          users_ = java.util.Collections.unmodifiableList(users_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.camerongray.teamlocker.client.protobufs.GetUsers.internal_static_GetUsersResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.camerongray.teamlocker.client.protobufs.GetUsers.internal_static_GetUsersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.class, me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.Builder.class);
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

    public static final int USERS_FIELD_NUMBER = 2;
    private java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User> users_;
    /**
     * <code>repeated .User users = 2;</code>
     */
    public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User> getUsersList() {
      return users_;
    }
    /**
     * <code>repeated .User users = 2;</code>
     */
    public java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> 
        getUsersOrBuilderList() {
      return users_;
    }
    /**
     * <code>repeated .User users = 2;</code>
     */
    public int getUsersCount() {
      return users_.size();
    }
    /**
     * <code>repeated .User users = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.User getUsers(int index) {
      return users_.get(index);
    }
    /**
     * <code>repeated .User users = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUsersOrBuilder(
        int index) {
      return users_.get(index);
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
      for (int i = 0; i < users_.size(); i++) {
        output.writeMessage(2, users_.get(i));
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
      for (int i = 0; i < users_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, users_.get(i));
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
      if (!(obj instanceof me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse)) {
        return super.equals(obj);
      }
      me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse other = (me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
      }
      result = result && getUsersList()
          .equals(other.getUsersList());
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
      if (getUsersCount() > 0) {
        hash = (37 * hash) + USERS_FIELD_NUMBER;
        hash = (53 * hash) + getUsersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parseFrom(
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
    public static Builder newBuilder(me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse prototype) {
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
     * Protobuf type {@code GetUsersResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUsersResponse)
        me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return me.camerongray.teamlocker.client.protobufs.GetUsers.internal_static_GetUsersResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return me.camerongray.teamlocker.client.protobufs.GetUsers.internal_static_GetUsersResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.class, me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.Builder.class);
      }

      // Construct using me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.newBuilder()
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
          getUsersFieldBuilder();
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
        if (usersBuilder_ == null) {
          users_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          usersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.camerongray.teamlocker.client.protobufs.GetUsers.internal_static_GetUsersResponse_descriptor;
      }

      public me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse getDefaultInstanceForType() {
        return me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.getDefaultInstance();
      }

      public me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse build() {
        me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse buildPartial() {
        me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse result = new me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (resultBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
        if (usersBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            users_ = java.util.Collections.unmodifiableList(users_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.users_ = users_;
        } else {
          result.users_ = usersBuilder_.build();
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
        if (other instanceof me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse) {
          return mergeFrom((me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse other) {
        if (other == me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
        }
        if (usersBuilder_ == null) {
          if (!other.users_.isEmpty()) {
            if (users_.isEmpty()) {
              users_ = other.users_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureUsersIsMutable();
              users_.addAll(other.users_);
            }
            onChanged();
          }
        } else {
          if (!other.users_.isEmpty()) {
            if (usersBuilder_.isEmpty()) {
              usersBuilder_.dispose();
              usersBuilder_ = null;
              users_ = other.users_;
              bitField0_ = (bitField0_ & ~0x00000002);
              usersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUsersFieldBuilder() : null;
            } else {
              usersBuilder_.addAllMessages(other.users_);
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
        me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse) e.getUnfinishedMessage();
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

      private java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User> users_ =
        java.util.Collections.emptyList();
      private void ensureUsersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          users_ = new java.util.ArrayList<me.camerongray.teamlocker.client.protobufs.Objects.User>(users_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> usersBuilder_;

      /**
       * <code>repeated .User users = 2;</code>
       */
      public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User> getUsersList() {
        if (usersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(users_);
        } else {
          return usersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public int getUsersCount() {
        if (usersBuilder_ == null) {
          return users_.size();
        } else {
          return usersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User getUsers(int index) {
        if (usersBuilder_ == null) {
          return users_.get(index);
        } else {
          return usersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder setUsers(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.User value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.set(index, value);
          onChanged();
        } else {
          usersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder setUsers(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.set(index, builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder addUsers(me.camerongray.teamlocker.client.protobufs.Objects.User value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.add(value);
          onChanged();
        } else {
          usersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder addUsers(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.User value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.add(index, value);
          onChanged();
        } else {
          usersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder addUsers(
          me.camerongray.teamlocker.client.protobufs.Objects.User.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.add(builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder addUsers(
          int index, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.add(index, builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder addAllUsers(
          java.lang.Iterable<? extends me.camerongray.teamlocker.client.protobufs.Objects.User> values) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, users_);
          onChanged();
        } else {
          usersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder clearUsers() {
        if (usersBuilder_ == null) {
          users_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          usersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public Builder removeUsers(int index) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.remove(index);
          onChanged();
        } else {
          usersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User.Builder getUsersBuilder(
          int index) {
        return getUsersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUsersOrBuilder(
          int index) {
        if (usersBuilder_ == null) {
          return users_.get(index);  } else {
          return usersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public java.util.List<? extends me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> 
           getUsersOrBuilderList() {
        if (usersBuilder_ != null) {
          return usersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(users_);
        }
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User.Builder addUsersBuilder() {
        return getUsersFieldBuilder().addBuilder(
            me.camerongray.teamlocker.client.protobufs.Objects.User.getDefaultInstance());
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User.Builder addUsersBuilder(
          int index) {
        return getUsersFieldBuilder().addBuilder(
            index, me.camerongray.teamlocker.client.protobufs.Objects.User.getDefaultInstance());
      }
      /**
       * <code>repeated .User users = 2;</code>
       */
      public java.util.List<me.camerongray.teamlocker.client.protobufs.Objects.User.Builder> 
           getUsersBuilderList() {
        return getUsersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> 
          getUsersFieldBuilder() {
        if (usersBuilder_ == null) {
          usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder>(
                  users_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          users_ = null;
        }
        return usersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetUsersResponse)
    }

    // @@protoc_insertion_point(class_scope:GetUsersResponse)
    private static final me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse();
    }

    public static me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUsersResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetUsersResponse>() {
      public GetUsersResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetUsersResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetUsersResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUsersResponse> getParserForType() {
      return PARSER;
    }

    public me.camerongray.teamlocker.client.protobufs.GetUsers.GetUsersResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUsersResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUsersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030protobufs/GetUsers.proto\032!protobufs/Me" +
      "ssageComponents.proto\032\027protobufs/Objects" +
      ".proto\"J\n\020GetUsersResponse\022 \n\006result\030\001 \001" +
      "(\0132\020.OperationResult\022\024\n\005users\030\002 \003(\0132\005.Us" +
      "erB,\n*me.camerongray.teamlocker.client.p" +
      "rotobufsb\006proto3"
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
    internal_static_GetUsersResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUsersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUsersResponse_descriptor,
        new java.lang.String[] { "Result", "Users", });
    me.camerongray.teamlocker.client.protobufs.MessageComponents.getDescriptor();
    me.camerongray.teamlocker.client.protobufs.Objects.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
