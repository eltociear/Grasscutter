// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowMessageNotify.proto

package emu.grasscutter.net.proto;

public final class ShowMessageNotifyOuterClass {
  private ShowMessageNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowMessageNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowMessageNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> 
        getParamsList();
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam getParams(int index);
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    int getParamsCount();
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder> 
        getParamsOrBuilderList();
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder getParamsOrBuilder(
        int index);

    /**
     * <code>.SvrMsgId msg_id = 3;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    int getMsgIdValue();
    /**
     * <code>.SvrMsgId msg_id = 3;</code>
     * @return The msgId.
     */
    emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId getMsgId();
  }
  /**
   * <pre>
   * CmdId: 72
   * Obf: DGHMHACLEJA
   * </pre>
   *
   * Protobuf type {@code ShowMessageNotify}
   */
  public static final class ShowMessageNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowMessageNotify)
      ShowMessageNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowMessageNotify.newBuilder() to construct.
    private ShowMessageNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowMessageNotify() {
      params_ = java.util.Collections.emptyList();
      msgId_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowMessageNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShowMessageNotify(
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
            case 24: {
              int rawValue = input.readEnum();

              msgId_ = rawValue;
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                params_ = new java.util.ArrayList<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              params_.add(
                  input.readMessage(emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.parser(), extensionRegistry));
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
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.internal_static_ShowMessageNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.internal_static_ShowMessageNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.class, emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> params_;
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> getParamsList() {
      return params_;
    }
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder> 
        getParamsOrBuilderList() {
      return params_;
    }
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    @java.lang.Override
    public int getParamsCount() {
      return params_.size();
    }
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam getParams(int index) {
      return params_.get(index);
    }
    /**
     * <code>repeated .MsgParam params = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder getParamsOrBuilder(
        int index) {
      return params_.get(index);
    }

    public static final int MSG_ID_FIELD_NUMBER = 3;
    private int msgId_;
    /**
     * <code>.SvrMsgId msg_id = 3;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <code>.SvrMsgId msg_id = 3;</code>
     * @return The msgId.
     */
    @java.lang.Override public emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId getMsgId() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId result = emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.valueOf(msgId_);
      return result == null ? emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.UNRECOGNIZED : result;
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
      if (msgId_ != emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.MSG_UNKNOWN.getNumber()) {
        output.writeEnum(3, msgId_);
      }
      for (int i = 0; i < params_.size(); i++) {
        output.writeMessage(5, params_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (msgId_ != emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.MSG_UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, msgId_);
      }
      for (int i = 0; i < params_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, params_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify other = (emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify) obj;

      if (!getParamsList()
          .equals(other.getParamsList())) return false;
      if (msgId_ != other.msgId_) return false;
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
      if (getParamsCount() > 0) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParamsList().hashCode();
      }
      hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
      hash = (53 * hash) + msgId_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify prototype) {
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
     * CmdId: 72
     * Obf: DGHMHACLEJA
     * </pre>
     *
     * Protobuf type {@code ShowMessageNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowMessageNotify)
        emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.internal_static_ShowMessageNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.internal_static_ShowMessageNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.class, emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.newBuilder()
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
          getParamsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (paramsBuilder_ == null) {
          params_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          paramsBuilder_.clear();
        }
        msgId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.internal_static_ShowMessageNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify build() {
        emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify buildPartial() {
        emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify result = new emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify(this);
        int from_bitField0_ = bitField0_;
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            params_ = java.util.Collections.unmodifiableList(params_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.params_ = params_;
        } else {
          result.params_ = paramsBuilder_.build();
        }
        result.msgId_ = msgId_;
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
        if (other instanceof emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify other) {
        if (other == emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify.getDefaultInstance()) return this;
        if (paramsBuilder_ == null) {
          if (!other.params_.isEmpty()) {
            if (params_.isEmpty()) {
              params_ = other.params_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureParamsIsMutable();
              params_.addAll(other.params_);
            }
            onChanged();
          }
        } else {
          if (!other.params_.isEmpty()) {
            if (paramsBuilder_.isEmpty()) {
              paramsBuilder_.dispose();
              paramsBuilder_ = null;
              params_ = other.params_;
              bitField0_ = (bitField0_ & ~0x00000001);
              paramsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getParamsFieldBuilder() : null;
            } else {
              paramsBuilder_.addAllMessages(other.params_);
            }
          }
        }
        if (other.msgId_ != 0) {
          setMsgIdValue(other.getMsgIdValue());
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
        emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> params_ =
        java.util.Collections.emptyList();
      private void ensureParamsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          params_ = new java.util.ArrayList<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam>(params_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder> paramsBuilder_;

      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> getParamsList() {
        if (paramsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(params_);
        } else {
          return paramsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public int getParamsCount() {
        if (paramsBuilder_ == null) {
          return params_.size();
        } else {
          return paramsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam getParams(int index) {
        if (paramsBuilder_ == null) {
          return params_.get(index);
        } else {
          return paramsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder setParams(
          int index, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParamsIsMutable();
          params_.set(index, value);
          onChanged();
        } else {
          paramsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder setParams(
          int index, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          ensureParamsIsMutable();
          params_.set(index, builderForValue.build());
          onChanged();
        } else {
          paramsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder addParams(emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParamsIsMutable();
          params_.add(value);
          onChanged();
        } else {
          paramsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder addParams(
          int index, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParamsIsMutable();
          params_.add(index, value);
          onChanged();
        } else {
          paramsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder addParams(
          emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          ensureParamsIsMutable();
          params_.add(builderForValue.build());
          onChanged();
        } else {
          paramsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder addParams(
          int index, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          ensureParamsIsMutable();
          params_.add(index, builderForValue.build());
          onChanged();
        } else {
          paramsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder addAllParams(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam> values) {
        if (paramsBuilder_ == null) {
          ensureParamsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, params_);
          onChanged();
        } else {
          paramsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder clearParams() {
        if (paramsBuilder_ == null) {
          params_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          paramsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public Builder removeParams(int index) {
        if (paramsBuilder_ == null) {
          ensureParamsIsMutable();
          params_.remove(index);
          onChanged();
        } else {
          paramsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder getParamsBuilder(
          int index) {
        return getParamsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder getParamsOrBuilder(
          int index) {
        if (paramsBuilder_ == null) {
          return params_.get(index);  } else {
          return paramsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder> 
           getParamsOrBuilderList() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(params_);
        }
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder addParamsBuilder() {
        return getParamsFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.getDefaultInstance());
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder addParamsBuilder(
          int index) {
        return getParamsFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.getDefaultInstance());
      }
      /**
       * <code>repeated .MsgParam params = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder> 
           getParamsBuilderList() {
        return getParamsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParam.Builder, emu.grasscutter.net.proto.MsgParamOuterClass.MsgParamOrBuilder>(
                  params_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private int msgId_ = 0;
      /**
       * <code>.SvrMsgId msg_id = 3;</code>
       * @return The enum numeric value on the wire for msgId.
       */
      @java.lang.Override public int getMsgIdValue() {
        return msgId_;
      }
      /**
       * <code>.SvrMsgId msg_id = 3;</code>
       * @param value The enum numeric value on the wire for msgId to set.
       * @return This builder for chaining.
       */
      public Builder setMsgIdValue(int value) {
        
        msgId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SvrMsgId msg_id = 3;</code>
       * @return The msgId.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId getMsgId() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId result = emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.valueOf(msgId_);
        return result == null ? emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId.UNRECOGNIZED : result;
      }
      /**
       * <code>.SvrMsgId msg_id = 3;</code>
       * @param value The msgId to set.
       * @return This builder for chaining.
       */
      public Builder setMsgId(emu.grasscutter.net.proto.SvrMsgIdOuterClass.SvrMsgId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        msgId_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SvrMsgId msg_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsgId() {
        
        msgId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ShowMessageNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowMessageNotify)
    private static final emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify();
    }

    public static emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowMessageNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowMessageNotify>() {
      @java.lang.Override
      public ShowMessageNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShowMessageNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShowMessageNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowMessageNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ShowMessageNotifyOuterClass.ShowMessageNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowMessageNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowMessageNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ShowMessageNotify.proto\032\016MsgParam.prot" +
      "o\032\016SvrMsgId.proto\"I\n\021ShowMessageNotify\022\031" +
      "\n\006params\030\005 \003(\0132\t.MsgParam\022\031\n\006msg_id\030\003 \001(" +
      "\0162\t.SvrMsgIdB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MsgParamOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.SvrMsgIdOuterClass.getDescriptor(),
        });
    internal_static_ShowMessageNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowMessageNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowMessageNotify_descriptor,
        new java.lang.String[] { "Params", "MsgId", });
    emu.grasscutter.net.proto.MsgParamOuterClass.getDescriptor();
    emu.grasscutter.net.proto.SvrMsgIdOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
