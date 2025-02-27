/*
 * This file was generated by guardrail (https://github.com/guardrail-dev/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
 */
package sell.fulfillment.definitions

import cats.syntax.either._
import io.circe._
import io.circe.syntax._
import cats.implicits._
import _root_.sell.fulfillment.Implicits._
case class FileInfo(fileId: Option[String] = None, fileType: Option[String] = None, name: Option[String] = None, uploadedDate: Option[String] = None)
object FileInfo {
  implicit val encodeFileInfo: _root_.io.circe.Encoder.AsObject[FileInfo] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[FileInfo](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("fileId", a.fileId.asJson), ("fileType", a.fileType.asJson), ("name", a.name.asJson), ("uploadedDate", a.uploadedDate.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeFileInfo: _root_.io.circe.Decoder[FileInfo] = new _root_.io.circe.Decoder[FileInfo] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[FileInfo] = for (v0 <- c.downField("fileId").as[Option[String]]; v1 <- c.downField("fileType").as[Option[String]]; v2 <- c.downField("name").as[Option[String]]; v3 <- c.downField("uploadedDate").as[Option[String]]) yield FileInfo(v0, v1, v2, v3) }
}