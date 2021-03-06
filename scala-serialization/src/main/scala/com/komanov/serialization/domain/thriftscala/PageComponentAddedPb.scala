/**
 * Generated by Scrooge
 *   version: 4.7.0
 *   rev: d9d56174937f524a1981b38ebd6280eef7eeda4a
 *   built at: 20160427-121531
 */
package com.komanov.serialization.domain.thriftscala

import com.twitter.scrooge.{
  LazyTProtocol,
  TFieldBlob, ThriftException, ThriftStruct, ThriftStructCodec3, ThriftStructFieldInfo,
  ThriftStructMetaData, ThriftUtil}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.{TMemoryBuffer, TTransport}
import java.nio.ByteBuffer
import java.util.Arrays
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.collection.mutable.{
  ArrayBuffer => mutable$ArrayBuffer, Buffer => mutable$Buffer,
  HashMap => mutable$HashMap, HashSet => mutable$HashSet}
import scala.collection.{Map, Set}


object PageComponentAddedPb extends ThriftStructCodec3[PageComponentAddedPb] {
  private val NoPassthroughFields = immutable$Map.empty[Short, TFieldBlob]
  val Struct = new TStruct("PageComponentAddedPb")
  val PagePathField = new TField("pagePath", TType.STRING, 1)
  val PagePathFieldManifest = implicitly[Manifest[String]]
  val IdField = new TField("id", TType.STRING, 2)
  val IdFieldManifest = implicitly[Manifest[ByteBuffer]]
  val ComponentTypeField = new TField("componentType", TType.ENUM, 3)
  val ComponentTypeFieldI32 = new TField("componentType", TType.I32, 3)
  val ComponentTypeFieldManifest = implicitly[Manifest[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      PagePathField,
      true,
      false,
      PagePathFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      IdField,
      true,
      false,
      IdFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    ),
    new ThriftStructFieldInfo(
      ComponentTypeField,
      true,
      false,
      ComponentTypeFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String]
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: PageComponentAddedPb): Unit = {
  }

  def withoutPassthroughFields(original: PageComponentAddedPb): PageComponentAddedPb =
    new Immutable(
      pagePath =
        {
          val field = original.pagePath
          field.map { field =>
            field
          }
        },
      id =
        {
          val field = original.id
          field.map { field =>
            field
          }
        },
      componentType =
        {
          val field = original.componentType
          field.map { field =>
            field
          }
        }
    )

  override def encode(_item: PageComponentAddedPb, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }

