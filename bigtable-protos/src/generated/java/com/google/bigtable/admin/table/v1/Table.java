// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1/bigtable_table_data.proto

package com.google.bigtable.admin.table.v1;

/**
 * Protobuf type {@code google.bigtable.admin.table.v1.Table}
 *
 * <pre>
 * A collection of user data indexed by row, column, and timestamp.
 * Each table is served using the resources of its parent cluster.
 * </pre>
 */
public  final class Table extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.table.v1.Table)
    TableOrBuilder {
  // Use Table.newBuilder() to construct.
  private Table(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Table() {
    name_ = "";
    granularity_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Table(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 18: {
            com.google.longrunning.Operation.Builder subBuilder = null;
            if (currentOperation_ != null) {
              subBuilder = currentOperation_.toBuilder();
            }
            currentOperation_ = input.readMessage(com.google.longrunning.Operation.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(currentOperation_);
              currentOperation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              columnFamilies_ = com.google.protobuf.MapField.newMapField(
                  ColumnFamiliesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
            columnFamilies = input.readMessage(
                ColumnFamiliesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            columnFamilies_.getMutableMap().put(columnFamilies.getKey(), columnFamilies.getValue());
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            granularity_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetColumnFamilies();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.table.v1.Table.class, com.google.bigtable.admin.table.v1.Table.Builder.class);
  }

  /**
   * Protobuf enum {@code google.bigtable.admin.table.v1.Table.TimestampGranularity}
   */
  public enum TimestampGranularity
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MILLIS = 0;</code>
     */
    MILLIS(0, 0),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>MILLIS = 0;</code>
     */
    public static final int MILLIS_VALUE = 0;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static TimestampGranularity valueOf(int value) {
      switch (value) {
        case 0: return MILLIS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TimestampGranularity>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TimestampGranularity>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TimestampGranularity>() {
            public TimestampGranularity findValueByNumber(int number) {
              return TimestampGranularity.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.bigtable.admin.table.v1.Table.getDescriptor().getEnumTypes().get(0);
    }

    private static final TimestampGranularity[] VALUES = values();

    public static TimestampGranularity valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private TimestampGranularity(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.bigtable.admin.table.v1.Table.TimestampGranularity)
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * A unique identifier of the form
   * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * A unique identifier of the form
   * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENT_OPERATION_FIELD_NUMBER = 2;
  private com.google.longrunning.Operation currentOperation_;
  /**
   * <code>optional .google.longrunning.Operation current_operation = 2;</code>
   *
   * <pre>
   * If this Table is in the process of being created, the Operation used to
   * track its progress. As long as this operation is present, the Table will
   * not accept any Table Admin or Read/Write requests.
   * </pre>
   */
  public boolean hasCurrentOperation() {
    return currentOperation_ != null;
  }
  /**
   * <code>optional .google.longrunning.Operation current_operation = 2;</code>
   *
   * <pre>
   * If this Table is in the process of being created, the Operation used to
   * track its progress. As long as this operation is present, the Table will
   * not accept any Table Admin or Read/Write requests.
   * </pre>
   */
  public com.google.longrunning.Operation getCurrentOperation() {
    return currentOperation_ == null ? com.google.longrunning.Operation.getDefaultInstance() : currentOperation_;
  }
  /**
   * <code>optional .google.longrunning.Operation current_operation = 2;</code>
   *
   * <pre>
   * If this Table is in the process of being created, the Operation used to
   * track its progress. As long as this operation is present, the Table will
   * not accept any Table Admin or Read/Write requests.
   * </pre>
   */
  public com.google.longrunning.OperationOrBuilder getCurrentOperationOrBuilder() {
    return getCurrentOperation();
  }

  public static final int COLUMN_FAMILIES_FIELD_NUMBER = 3;
  private static final class ColumnFamiliesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>newDefaultInstance(
                com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_ColumnFamiliesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.bigtable.admin.table.v1.ColumnFamily.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> columnFamilies_;
  private com.google.protobuf.MapField<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
  internalGetColumnFamilies() {
    if (columnFamilies_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ColumnFamiliesDefaultEntryHolder.defaultEntry);
   }
    return columnFamilies_;
  }
  /**
   * <code>map&lt;string, .google.bigtable.admin.table.v1.ColumnFamily&gt; column_families = 3;</code>
   *
   * <pre>
   * The column families configured for this table, mapped by column family id.
   * </pre>
   */

  public java.util.Map<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> getColumnFamilies() {
    return internalGetColumnFamilies().getMap();
  }

  public static final int GRANULARITY_FIELD_NUMBER = 4;
  private int granularity_;
  /**
   * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
   *
   * <pre>
   * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
   * this table. Timestamps not matching the granularity will be rejected.
   * Cannot be changed once the table is created.
   * </pre>
   */
  public int getGranularityValue() {
    return granularity_;
  }
  /**
   * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
   *
   * <pre>
   * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
   * this table. Timestamps not matching the granularity will be rejected.
   * Cannot be changed once the table is created.
   * </pre>
   */
  public com.google.bigtable.admin.table.v1.Table.TimestampGranularity getGranularity() {
    com.google.bigtable.admin.table.v1.Table.TimestampGranularity result = com.google.bigtable.admin.table.v1.Table.TimestampGranularity.valueOf(granularity_);
    return result == null ? com.google.bigtable.admin.table.v1.Table.TimestampGranularity.UNRECOGNIZED : result;
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
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(1, getNameBytes());
    }
    if (currentOperation_ != null) {
      output.writeMessage(2, getCurrentOperation());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> entry
         : internalGetColumnFamilies().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
      columnFamilies = ColumnFamiliesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(3, columnFamilies);
    }
    if (granularity_ != com.google.bigtable.admin.table.v1.Table.TimestampGranularity.MILLIS.getNumber()) {
      output.writeEnum(4, granularity_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getNameBytes());
    }
    if (currentOperation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCurrentOperation());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> entry
         : internalGetColumnFamilies().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
      columnFamilies = ColumnFamiliesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, columnFamilies);
    }
    if (granularity_ != com.google.bigtable.admin.table.v1.Table.TimestampGranularity.MILLIS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, granularity_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.Table parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.Table parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.table.v1.Table parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.table.v1.Table prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.table.v1.Table}
   *
   * <pre>
   * A collection of user data indexed by row, column, and timestamp.
   * Each table is served using the resources of its parent cluster.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.table.v1.Table)
      com.google.bigtable.admin.table.v1.TableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetColumnFamilies();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableColumnFamilies();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.table.v1.Table.class, com.google.bigtable.admin.table.v1.Table.Builder.class);
    }

    // Construct using com.google.bigtable.admin.table.v1.Table.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      if (currentOperationBuilder_ == null) {
        currentOperation_ = null;
      } else {
        currentOperation_ = null;
        currentOperationBuilder_ = null;
      }
      internalGetMutableColumnFamilies().clear();
      granularity_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.table.v1.BigtableTableDataProto.internal_static_google_bigtable_admin_table_v1_Table_descriptor;
    }

    public com.google.bigtable.admin.table.v1.Table getDefaultInstanceForType() {
      return com.google.bigtable.admin.table.v1.Table.getDefaultInstance();
    }

    public com.google.bigtable.admin.table.v1.Table build() {
      com.google.bigtable.admin.table.v1.Table result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.table.v1.Table buildPartial() {
      com.google.bigtable.admin.table.v1.Table result = new com.google.bigtable.admin.table.v1.Table(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (currentOperationBuilder_ == null) {
        result.currentOperation_ = currentOperation_;
      } else {
        result.currentOperation_ = currentOperationBuilder_.build();
      }
      result.columnFamilies_ = internalGetColumnFamilies();
      result.columnFamilies_.makeImmutable();
      result.granularity_ = granularity_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.table.v1.Table) {
        return mergeFrom((com.google.bigtable.admin.table.v1.Table)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.table.v1.Table other) {
      if (other == com.google.bigtable.admin.table.v1.Table.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasCurrentOperation()) {
        mergeCurrentOperation(other.getCurrentOperation());
      }
      internalGetMutableColumnFamilies().mergeFrom(
          other.internalGetColumnFamilies());
      if (other.granularity_ != 0) {
        setGranularityValue(other.getGranularityValue());
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
      com.google.bigtable.admin.table.v1.Table parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.table.v1.Table) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * A unique identifier of the form
     * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * A unique identifier of the form
     * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * A unique identifier of the form
     * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * A unique identifier of the form
     * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     *
     * <pre>
     * A unique identifier of the form
     * &lt;cluster_name&gt;/tables/[_a-zA-Z0-9][-_.a-zA-Z0-9]*
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.longrunning.Operation currentOperation_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> currentOperationBuilder_;
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public boolean hasCurrentOperation() {
      return currentOperationBuilder_ != null || currentOperation_ != null;
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public com.google.longrunning.Operation getCurrentOperation() {
      if (currentOperationBuilder_ == null) {
        return currentOperation_ == null ? com.google.longrunning.Operation.getDefaultInstance() : currentOperation_;
      } else {
        return currentOperationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public Builder setCurrentOperation(com.google.longrunning.Operation value) {
      if (currentOperationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        currentOperation_ = value;
        onChanged();
      } else {
        currentOperationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public Builder setCurrentOperation(
        com.google.longrunning.Operation.Builder builderForValue) {
      if (currentOperationBuilder_ == null) {
        currentOperation_ = builderForValue.build();
        onChanged();
      } else {
        currentOperationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public Builder mergeCurrentOperation(com.google.longrunning.Operation value) {
      if (currentOperationBuilder_ == null) {
        if (currentOperation_ != null) {
          currentOperation_ =
            com.google.longrunning.Operation.newBuilder(currentOperation_).mergeFrom(value).buildPartial();
        } else {
          currentOperation_ = value;
        }
        onChanged();
      } else {
        currentOperationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public Builder clearCurrentOperation() {
      if (currentOperationBuilder_ == null) {
        currentOperation_ = null;
        onChanged();
      } else {
        currentOperation_ = null;
        currentOperationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public com.google.longrunning.Operation.Builder getCurrentOperationBuilder() {
      
      onChanged();
      return getCurrentOperationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    public com.google.longrunning.OperationOrBuilder getCurrentOperationOrBuilder() {
      if (currentOperationBuilder_ != null) {
        return currentOperationBuilder_.getMessageOrBuilder();
      } else {
        return currentOperation_ == null ?
            com.google.longrunning.Operation.getDefaultInstance() : currentOperation_;
      }
    }
    /**
     * <code>optional .google.longrunning.Operation current_operation = 2;</code>
     *
     * <pre>
     * If this Table is in the process of being created, the Operation used to
     * track its progress. As long as this operation is present, the Table will
     * not accept any Table Admin or Read/Write requests.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder> 
        getCurrentOperationFieldBuilder() {
      if (currentOperationBuilder_ == null) {
        currentOperationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.longrunning.Operation, com.google.longrunning.Operation.Builder, com.google.longrunning.OperationOrBuilder>(
                getCurrentOperation(),
                getParentForChildren(),
                isClean());
        currentOperation_ = null;
      }
      return currentOperationBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> columnFamilies_;
    private com.google.protobuf.MapField<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
    internalGetColumnFamilies() {
      if (columnFamilies_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ColumnFamiliesDefaultEntryHolder.defaultEntry);
     }
      return columnFamilies_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
    internalGetMutableColumnFamilies() {
      onChanged();;
      if (columnFamilies_ == null) {
        columnFamilies_ = com.google.protobuf.MapField.newMapField(
            ColumnFamiliesDefaultEntryHolder.defaultEntry);
      }
      if (!columnFamilies_.isMutable()) {
        columnFamilies_ = columnFamilies_.copy();
      }
      return columnFamilies_;
    }
    /**
     * <code>map&lt;string, .google.bigtable.admin.table.v1.ColumnFamily&gt; column_families = 3;</code>
     *
     * <pre>
     * The column families configured for this table, mapped by column family id.
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily> getColumnFamilies() {
      return internalGetColumnFamilies().getMap();
    }
    /**
     * <code>map&lt;string, .google.bigtable.admin.table.v1.ColumnFamily&gt; column_families = 3;</code>
     *
     * <pre>
     * The column families configured for this table, mapped by column family id.
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.bigtable.admin.table.v1.ColumnFamily>
    getMutableColumnFamilies() {
      return internalGetMutableColumnFamilies().getMutableMap();
    }

    private int granularity_ = 0;
    /**
     * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
     *
     * <pre>
     * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
     * this table. Timestamps not matching the granularity will be rejected.
     * Cannot be changed once the table is created.
     * </pre>
     */
    public int getGranularityValue() {
      return granularity_;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
     *
     * <pre>
     * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
     * this table. Timestamps not matching the granularity will be rejected.
     * Cannot be changed once the table is created.
     * </pre>
     */
    public Builder setGranularityValue(int value) {
      granularity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
     *
     * <pre>
     * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
     * this table. Timestamps not matching the granularity will be rejected.
     * Cannot be changed once the table is created.
     * </pre>
     */
    public com.google.bigtable.admin.table.v1.Table.TimestampGranularity getGranularity() {
      com.google.bigtable.admin.table.v1.Table.TimestampGranularity result = com.google.bigtable.admin.table.v1.Table.TimestampGranularity.valueOf(granularity_);
      return result == null ? com.google.bigtable.admin.table.v1.Table.TimestampGranularity.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
     *
     * <pre>
     * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
     * this table. Timestamps not matching the granularity will be rejected.
     * Cannot be changed once the table is created.
     * </pre>
     */
    public Builder setGranularity(com.google.bigtable.admin.table.v1.Table.TimestampGranularity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      granularity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.bigtable.admin.table.v1.Table.TimestampGranularity granularity = 4;</code>
     *
     * <pre>
     * The granularity (e.g. MILLIS, MICROS) at which timestamps are stored in
     * this table. Timestamps not matching the granularity will be rejected.
     * Cannot be changed once the table is created.
     * </pre>
     */
    public Builder clearGranularity() {
      
      granularity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.table.v1.Table)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.table.v1.Table)
  private static final com.google.bigtable.admin.table.v1.Table DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.table.v1.Table();
  }

  public static com.google.bigtable.admin.table.v1.Table getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<Table> PARSER =
      new com.google.protobuf.AbstractParser<Table>() {
    public Table parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Table(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Table> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.table.v1.Table getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

