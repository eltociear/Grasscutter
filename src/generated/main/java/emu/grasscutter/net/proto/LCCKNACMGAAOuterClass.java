// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LCCKNACMGAA.proto

package emu.grasscutter.net.proto;

public final class LCCKNACMGAAOuterClass {
  private LCCKNACMGAAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LCCKNACMGAAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LCCKNACMGAA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rot = 7;</code>
     * @return The rot.
     */
    int getRot();

    /**
     * <code>uint32 NCMDODEBLNP = 5;</code>
     * @return The nCMDODEBLNP.
     */
    int getNCMDODEBLNP();

    /**
     * <code>float NIFGPAGNHDI = 2;</code>
     * @return The nIFGPAGNHDI.
     */
    float getNIFGPAGNHDI();

    /**
     * <code>float AKHGPBLEJIF = 1;</code>
     * @return The aKHGPBLEJIF.
     */
    float getAKHGPBLEJIF();
  }
  /**
   * Protobuf type {@code LCCKNACMGAA}
   */
  public static final class LCCKNACMGAA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LCCKNACMGAA)
      LCCKNACMGAAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LCCKNACMGAA.newBuilder() to construct.
    private LCCKNACMGAA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LCCKNACMGAA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LCCKNACMGAA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LCCKNACMGAA(
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
            case 13: {

              aKHGPBLEJIF_ = input.readFloat();
              break;
            }
            case 21: {

              nIFGPAGNHDI_ = input.readFloat();
              break;
            }
            case 40: {

              nCMDODEBLNP_ = input.readUInt32();
              break;
            }
            case 56: {

              rot_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.internal_static_LCCKNACMGAA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.internal_static_LCCKNACMGAA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.class, emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.Builder.class);
    }

    public static final int ROT_FIELD_NUMBER = 7;
    private int rot_;
    /**
     * <code>uint32 rot = 7;</code>
     * @return The rot.
     */
    @java.lang.Override
    public int getRot() {
      return rot_;
    }

    public static final int NCMDODEBLNP_FIELD_NUMBER = 5;
    private int nCMDODEBLNP_;
    /**
     * <code>uint32 NCMDODEBLNP = 5;</code>
     * @return The nCMDODEBLNP.
     */
    @java.lang.Override
    public int getNCMDODEBLNP() {
      return nCMDODEBLNP_;
    }

    public static final int NIFGPAGNHDI_FIELD_NUMBER = 2;
    private float nIFGPAGNHDI_;
    /**
     * <code>float NIFGPAGNHDI = 2;</code>
     * @return The nIFGPAGNHDI.
     */
    @java.lang.Override
    public float getNIFGPAGNHDI() {
      return nIFGPAGNHDI_;
    }

    public static final int AKHGPBLEJIF_FIELD_NUMBER = 1;
    private float aKHGPBLEJIF_;
    /**
     * <code>float AKHGPBLEJIF = 1;</code>
     * @return The aKHGPBLEJIF.
     */
    @java.lang.Override
    public float getAKHGPBLEJIF() {
      return aKHGPBLEJIF_;
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
      if (aKHGPBLEJIF_ != 0F) {
        output.writeFloat(1, aKHGPBLEJIF_);
      }
      if (nIFGPAGNHDI_ != 0F) {
        output.writeFloat(2, nIFGPAGNHDI_);
      }
      if (nCMDODEBLNP_ != 0) {
        output.writeUInt32(5, nCMDODEBLNP_);
      }
      if (rot_ != 0) {
        output.writeUInt32(7, rot_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (aKHGPBLEJIF_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, aKHGPBLEJIF_);
      }
      if (nIFGPAGNHDI_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, nIFGPAGNHDI_);
      }
      if (nCMDODEBLNP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, nCMDODEBLNP_);
      }
      if (rot_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, rot_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA other = (emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA) obj;

      if (getRot()
          != other.getRot()) return false;
      if (getNCMDODEBLNP()
          != other.getNCMDODEBLNP()) return false;
      if (java.lang.Float.floatToIntBits(getNIFGPAGNHDI())
          != java.lang.Float.floatToIntBits(
              other.getNIFGPAGNHDI())) return false;
      if (java.lang.Float.floatToIntBits(getAKHGPBLEJIF())
          != java.lang.Float.floatToIntBits(
              other.getAKHGPBLEJIF())) return false;
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
      hash = (37 * hash) + ROT_FIELD_NUMBER;
      hash = (53 * hash) + getRot();
      hash = (37 * hash) + NCMDODEBLNP_FIELD_NUMBER;
      hash = (53 * hash) + getNCMDODEBLNP();
      hash = (37 * hash) + NIFGPAGNHDI_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getNIFGPAGNHDI());
      hash = (37 * hash) + AKHGPBLEJIF_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAKHGPBLEJIF());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA prototype) {
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
     * Protobuf type {@code LCCKNACMGAA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LCCKNACMGAA)
        emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.internal_static_LCCKNACMGAA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.internal_static_LCCKNACMGAA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.class, emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.newBuilder()
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
        rot_ = 0;

        nCMDODEBLNP_ = 0;

        nIFGPAGNHDI_ = 0F;

        aKHGPBLEJIF_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.internal_static_LCCKNACMGAA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA build() {
        emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA buildPartial() {
        emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA result = new emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA(this);
        result.rot_ = rot_;
        result.nCMDODEBLNP_ = nCMDODEBLNP_;
        result.nIFGPAGNHDI_ = nIFGPAGNHDI_;
        result.aKHGPBLEJIF_ = aKHGPBLEJIF_;
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
        if (other instanceof emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA) {
          return mergeFrom((emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA other) {
        if (other == emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA.getDefaultInstance()) return this;
        if (other.getRot() != 0) {
          setRot(other.getRot());
        }
        if (other.getNCMDODEBLNP() != 0) {
          setNCMDODEBLNP(other.getNCMDODEBLNP());
        }
        if (other.getNIFGPAGNHDI() != 0F) {
          setNIFGPAGNHDI(other.getNIFGPAGNHDI());
        }
        if (other.getAKHGPBLEJIF() != 0F) {
          setAKHGPBLEJIF(other.getAKHGPBLEJIF());
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
        emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rot_ ;
      /**
       * <code>uint32 rot = 7;</code>
       * @return The rot.
       */
      @java.lang.Override
      public int getRot() {
        return rot_;
      }
      /**
       * <code>uint32 rot = 7;</code>
       * @param value The rot to set.
       * @return This builder for chaining.
       */
      public Builder setRot(int value) {
        
        rot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rot = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRot() {
        
        rot_ = 0;
        onChanged();
        return this;
      }

      private int nCMDODEBLNP_ ;
      /**
       * <code>uint32 NCMDODEBLNP = 5;</code>
       * @return The nCMDODEBLNP.
       */
      @java.lang.Override
      public int getNCMDODEBLNP() {
        return nCMDODEBLNP_;
      }
      /**
       * <code>uint32 NCMDODEBLNP = 5;</code>
       * @param value The nCMDODEBLNP to set.
       * @return This builder for chaining.
       */
      public Builder setNCMDODEBLNP(int value) {
        
        nCMDODEBLNP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NCMDODEBLNP = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNCMDODEBLNP() {
        
        nCMDODEBLNP_ = 0;
        onChanged();
        return this;
      }

      private float nIFGPAGNHDI_ ;
      /**
       * <code>float NIFGPAGNHDI = 2;</code>
       * @return The nIFGPAGNHDI.
       */
      @java.lang.Override
      public float getNIFGPAGNHDI() {
        return nIFGPAGNHDI_;
      }
      /**
       * <code>float NIFGPAGNHDI = 2;</code>
       * @param value The nIFGPAGNHDI to set.
       * @return This builder for chaining.
       */
      public Builder setNIFGPAGNHDI(float value) {
        
        nIFGPAGNHDI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float NIFGPAGNHDI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNIFGPAGNHDI() {
        
        nIFGPAGNHDI_ = 0F;
        onChanged();
        return this;
      }

      private float aKHGPBLEJIF_ ;
      /**
       * <code>float AKHGPBLEJIF = 1;</code>
       * @return The aKHGPBLEJIF.
       */
      @java.lang.Override
      public float getAKHGPBLEJIF() {
        return aKHGPBLEJIF_;
      }
      /**
       * <code>float AKHGPBLEJIF = 1;</code>
       * @param value The aKHGPBLEJIF to set.
       * @return This builder for chaining.
       */
      public Builder setAKHGPBLEJIF(float value) {
        
        aKHGPBLEJIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float AKHGPBLEJIF = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAKHGPBLEJIF() {
        
        aKHGPBLEJIF_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:LCCKNACMGAA)
    }

    // @@protoc_insertion_point(class_scope:LCCKNACMGAA)
    private static final emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA();
    }

    public static emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LCCKNACMGAA>
        PARSER = new com.google.protobuf.AbstractParser<LCCKNACMGAA>() {
      @java.lang.Override
      public LCCKNACMGAA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LCCKNACMGAA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LCCKNACMGAA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LCCKNACMGAA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LCCKNACMGAAOuterClass.LCCKNACMGAA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LCCKNACMGAA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LCCKNACMGAA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LCCKNACMGAA.proto\"Y\n\013LCCKNACMGAA\022\013\n\003ro" +
      "t\030\007 \001(\r\022\023\n\013NCMDODEBLNP\030\005 \001(\r\022\023\n\013NIFGPAGN" +
      "HDI\030\002 \001(\002\022\023\n\013AKHGPBLEJIF\030\001 \001(\002B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LCCKNACMGAA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LCCKNACMGAA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LCCKNACMGAA_descriptor,
        new java.lang.String[] { "Rot", "NCMDODEBLNP", "NIFGPAGNHDI", "AKHGPBLEJIF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