  private[this] def lazyDecode(_iprot: LazyTProtocol): PageComponentAddedPb = {

    var pagePathOffset: Int = -1
    var id: Option[ByteBuffer] = None
    var componentType: Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = None

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                pagePathOffset = _iprot.offsetSkipString
    
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'pagePath' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
    
                id = Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
    
                componentType = Some(readComponentTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'componentType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      pagePathOffset,
      id,
      componentType,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): PageComponentAddedPb =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[this] def eagerDecode(_iprot: TProtocol): PageComponentAddedPb = {
    var pagePath: _root_.scala.Option[String] = _root_.scala.None
    var id: _root_.scala.Option[ByteBuffer] = _root_.scala.None
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.STRING =>
                pagePath = _root_.scala.Some(readPagePathValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'pagePath' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                id = _root_.scala.Some(readIdValue(_iprot))
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'id' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 3 =>
            _field.`type` match {
              case TType.I32 | TType.ENUM =>
                componentType = _root_.scala.Some(readComponentTypeValue(_iprot))
              case _actualType =>
                val _expectedType = TType.ENUM
                throw new TProtocolException(
                  "Received wrong type for field 'componentType' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      pagePath,
      id,
      componentType,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    pagePath: _root_.scala.Option[String] = _root_.scala.None,
    id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
    componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None
  ): PageComponentAddedPb =
    new Immutable(
      pagePath,
      id,
      componentType
    )

  def unapply(_item: PageComponentAddedPb): _root_.scala.Option[scala.Product3[Option[String], Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]]] = _root_.scala.Some(_item)


  @inline private def readPagePathValue(_iprot: TProtocol): String = {
    _iprot.readString()
  }

  @inline private def writePagePathField(pagePath_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(PagePathField)
    writePagePathValue(pagePath_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writePagePathValue(pagePath_item: String, _oprot: TProtocol): Unit = {
    _oprot.writeString(pagePath_item)
  }

  @inline private def readIdValue(_iprot: TProtocol): ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeIdField(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(IdField)
    writeIdValue(id_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeIdValue(id_item: ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(id_item)
  }

  @inline private def readComponentTypeValue(_iprot: TProtocol): com.komanov.serialization.domain.thriftscala.PageComponentTypePb = {
    com.komanov.serialization.domain.thriftscala.PageComponentTypePb.getOrUnknown(_iprot.readI32())
  }

  @inline private def writeComponentTypeField(componentType_item: com.komanov.serialization.domain.thriftscala.PageComponentTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ComponentTypeFieldI32)
    writeComponentTypeValue(componentType_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeComponentTypeValue(componentType_item: com.komanov.serialization.domain.thriftscala.PageComponentTypePb, _oprot: TProtocol): Unit = {
    _oprot.writeI32(componentType_item.value)
  }


  object Immutable extends ThriftStructCodec3[PageComponentAddedPb] {
    override def encode(_item: PageComponentAddedPb, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): PageComponentAddedPb = PageComponentAddedPb.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[PageComponentAddedPb] = PageComponentAddedPb.metaData
  }

  /**
   * The default read-only implementation of PageComponentAddedPb.  You typically should not need to
   * directly reference this class; instead, use the PageComponentAddedPb.apply method to construct
   * new instances.
   */
  class Immutable(
      val pagePath: _root_.scala.Option[String],
      val id: _root_.scala.Option[ByteBuffer],
      val componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PageComponentAddedPb {
    def this(
      pagePath: _root_.scala.Option[String] = _root_.scala.None,
      id: _root_.scala.Option[ByteBuffer] = _root_.scala.None,
      componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _root_.scala.None
    ) = this(
      pagePath,
      id,
      componentType,
      Map.empty
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      pagePathOffset: Int,
      val id: _root_.scala.Option[ByteBuffer],
      val componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends PageComponentAddedPb {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val pagePath: _root_.scala.Option[String] =
      if (pagePathOffset == -1)
        None
      else {
        Some(_proto.decodeString(_buf, pagePathOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the PageComponentAddedPb trait with additional state or
   * behavior and implement the read-only methods from PageComponentAddedPb using an underlying
   * instance.
   */
  trait Proxy extends PageComponentAddedPb {
    protected def _underlying_PageComponentAddedPb: PageComponentAddedPb
    override def pagePath: _root_.scala.Option[String] = _underlying_PageComponentAddedPb.pagePath
    override def id: _root_.scala.Option[ByteBuffer] = _underlying_PageComponentAddedPb.id
    override def componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = _underlying_PageComponentAddedPb.componentType
    override def _passthroughFields = _underlying_PageComponentAddedPb._passthroughFields
  }
}

trait PageComponentAddedPb
  extends ThriftStruct
  with scala.Product3[Option[String], Option[ByteBuffer], Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]]
  with java.io.Serializable
{
  import PageComponentAddedPb._

  def pagePath: _root_.scala.Option[String]
  def id: _root_.scala.Option[ByteBuffer]
  def componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1 = pagePath
  def _2 = id
  def _3 = componentType


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (pagePath.isDefined) {
                writePagePathValue(pagePath.get, _oprot)
                _root_.scala.Some(PageComponentAddedPb.PagePathField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (id.isDefined) {
                writeIdValue(id.get, _oprot)
                _root_.scala.Some(PageComponentAddedPb.IdField)
              } else {
                _root_.scala.None
              }
            case 3 =>
              if (componentType.isDefined) {
                writeComponentTypeValue(componentType.get, _oprot)
                _root_.scala.Some(PageComponentAddedPb.ComponentTypeField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            val _data = Arrays.copyOfRange(_buff.getArray, 0, _buff.length)
            _root_.scala.Some(TFieldBlob(_field, _data))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): PageComponentAddedPb = {
    var pagePath: _root_.scala.Option[String] = this.pagePath
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        pagePath = _root_.scala.Some(readPagePathValue(_blob.read))
      case 2 =>
        id = _root_.scala.Some(readIdValue(_blob.read))
      case 3 =>
        componentType = _root_.scala.Some(readComponentTypeValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      pagePath,
      id,
      componentType,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): PageComponentAddedPb = {
    var pagePath: _root_.scala.Option[String] = this.pagePath
    var id: _root_.scala.Option[ByteBuffer] = this.id
    var componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType

    _fieldId match {
      case 1 =>
        pagePath = _root_.scala.None
      case 2 =>
        id = _root_.scala.None
      case 3 =>
        componentType = _root_.scala.None
      case _ =>
    }
    new Immutable(
      pagePath,
      id,
      componentType,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetPagePath: PageComponentAddedPb = unsetField(1)

  def unsetId: PageComponentAddedPb = unsetField(2)

  def unsetComponentType: PageComponentAddedPb = unsetField(3)


  override def write(_oprot: TProtocol): Unit = {
    PageComponentAddedPb.validate(this)
    _oprot.writeStructBegin(Struct)
    if (pagePath.isDefined) writePagePathField(pagePath.get, _oprot)
    if (id.isDefined) writeIdField(id.get, _oprot)
    if (componentType.isDefined) writeComponentTypeField(componentType.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    pagePath: _root_.scala.Option[String] = this.pagePath,
    id: _root_.scala.Option[ByteBuffer] = this.id,
    componentType: _root_.scala.Option[com.komanov.serialization.domain.thriftscala.PageComponentTypePb] = this.componentType,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): PageComponentAddedPb =
    new Immutable(
      pagePath,
      id,
      componentType,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[PageComponentAddedPb]

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _root_.scala.runtime.ScalaRunTime._equals(this, other) &&
      _passthroughFields == other.asInstanceOf[PageComponentAddedPb]._passthroughFields

  override def hashCode: Int = _root_.scala.runtime.ScalaRunTime._hashCode(this)

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 3

  override def productElement(n: Int): Any = n match {
    case 0 => this.pagePath
    case 1 => this.id
    case 2 => this.componentType
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "PageComponentAddedPb"
}