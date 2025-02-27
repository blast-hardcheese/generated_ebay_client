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
case class AddEvidencePaymentDisputeRequest(evidenceType: Option[String] = None, files: Option[_root_.scala.Vector[FileEvidence]] = None, lineItems: Option[_root_.scala.Vector[OrderLineItems]] = None)
object AddEvidencePaymentDisputeRequest {
  implicit val encodeAddEvidencePaymentDisputeRequest: _root_.io.circe.Encoder.AsObject[AddEvidencePaymentDisputeRequest] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[AddEvidencePaymentDisputeRequest](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("evidenceType", a.evidenceType.asJson), ("files", a.files.asJson), ("lineItems", a.lineItems.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeAddEvidencePaymentDisputeRequest: _root_.io.circe.Decoder[AddEvidencePaymentDisputeRequest] = new _root_.io.circe.Decoder[AddEvidencePaymentDisputeRequest] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[AddEvidencePaymentDisputeRequest] = for (v0 <- c.downField("evidenceType").as[Option[String]]; v1 <- c.downField("files").as[Option[_root_.scala.Vector[FileEvidence]]]; v2 <- c.downField("lineItems").as[Option[_root_.scala.Vector[OrderLineItems]]]) yield AddEvidencePaymentDisputeRequest(v0, v1, v2) }
}