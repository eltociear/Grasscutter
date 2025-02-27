// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NavMeshStatsNotify.proto

package emu.grasscutter.net.proto;

public final class NavMeshStatsNotifyOuterClass {
  private NavMeshStatsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NavMeshStatsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NavMeshStatsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> 
        getInfosList();
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getInfos(int index);
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    int getInfosCount();
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder> 
        getInfosOrBuilderList();
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder getInfosOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2374
   * Obf: PLPMACOCIMJ
   * </pre>
   *
   * Protobuf type {@code NavMeshStatsNotify}
   */
  public static final class NavMeshStatsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NavMeshStatsNotify)
      NavMeshStatsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NavMeshStatsNotify.newBuilder() to construct.
    private NavMeshStatsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NavMeshStatsNotify() {
      infos_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NavMeshStatsNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NavMeshStatsNotify(
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                infos_ = new java.util.ArrayList<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              infos_.add(
                  input.readMessage(emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.parser(), extensionRegistry));
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
          infos_ = java.util.Collections.unmodifiableList(infos_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.internal_static_NavMeshStatsNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.internal_static_NavMeshStatsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.class, emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.Builder.class);
    }

    public static final int INFOS_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> infos_;
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> getInfosList() {
      return infos_;
    }
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder> 
        getInfosOrBuilderList() {
      return infos_;
    }
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    @java.lang.Override
    public int getInfosCount() {
      return infos_.size();
    }
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getInfos(int index) {
      return infos_.get(index);
    }
    /**
     * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder getInfosOrBuilder(
        int index) {
      return infos_.get(index);
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
      for (int i = 0; i < infos_.size(); i++) {
        output.writeMessage(9, infos_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < infos_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, infos_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify other = (emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify) obj;

      if (!getInfosList()
          .equals(other.getInfosList())) return false;
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
      if (getInfosCount() > 0) {
        hash = (37 * hash) + INFOS_FIELD_NUMBER;
        hash = (53 * hash) + getInfosList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify prototype) {
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
     * CmdId: 2374
     * Obf: PLPMACOCIMJ
     * </pre>
     *
     * Protobuf type {@code NavMeshStatsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NavMeshStatsNotify)
        emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.internal_static_NavMeshStatsNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.internal_static_NavMeshStatsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.class, emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.newBuilder()
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
          getInfosFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          infosBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.internal_static_NavMeshStatsNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify build() {
        emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify buildPartial() {
        emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify result = new emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify(this);
        int from_bitField0_ = bitField0_;
        if (infosBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            infos_ = java.util.Collections.unmodifiableList(infos_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.infos_ = infos_;
        } else {
          result.infos_ = infosBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify) {
          return mergeFrom((emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify other) {
        if (other == emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify.getDefaultInstance()) return this;
        if (infosBuilder_ == null) {
          if (!other.infos_.isEmpty()) {
            if (infos_.isEmpty()) {
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInfosIsMutable();
              infos_.addAll(other.infos_);
            }
            onChanged();
          }
        } else {
          if (!other.infos_.isEmpty()) {
            if (infosBuilder_.isEmpty()) {
              infosBuilder_.dispose();
              infosBuilder_ = null;
              infos_ = other.infos_;
              bitField0_ = (bitField0_ & ~0x00000001);
              infosBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInfosFieldBuilder() : null;
            } else {
              infosBuilder_.addAllMessages(other.infos_);
            }
          }
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
        emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> infos_ =
        java.util.Collections.emptyList();
      private void ensureInfosIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          infos_ = new java.util.ArrayList<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo>(infos_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder> infosBuilder_;

      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> getInfosList() {
        if (infosBuilder_ == null) {
          return java.util.Collections.unmodifiableList(infos_);
        } else {
          return infosBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public int getInfosCount() {
        if (infosBuilder_ == null) {
          return infos_.size();
        } else {
          return infosBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getInfos(int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);
        } else {
          return infosBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder setInfos(
          int index, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.set(index, value);
          onChanged();
        } else {
          infosBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder setInfos(
          int index, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.set(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder addInfos(emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(value);
          onChanged();
        } else {
          infosBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder addInfos(
          int index, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo value) {
        if (infosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInfosIsMutable();
          infos_.add(index, value);
          onChanged();
        } else {
          infosBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder addInfos(
          emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder addInfos(
          int index, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder builderForValue) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.add(index, builderForValue.build());
          onChanged();
        } else {
          infosBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder addAllInfos(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo> values) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, infos_);
          onChanged();
        } else {
          infosBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder clearInfos() {
        if (infosBuilder_ == null) {
          infos_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          infosBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public Builder removeInfos(int index) {
        if (infosBuilder_ == null) {
          ensureInfosIsMutable();
          infos_.remove(index);
          onChanged();
        } else {
          infosBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder getInfosBuilder(
          int index) {
        return getInfosFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder getInfosOrBuilder(
          int index) {
        if (infosBuilder_ == null) {
          return infos_.get(index);  } else {
          return infosBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder> 
           getInfosOrBuilderList() {
        if (infosBuilder_ != null) {
          return infosBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(infos_);
        }
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder addInfosBuilder() {
        return getInfosFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder addInfosBuilder(
          int index) {
        return getInfosFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PbNavMeshStatsInfo infos = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder> 
           getInfosBuilderList() {
        return getInfosFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder> 
          getInfosFieldBuilder() {
        if (infosBuilder_ == null) {
          infosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder>(
                  infos_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          infos_ = null;
        }
        return infosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NavMeshStatsNotify)
    }

    // @@protoc_insertion_point(class_scope:NavMeshStatsNotify)
    private static final emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify();
    }

    public static emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NavMeshStatsNotify>
        PARSER = new com.google.protobuf.AbstractParser<NavMeshStatsNotify>() {
      @java.lang.Override
      public NavMeshStatsNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NavMeshStatsNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NavMeshStatsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NavMeshStatsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NavMeshStatsNotifyOuterClass.NavMeshStatsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NavMeshStatsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NavMeshStatsNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030NavMeshStatsNotify.proto\032\030PbNavMeshSta" +
      "tsInfo.proto\"8\n\022NavMeshStatsNotify\022\"\n\005in" +
      "fos\030\t \003(\0132\023.PbNavMeshStatsInfoB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.getDescriptor(),
        });
    internal_static_NavMeshStatsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NavMeshStatsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NavMeshStatsNotify_descriptor,
        new java.lang.String[] { "Infos", });
    emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
