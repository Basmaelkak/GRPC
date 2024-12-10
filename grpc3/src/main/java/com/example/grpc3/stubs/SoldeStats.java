// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package com.example.grpc3.stubs;

/**
 * <pre>
 * Message pour les statistiques de solde
 * </pre>
 *
 * Protobuf type {@code SoldeStats}
 */
public  final class SoldeStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SoldeStats)
    SoldeStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SoldeStats.newBuilder() to construct.
  private SoldeStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SoldeStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SoldeStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SoldeStats(
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
          case 8: {

            count_ = input.readInt32();
            break;
          }
          case 21: {

            sum_ = input.readFloat();
            break;
          }
          case 29: {

            average_ = input.readFloat();
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
    return com.example.grpc3.stubs.CompteServiceOuterClass.internal_static_SoldeStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc3.stubs.CompteServiceOuterClass.internal_static_SoldeStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc3.stubs.SoldeStats.class, com.example.grpc3.stubs.SoldeStats.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <pre>
   * Nombre total de comptes
   * </pre>
   *
   * <code>int32 count = 1;</code>
   * @return The count.
   */
  public int getCount() {
    return count_;
  }

  public static final int SUM_FIELD_NUMBER = 2;
  private float sum_;
  /**
   * <pre>
   * Somme des soldes
   * </pre>
   *
   * <code>float sum = 2;</code>
   * @return The sum.
   */
  public float getSum() {
    return sum_;
  }

  public static final int AVERAGE_FIELD_NUMBER = 3;
  private float average_;
  /**
   * <pre>
   * Moyenne des soldes
   * </pre>
   *
   * <code>float average = 3;</code>
   * @return The average.
   */
  public float getAverage() {
    return average_;
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    if (sum_ != 0F) {
      output.writeFloat(2, sum_);
    }
    if (average_ != 0F) {
      output.writeFloat(3, average_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    if (sum_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, sum_);
    }
    if (average_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, average_);
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
    if (!(obj instanceof com.example.grpc3.stubs.SoldeStats)) {
      return super.equals(obj);
    }
    com.example.grpc3.stubs.SoldeStats other = (com.example.grpc3.stubs.SoldeStats) obj;

    if (getCount()
        != other.getCount()) return false;
    if (java.lang.Float.floatToIntBits(getSum())
        != java.lang.Float.floatToIntBits(
            other.getSum())) return false;
    if (java.lang.Float.floatToIntBits(getAverage())
        != java.lang.Float.floatToIntBits(
            other.getAverage())) return false;
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + SUM_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getSum());
    hash = (37 * hash) + AVERAGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAverage());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc3.stubs.SoldeStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc3.stubs.SoldeStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc3.stubs.SoldeStats parseFrom(
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
  public static Builder newBuilder(com.example.grpc3.stubs.SoldeStats prototype) {
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
   * Message pour les statistiques de solde
   * </pre>
   *
   * Protobuf type {@code SoldeStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SoldeStats)
      com.example.grpc3.stubs.SoldeStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc3.stubs.CompteServiceOuterClass.internal_static_SoldeStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc3.stubs.CompteServiceOuterClass.internal_static_SoldeStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc3.stubs.SoldeStats.class, com.example.grpc3.stubs.SoldeStats.Builder.class);
    }

    // Construct using com.example.grpc3.stubs.SoldeStats.newBuilder()
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
      count_ = 0;

      sum_ = 0F;

      average_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc3.stubs.CompteServiceOuterClass.internal_static_SoldeStats_descriptor;
    }

    @java.lang.Override
    public com.example.grpc3.stubs.SoldeStats getDefaultInstanceForType() {
      return com.example.grpc3.stubs.SoldeStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.grpc3.stubs.SoldeStats build() {
      com.example.grpc3.stubs.SoldeStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.grpc3.stubs.SoldeStats buildPartial() {
      com.example.grpc3.stubs.SoldeStats result = new com.example.grpc3.stubs.SoldeStats(this);
      result.count_ = count_;
      result.sum_ = sum_;
      result.average_ = average_;
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
      if (other instanceof com.example.grpc3.stubs.SoldeStats) {
        return mergeFrom((com.example.grpc3.stubs.SoldeStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc3.stubs.SoldeStats other) {
      if (other == com.example.grpc3.stubs.SoldeStats.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getSum() != 0F) {
        setSum(other.getSum());
      }
      if (other.getAverage() != 0F) {
        setAverage(other.getAverage());
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
      com.example.grpc3.stubs.SoldeStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc3.stubs.SoldeStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * Nombre total de comptes
     * </pre>
     *
     * <code>int32 count = 1;</code>
     * @return The count.
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * Nombre total de comptes
     * </pre>
     *
     * <code>int32 count = 1;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Nombre total de comptes
     * </pre>
     *
     * <code>int32 count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private float sum_ ;
    /**
     * <pre>
     * Somme des soldes
     * </pre>
     *
     * <code>float sum = 2;</code>
     * @return The sum.
     */
    public float getSum() {
      return sum_;
    }
    /**
     * <pre>
     * Somme des soldes
     * </pre>
     *
     * <code>float sum = 2;</code>
     * @param value The sum to set.
     * @return This builder for chaining.
     */
    public Builder setSum(float value) {
      
      sum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Somme des soldes
     * </pre>
     *
     * <code>float sum = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSum() {
      
      sum_ = 0F;
      onChanged();
      return this;
    }

    private float average_ ;
    /**
     * <pre>
     * Moyenne des soldes
     * </pre>
     *
     * <code>float average = 3;</code>
     * @return The average.
     */
    public float getAverage() {
      return average_;
    }
    /**
     * <pre>
     * Moyenne des soldes
     * </pre>
     *
     * <code>float average = 3;</code>
     * @param value The average to set.
     * @return This builder for chaining.
     */
    public Builder setAverage(float value) {
      
      average_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Moyenne des soldes
     * </pre>
     *
     * <code>float average = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAverage() {
      
      average_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:SoldeStats)
  }

  // @@protoc_insertion_point(class_scope:SoldeStats)
  private static final com.example.grpc3.stubs.SoldeStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc3.stubs.SoldeStats();
  }

  public static com.example.grpc3.stubs.SoldeStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SoldeStats>
      PARSER = new com.google.protobuf.AbstractParser<SoldeStats>() {
    @java.lang.Override
    public SoldeStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SoldeStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SoldeStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SoldeStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.grpc3.stubs.SoldeStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

