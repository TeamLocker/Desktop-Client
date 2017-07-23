// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobufs/GetUser.proto

package me.camerongray.teamlocker.client.protobufs;

public final class GetUser {
  private GetUser() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUserResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUserResponse)
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
     * <code>.User user = 2;</code>
     */
    boolean hasUser();
    /**
     * <code>.User user = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.User getUser();
    /**
     * <code>.User user = 2;</code>
     */
    me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUserOrBuilder();
  }
  /**
   * Protobuf type {@code GetUserResponse}
   */
  public  static final class GetUserResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUserResponse)
      GetUserResponseOrBuilder {
    // Use GetUserResponse.newBuilder() to construct.
    private GetUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUserResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private GetUserResponse(
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
              me.camerongray.teamlocker.client.protobufs.Objects.User.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(me.camerongray.teamlocker.client.protobufs.Objects.User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

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
      return me.camerongray.teamlocker.client.protobufs.GetUser.internal_static_GetUserResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.camerongray.teamlocker.client.protobufs.GetUser.internal_static_GetUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.class, me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.Builder.class);
    }

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

    public static final int USER_FIELD_NUMBER = 2;
    private me.camerongray.teamlocker.client.protobufs.Objects.User user_;
    /**
     * <code>.User user = 2;</code>
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.User getUser() {
      return user_ == null ? me.camerongray.teamlocker.client.protobufs.Objects.User.getDefaultInstance() : user_;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUserOrBuilder() {
      return getUser();
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
      if (user_ != null) {
        output.writeMessage(2, getUser());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResult());
      }
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUser());
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
      if (!(obj instanceof me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse)) {
        return super.equals(obj);
      }
      me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse other = (me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
      }
      result = result && (hasUser() == other.hasUser());
      if (hasUser()) {
        result = result && getUser()
            .equals(other.getUser());
      }
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
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parseFrom(
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
    public static Builder newBuilder(me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse prototype) {
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
     * Protobuf type {@code GetUserResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUserResponse)
        me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return me.camerongray.teamlocker.client.protobufs.GetUser.internal_static_GetUserResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return me.camerongray.teamlocker.client.protobufs.GetUser.internal_static_GetUserResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.class, me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.Builder.class);
      }

      // Construct using me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.newBuilder()
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
        if (resultBuilder_ == null) {
          result_ = null;
        } else {
          result_ = null;
          resultBuilder_ = null;
        }
        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return me.camerongray.teamlocker.client.protobufs.GetUser.internal_static_GetUserResponse_descriptor;
      }

      public me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse getDefaultInstanceForType() {
        return me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.getDefaultInstance();
      }

      public me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse build() {
        me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse buildPartial() {
        me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse result = new me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse(this);
        if (resultBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
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
        if (other instanceof me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse) {
          return mergeFrom((me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse other) {
        if (other == me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
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
        me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private me.camerongray.teamlocker.client.protobufs.Objects.User user_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> userBuilder_;
      /**
       * <code>.User user = 2;</code>
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? me.camerongray.teamlocker.client.protobufs.Objects.User.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(me.camerongray.teamlocker.client.protobufs.Objects.User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(
          me.camerongray.teamlocker.client.protobufs.Objects.User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder mergeUser(me.camerongray.teamlocker.client.protobufs.Objects.User value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              me.camerongray.teamlocker.client.protobufs.Objects.User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.User.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.User user = 2;</code>
       */
      public me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              me.camerongray.teamlocker.client.protobufs.Objects.User.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.camerongray.teamlocker.client.protobufs.Objects.User, me.camerongray.teamlocker.client.protobufs.Objects.User.Builder, me.camerongray.teamlocker.client.protobufs.Objects.UserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:GetUserResponse)
    }

    // @@protoc_insertion_point(class_scope:GetUserResponse)
    private static final me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse();
    }

    public static me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUserResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetUserResponse>() {
      public GetUserResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetUserResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetUserResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUserResponse> getParserForType() {
      return PARSER;
    }

    public me.camerongray.teamlocker.client.protobufs.GetUser.GetUserResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUserResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027protobufs/GetUser.proto\032!protobufs/Mes" +
      "sageComponents.proto\032\027protobufs/Objects." +
      "proto\"H\n\017GetUserResponse\022 \n\006result\030\001 \001(\013" +
      "2\020.OperationResult\022\023\n\004user\030\002 \001(\0132\005.UserB" +
      ",\n*me.camerongray.teamlocker.client.prot" +
      "obufsb\006proto3"
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
    internal_static_GetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUserResponse_descriptor,
        new java.lang.String[] { "Result", "User", });
    me.camerongray.teamlocker.client.protobufs.MessageComponents.getDescriptor();
    me.camerongray.teamlocker.client.protobufs.Objects.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}