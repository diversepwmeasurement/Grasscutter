// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CodexDataUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class CodexDataUpdateNotifyOuterClass {
  private CodexDataUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CodexDataUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CodexDataUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 weapon_max_promote_level = 15;</code>
     * @return The weaponMaxPromoteLevel.
     */
    int getWeaponMaxPromoteLevel();

    /**
     * <code>.CodexType type = 11;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.CodexType type = 11;</code>
     * @return The type.
     */
    emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType getType();
  }
  /**
   * <pre>
   * CmdId: 4207
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code CodexDataUpdateNotify}
   */
  public static final class CodexDataUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CodexDataUpdateNotify)
      CodexDataUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CodexDataUpdateNotify.newBuilder() to construct.
    private CodexDataUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CodexDataUpdateNotify() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CodexDataUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CodexDataUpdateNotify(
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
            case 64: {

              id_ = input.readUInt32();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 120: {

              weaponMaxPromoteLevel_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.internal_static_CodexDataUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.internal_static_CodexDataUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.class, emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int WEAPON_MAX_PROMOTE_LEVEL_FIELD_NUMBER = 15;
    private int weaponMaxPromoteLevel_;
    /**
     * <code>uint32 weapon_max_promote_level = 15;</code>
     * @return The weaponMaxPromoteLevel.
     */
    @java.lang.Override
    public int getWeaponMaxPromoteLevel() {
      return weaponMaxPromoteLevel_;
    }

    public static final int TYPE_FIELD_NUMBER = 11;
    private int type_;
    /**
     * <code>.CodexType type = 11;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.CodexType type = 11;</code>
     * @return The type.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType getType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType result = emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.valueOf(type_);
      return result == null ? emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.UNRECOGNIZED : result;
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
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      if (type_ != emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.CODEX_TYPE_NONE.getNumber()) {
        output.writeEnum(11, type_);
      }
      if (weaponMaxPromoteLevel_ != 0) {
        output.writeUInt32(15, weaponMaxPromoteLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
      }
      if (type_ != emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.CODEX_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, type_);
      }
      if (weaponMaxPromoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, weaponMaxPromoteLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify other = (emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify) obj;

      if (getId()
          != other.getId()) return false;
      if (getWeaponMaxPromoteLevel()
          != other.getWeaponMaxPromoteLevel()) return false;
      if (type_ != other.type_) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + WEAPON_MAX_PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getWeaponMaxPromoteLevel();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify prototype) {
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
     * CmdId: 4207
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code CodexDataUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CodexDataUpdateNotify)
        emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.internal_static_CodexDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.internal_static_CodexDataUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.class, emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.newBuilder()
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
        id_ = 0;

        weaponMaxPromoteLevel_ = 0;

        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.internal_static_CodexDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify build() {
        emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify result = new emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify(this);
        result.id_ = id_;
        result.weaponMaxPromoteLevel_ = weaponMaxPromoteLevel_;
        result.type_ = type_;
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
        if (other instanceof emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getWeaponMaxPromoteLevel() != 0) {
          setWeaponMaxPromoteLevel(other.getWeaponMaxPromoteLevel());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
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
        emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int weaponMaxPromoteLevel_ ;
      /**
       * <code>uint32 weapon_max_promote_level = 15;</code>
       * @return The weaponMaxPromoteLevel.
       */
      @java.lang.Override
      public int getWeaponMaxPromoteLevel() {
        return weaponMaxPromoteLevel_;
      }
      /**
       * <code>uint32 weapon_max_promote_level = 15;</code>
       * @param value The weaponMaxPromoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setWeaponMaxPromoteLevel(int value) {
        
        weaponMaxPromoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weapon_max_promote_level = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeaponMaxPromoteLevel() {
        
        weaponMaxPromoteLevel_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.CodexType type = 11;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.CodexType type = 11;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CodexType type = 11;</code>
       * @return The type.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType getType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType result = emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.valueOf(type_);
        return result == null ? emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType.UNRECOGNIZED : result;
      }
      /**
       * <code>.CodexType type = 11;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(emu.grasscutter.net.proto.CodexTypeOuterClass.CodexType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CodexType type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CodexDataUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:CodexDataUpdateNotify)
    private static final emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify();
    }

    public static emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CodexDataUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<CodexDataUpdateNotify>() {
      @java.lang.Override
      public CodexDataUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CodexDataUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CodexDataUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CodexDataUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CodexDataUpdateNotifyOuterClass.CodexDataUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CodexDataUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CodexDataUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CodexDataUpdateNotify.proto\032\017CodexType" +
      ".proto\"_\n\025CodexDataUpdateNotify\022\n\n\002id\030\010 " +
      "\001(\r\022 \n\030weapon_max_promote_level\030\017 \001(\r\022\030\n" +
      "\004type\030\013 \001(\0162\n.CodexTypeB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CodexTypeOuterClass.getDescriptor(),
        });
    internal_static_CodexDataUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CodexDataUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CodexDataUpdateNotify_descriptor,
        new java.lang.String[] { "Id", "WeaponMaxPromoteLevel", "Type", });
    emu.grasscutter.net.proto.CodexTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
