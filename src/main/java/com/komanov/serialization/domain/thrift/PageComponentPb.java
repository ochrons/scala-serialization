/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.komanov.serialization.domain.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageComponentPb implements org.apache.thrift.TBase<PageComponentPb, PageComponentPb._Fields>, java.io.Serializable, Cloneable, Comparable<PageComponentPb> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PageComponentPb");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COMPONENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("componentType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField POSITION_FIELD_DESC = new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField DATE_CREATED_FIELD_DESC = new org.apache.thrift.protocol.TField("dateCreated", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DATE_UPDATED_FIELD_DESC = new org.apache.thrift.protocol.TField("dateUpdated", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PageComponentPbStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PageComponentPbTupleSchemeFactory());
  }

  public ByteBuffer id; // optional
  /**
   * 
   * @see PageComponentTypePb
   */
  public PageComponentTypePb componentType; // optional
  public PageComponentDataPb data; // optional
  public PageComponentPositionPb position; // optional
  public long dateCreated; // optional
  public long dateUpdated; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    /**
     * 
     * @see PageComponentTypePb
     */
    COMPONENT_TYPE((short)2, "componentType"),
    DATA((short)3, "data"),
    POSITION((short)4, "position"),
    DATE_CREATED((short)5, "dateCreated"),
    DATE_UPDATED((short)6, "dateUpdated");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // COMPONENT_TYPE
          return COMPONENT_TYPE;
        case 3: // DATA
          return DATA;
        case 4: // POSITION
          return POSITION;
        case 5: // DATE_CREATED
          return DATE_CREATED;
        case 6: // DATE_UPDATED
          return DATE_UPDATED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DATECREATED_ISSET_ID = 0;
  private static final int __DATEUPDATED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ID,_Fields.COMPONENT_TYPE,_Fields.DATA,_Fields.POSITION,_Fields.DATE_CREATED,_Fields.DATE_UPDATED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COMPONENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("componentType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PageComponentTypePb.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PageComponentDataPb.class)));
    tmpMap.put(_Fields.POSITION, new org.apache.thrift.meta_data.FieldMetaData("position", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PageComponentPositionPb.class)));
    tmpMap.put(_Fields.DATE_CREATED, new org.apache.thrift.meta_data.FieldMetaData("dateCreated", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATE_UPDATED, new org.apache.thrift.meta_data.FieldMetaData("dateUpdated", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PageComponentPb.class, metaDataMap);
  }

  public PageComponentPb() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PageComponentPb(PageComponentPb other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = org.apache.thrift.TBaseHelper.copyBinary(other.id);
;
    }
    if (other.isSetComponentType()) {
      this.componentType = other.componentType;
    }
    if (other.isSetData()) {
      this.data = new PageComponentDataPb(other.data);
    }
    if (other.isSetPosition()) {
      this.position = new PageComponentPositionPb(other.position);
    }
    this.dateCreated = other.dateCreated;
    this.dateUpdated = other.dateUpdated;
  }

  public PageComponentPb deepCopy() {
    return new PageComponentPb(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.componentType = null;
    this.data = null;
    this.position = null;
    setDateCreatedIsSet(false);
    this.dateCreated = 0;
    setDateUpdatedIsSet(false);
    this.dateUpdated = 0;
  }

  public byte[] getId() {
    setId(org.apache.thrift.TBaseHelper.rightSize(id));
    return id == null ? null : id.array();
  }

  public ByteBuffer bufferForId() {
    return id;
  }

  public PageComponentPb setId(byte[] id) {
    setId(id == null ? (ByteBuffer)null : ByteBuffer.wrap(id));
    return this;
  }

  public PageComponentPb setId(ByteBuffer id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  /**
   * 
   * @see PageComponentTypePb
   */
  public PageComponentTypePb getComponentType() {
    return this.componentType;
  }

  /**
   * 
   * @see PageComponentTypePb
   */
  public PageComponentPb setComponentType(PageComponentTypePb componentType) {
    this.componentType = componentType;
    return this;
  }

  public void unsetComponentType() {
    this.componentType = null;
  }

  /** Returns true if field componentType is set (has been assigned a value) and false otherwise */
  public boolean isSetComponentType() {
    return this.componentType != null;
  }

  public void setComponentTypeIsSet(boolean value) {
    if (!value) {
      this.componentType = null;
    }
  }

  public PageComponentDataPb getData() {
    return this.data;
  }

  public PageComponentPb setData(PageComponentDataPb data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public PageComponentPositionPb getPosition() {
    return this.position;
  }

  public PageComponentPb setPosition(PageComponentPositionPb position) {
    this.position = position;
    return this;
  }

  public void unsetPosition() {
    this.position = null;
  }

  /** Returns true if field position is set (has been assigned a value) and false otherwise */
  public boolean isSetPosition() {
    return this.position != null;
  }

  public void setPositionIsSet(boolean value) {
    if (!value) {
      this.position = null;
    }
  }

  public long getDateCreated() {
    return this.dateCreated;
  }

  public PageComponentPb setDateCreated(long dateCreated) {
    this.dateCreated = dateCreated;
    setDateCreatedIsSet(true);
    return this;
  }

  public void unsetDateCreated() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATECREATED_ISSET_ID);
  }

  /** Returns true if field dateCreated is set (has been assigned a value) and false otherwise */
  public boolean isSetDateCreated() {
    return EncodingUtils.testBit(__isset_bitfield, __DATECREATED_ISSET_ID);
  }

  public void setDateCreatedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATECREATED_ISSET_ID, value);
  }

  public long getDateUpdated() {
    return this.dateUpdated;
  }

  public PageComponentPb setDateUpdated(long dateUpdated) {
    this.dateUpdated = dateUpdated;
    setDateUpdatedIsSet(true);
    return this;
  }

  public void unsetDateUpdated() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATEUPDATED_ISSET_ID);
  }

  /** Returns true if field dateUpdated is set (has been assigned a value) and false otherwise */
  public boolean isSetDateUpdated() {
    return EncodingUtils.testBit(__isset_bitfield, __DATEUPDATED_ISSET_ID);
  }

  public void setDateUpdatedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATEUPDATED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((ByteBuffer)value);
      }
      break;

    case COMPONENT_TYPE:
      if (value == null) {
        unsetComponentType();
      } else {
        setComponentType((PageComponentTypePb)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((PageComponentDataPb)value);
      }
      break;

    case POSITION:
      if (value == null) {
        unsetPosition();
      } else {
        setPosition((PageComponentPositionPb)value);
      }
      break;

    case DATE_CREATED:
      if (value == null) {
        unsetDateCreated();
      } else {
        setDateCreated((Long)value);
      }
      break;

    case DATE_UPDATED:
      if (value == null) {
        unsetDateUpdated();
      } else {
        setDateUpdated((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case COMPONENT_TYPE:
      return getComponentType();

    case DATA:
      return getData();

    case POSITION:
      return getPosition();

    case DATE_CREATED:
      return Long.valueOf(getDateCreated());

    case DATE_UPDATED:
      return Long.valueOf(getDateUpdated());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COMPONENT_TYPE:
      return isSetComponentType();
    case DATA:
      return isSetData();
    case POSITION:
      return isSetPosition();
    case DATE_CREATED:
      return isSetDateCreated();
    case DATE_UPDATED:
      return isSetDateUpdated();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PageComponentPb)
      return this.equals((PageComponentPb)that);
    return false;
  }

  public boolean equals(PageComponentPb that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_componentType = true && this.isSetComponentType();
    boolean that_present_componentType = true && that.isSetComponentType();
    if (this_present_componentType || that_present_componentType) {
      if (!(this_present_componentType && that_present_componentType))
        return false;
      if (!this.componentType.equals(that.componentType))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_position = true && this.isSetPosition();
    boolean that_present_position = true && that.isSetPosition();
    if (this_present_position || that_present_position) {
      if (!(this_present_position && that_present_position))
        return false;
      if (!this.position.equals(that.position))
        return false;
    }

    boolean this_present_dateCreated = true && this.isSetDateCreated();
    boolean that_present_dateCreated = true && that.isSetDateCreated();
    if (this_present_dateCreated || that_present_dateCreated) {
      if (!(this_present_dateCreated && that_present_dateCreated))
        return false;
      if (this.dateCreated != that.dateCreated)
        return false;
    }

    boolean this_present_dateUpdated = true && this.isSetDateUpdated();
    boolean that_present_dateUpdated = true && that.isSetDateUpdated();
    if (this_present_dateUpdated || that_present_dateUpdated) {
      if (!(this_present_dateUpdated && that_present_dateUpdated))
        return false;
      if (this.dateUpdated != that.dateUpdated)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PageComponentPb other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComponentType()).compareTo(other.isSetComponentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComponentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.componentType, other.componentType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPosition()).compareTo(other.isSetPosition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPosition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.position, other.position);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDateCreated()).compareTo(other.isSetDateCreated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDateCreated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dateCreated, other.dateCreated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDateUpdated()).compareTo(other.isSetDateUpdated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDateUpdated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dateUpdated, other.dateUpdated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PageComponentPb(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.id, sb);
      }
      first = false;
    }
    if (isSetComponentType()) {
      if (!first) sb.append(", ");
      sb.append("componentType:");
      if (this.componentType == null) {
        sb.append("null");
      } else {
        sb.append(this.componentType);
      }
      first = false;
    }
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
      }
      first = false;
    }
    if (isSetPosition()) {
      if (!first) sb.append(", ");
      sb.append("position:");
      if (this.position == null) {
        sb.append("null");
      } else {
        sb.append(this.position);
      }
      first = false;
    }
    if (isSetDateCreated()) {
      if (!first) sb.append(", ");
      sb.append("dateCreated:");
      sb.append(this.dateCreated);
      first = false;
    }
    if (isSetDateUpdated()) {
      if (!first) sb.append(", ");
      sb.append("dateUpdated:");
      sb.append(this.dateUpdated);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (data != null) {
      data.validate();
    }
    if (position != null) {
      position.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PageComponentPbStandardSchemeFactory implements SchemeFactory {
    public PageComponentPbStandardScheme getScheme() {
      return new PageComponentPbStandardScheme();
    }
  }

  private static class PageComponentPbStandardScheme extends StandardScheme<PageComponentPb> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PageComponentPb struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readBinary();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPONENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.componentType = PageComponentTypePb.findByValue(iprot.readI32());
              struct.setComponentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new PageComponentDataPb();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // POSITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.position = new PageComponentPositionPb();
              struct.position.read(iprot);
              struct.setPositionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATE_CREATED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dateCreated = iprot.readI64();
              struct.setDateCreatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DATE_UPDATED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dateUpdated = iprot.readI64();
              struct.setDateUpdatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PageComponentPb struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeBinary(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.componentType != null) {
        if (struct.isSetComponentType()) {
          oprot.writeFieldBegin(COMPONENT_TYPE_FIELD_DESC);
          oprot.writeI32(struct.componentType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          struct.data.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.position != null) {
        if (struct.isSetPosition()) {
          oprot.writeFieldBegin(POSITION_FIELD_DESC);
          struct.position.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDateCreated()) {
        oprot.writeFieldBegin(DATE_CREATED_FIELD_DESC);
        oprot.writeI64(struct.dateCreated);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDateUpdated()) {
        oprot.writeFieldBegin(DATE_UPDATED_FIELD_DESC);
        oprot.writeI64(struct.dateUpdated);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PageComponentPbTupleSchemeFactory implements SchemeFactory {
    public PageComponentPbTupleScheme getScheme() {
      return new PageComponentPbTupleScheme();
    }
  }

  private static class PageComponentPbTupleScheme extends TupleScheme<PageComponentPb> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PageComponentPb struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetComponentType()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      if (struct.isSetPosition()) {
        optionals.set(3);
      }
      if (struct.isSetDateCreated()) {
        optionals.set(4);
      }
      if (struct.isSetDateUpdated()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetId()) {
        oprot.writeBinary(struct.id);
      }
      if (struct.isSetComponentType()) {
        oprot.writeI32(struct.componentType.getValue());
      }
      if (struct.isSetData()) {
        struct.data.write(oprot);
      }
      if (struct.isSetPosition()) {
        struct.position.write(oprot);
      }
      if (struct.isSetDateCreated()) {
        oprot.writeI64(struct.dateCreated);
      }
      if (struct.isSetDateUpdated()) {
        oprot.writeI64(struct.dateUpdated);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PageComponentPb struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.id = iprot.readBinary();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.componentType = PageComponentTypePb.findByValue(iprot.readI32());
        struct.setComponentTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.data = new PageComponentDataPb();
        struct.data.read(iprot);
        struct.setDataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.position = new PageComponentPositionPb();
        struct.position.read(iprot);
        struct.setPositionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.dateCreated = iprot.readI64();
        struct.setDateCreatedIsSet(true);
      }
      if (incoming.get(5)) {
        struct.dateUpdated = iprot.readI64();
        struct.setDateUpdatedIsSet(true);
      }
    }
  }

}

