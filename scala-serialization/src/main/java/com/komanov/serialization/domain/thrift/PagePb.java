/**
 * Autogenerated by Thrift Compiler (0.9.3)
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-15")
public class PagePb implements org.apache.thrift.TBase<PagePb, PagePb._Fields>, java.io.Serializable, Cloneable, Comparable<PagePb> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PagePb");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField META_TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("metaTags", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField COMPONENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("components", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PagePbStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PagePbTupleSchemeFactory());
  }

  public String name; // optional
  public String path; // optional
  public List<MetaTagPb> metaTags; // optional
  public List<PageComponentPb> components; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    PATH((short)2, "path"),
    META_TAGS((short)3, "metaTags"),
    COMPONENTS((short)4, "components");

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
        case 1: // NAME
          return NAME;
        case 2: // PATH
          return PATH;
        case 3: // META_TAGS
          return META_TAGS;
        case 4: // COMPONENTS
          return COMPONENTS;
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
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.PATH,_Fields.META_TAGS,_Fields.COMPONENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.META_TAGS, new org.apache.thrift.meta_data.FieldMetaData("metaTags", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetaTagPb.class))));
    tmpMap.put(_Fields.COMPONENTS, new org.apache.thrift.meta_data.FieldMetaData("components", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PageComponentPb.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PagePb.class, metaDataMap);
  }

  public PagePb() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PagePb(PagePb other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
    if (other.isSetMetaTags()) {
      List<MetaTagPb> __this__metaTags = new ArrayList<MetaTagPb>(other.metaTags.size());
      for (MetaTagPb other_element : other.metaTags) {
        __this__metaTags.add(new MetaTagPb(other_element));
      }
      this.metaTags = __this__metaTags;
    }
    if (other.isSetComponents()) {
      List<PageComponentPb> __this__components = new ArrayList<PageComponentPb>(other.components.size());
      for (PageComponentPb other_element : other.components) {
        __this__components.add(new PageComponentPb(other_element));
      }
      this.components = __this__components;
    }
  }

  public PagePb deepCopy() {
    return new PagePb(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.path = null;
    this.metaTags = null;
    this.components = null;
  }

  public String getName() {
    return this.name;
  }

  public PagePb setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getPath() {
    return this.path;
  }

  public PagePb setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public int getMetaTagsSize() {
    return (this.metaTags == null) ? 0 : this.metaTags.size();
  }

  public java.util.Iterator<MetaTagPb> getMetaTagsIterator() {
    return (this.metaTags == null) ? null : this.metaTags.iterator();
  }

  public void addToMetaTags(MetaTagPb elem) {
    if (this.metaTags == null) {
      this.metaTags = new ArrayList<MetaTagPb>();
    }
    this.metaTags.add(elem);
  }

  public List<MetaTagPb> getMetaTags() {
    return this.metaTags;
  }

  public PagePb setMetaTags(List<MetaTagPb> metaTags) {
    this.metaTags = metaTags;
    return this;
  }

  public void unsetMetaTags() {
    this.metaTags = null;
  }

  /** Returns true if field metaTags is set (has been assigned a value) and false otherwise */
  public boolean isSetMetaTags() {
    return this.metaTags != null;
  }

  public void setMetaTagsIsSet(boolean value) {
    if (!value) {
      this.metaTags = null;
    }
  }

  public int getComponentsSize() {
    return (this.components == null) ? 0 : this.components.size();
  }

  public java.util.Iterator<PageComponentPb> getComponentsIterator() {
    return (this.components == null) ? null : this.components.iterator();
  }

  public void addToComponents(PageComponentPb elem) {
    if (this.components == null) {
      this.components = new ArrayList<PageComponentPb>();
    }
    this.components.add(elem);
  }

  public List<PageComponentPb> getComponents() {
    return this.components;
  }

  public PagePb setComponents(List<PageComponentPb> components) {
    this.components = components;
    return this;
  }

  public void unsetComponents() {
    this.components = null;
  }

  /** Returns true if field components is set (has been assigned a value) and false otherwise */
  public boolean isSetComponents() {
    return this.components != null;
  }

  public void setComponentsIsSet(boolean value) {
    if (!value) {
      this.components = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case META_TAGS:
      if (value == null) {
        unsetMetaTags();
      } else {
        setMetaTags((List<MetaTagPb>)value);
      }
      break;

    case COMPONENTS:
      if (value == null) {
        unsetComponents();
      } else {
        setComponents((List<PageComponentPb>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case PATH:
      return getPath();

    case META_TAGS:
      return getMetaTags();

    case COMPONENTS:
      return getComponents();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case PATH:
      return isSetPath();
    case META_TAGS:
      return isSetMetaTags();
    case COMPONENTS:
      return isSetComponents();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PagePb)
      return this.equals((PagePb)that);
    return false;
  }

  public boolean equals(PagePb that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_metaTags = true && this.isSetMetaTags();
    boolean that_present_metaTags = true && that.isSetMetaTags();
    if (this_present_metaTags || that_present_metaTags) {
      if (!(this_present_metaTags && that_present_metaTags))
        return false;
      if (!this.metaTags.equals(that.metaTags))
        return false;
    }

    boolean this_present_components = true && this.isSetComponents();
    boolean that_present_components = true && that.isSetComponents();
    if (this_present_components || that_present_components) {
      if (!(this_present_components && that_present_components))
        return false;
      if (!this.components.equals(that.components))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_path = true && (isSetPath());
    list.add(present_path);
    if (present_path)
      list.add(path);

    boolean present_metaTags = true && (isSetMetaTags());
    list.add(present_metaTags);
    if (present_metaTags)
      list.add(metaTags);

    boolean present_components = true && (isSetComponents());
    list.add(present_components);
    if (present_components)
      list.add(components);

    return list.hashCode();
  }

  @Override
  public int compareTo(PagePb other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetaTags()).compareTo(other.isSetMetaTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetaTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metaTags, other.metaTags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComponents()).compareTo(other.isSetComponents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComponents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.components, other.components);
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
    StringBuilder sb = new StringBuilder("PagePb(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetPath()) {
      if (!first) sb.append(", ");
      sb.append("path:");
      if (this.path == null) {
        sb.append("null");
      } else {
        sb.append(this.path);
      }
      first = false;
    }
    if (isSetMetaTags()) {
      if (!first) sb.append(", ");
      sb.append("metaTags:");
      if (this.metaTags == null) {
        sb.append("null");
      } else {
        sb.append(this.metaTags);
      }
      first = false;
    }
    if (isSetComponents()) {
      if (!first) sb.append(", ");
      sb.append("components:");
      if (this.components == null) {
        sb.append("null");
      } else {
        sb.append(this.components);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PagePbStandardSchemeFactory implements SchemeFactory {
    public PagePbStandardScheme getScheme() {
      return new PagePbStandardScheme();
    }
  }

  private static class PagePbStandardScheme extends StandardScheme<PagePb> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PagePb struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // META_TAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.metaTags = new ArrayList<MetaTagPb>(_list0.size);
                MetaTagPb _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new MetaTagPb();
                  _elem1.read(iprot);
                  struct.metaTags.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMetaTagsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMPONENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.components = new ArrayList<PageComponentPb>(_list3.size);
                PageComponentPb _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new PageComponentPb();
                  _elem4.read(iprot);
                  struct.components.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setComponentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PagePb struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.path != null) {
        if (struct.isSetPath()) {
          oprot.writeFieldBegin(PATH_FIELD_DESC);
          oprot.writeString(struct.path);
          oprot.writeFieldEnd();
        }
      }
      if (struct.metaTags != null) {
        if (struct.isSetMetaTags()) {
          oprot.writeFieldBegin(META_TAGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.metaTags.size()));
            for (MetaTagPb _iter6 : struct.metaTags)
            {
              _iter6.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.components != null) {
        if (struct.isSetComponents()) {
          oprot.writeFieldBegin(COMPONENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.components.size()));
            for (PageComponentPb _iter7 : struct.components)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PagePbTupleSchemeFactory implements SchemeFactory {
    public PagePbTupleScheme getScheme() {
      return new PagePbTupleScheme();
    }
  }

  private static class PagePbTupleScheme extends TupleScheme<PagePb> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PagePb struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetPath()) {
        optionals.set(1);
      }
      if (struct.isSetMetaTags()) {
        optionals.set(2);
      }
      if (struct.isSetComponents()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
      if (struct.isSetMetaTags()) {
        {
          oprot.writeI32(struct.metaTags.size());
          for (MetaTagPb _iter8 : struct.metaTags)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetComponents()) {
        {
          oprot.writeI32(struct.components.size());
          for (PageComponentPb _iter9 : struct.components)
          {
            _iter9.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PagePb struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.metaTags = new ArrayList<MetaTagPb>(_list10.size);
          MetaTagPb _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new MetaTagPb();
            _elem11.read(iprot);
            struct.metaTags.add(_elem11);
          }
        }
        struct.setMetaTagsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.components = new ArrayList<PageComponentPb>(_list13.size);
          PageComponentPb _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new PageComponentPb();
            _elem14.read(iprot);
            struct.components.add(_elem14);
          }
        }
        struct.setComponentsIsSet(true);
      }
    }
  }

}

