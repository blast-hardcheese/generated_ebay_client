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
case class LineItemProperties(buyerProtection: Option[Boolean] = None, fromBestOffer: Option[Boolean] = None, soldViaAdCampaign: Option[Boolean] = None)
object LineItemProperties {
  implicit val encodeLineItemProperties: _root_.io.circe.Encoder.AsObject[LineItemProperties] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[LineItemProperties](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("buyerProtection", a.buyerProtection.asJson), ("fromBestOffer", a.fromBestOffer.asJson), ("soldViaAdCampaign", a.soldViaAdCampaign.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeLineItemProperties: _root_.io.circe.Decoder[LineItemProperties] = new _root_.io.circe.Decoder[LineItemProperties] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[LineItemProperties] = for (v0 <- c.downField("buyerProtection").as[Option[Boolean]]; v1 <- c.downField("fromBestOffer").as[Option[Boolean]]; v2 <- c.downField("soldViaAdCampaign").as[Option[Boolean]]) yield LineItemProperties(v0, v1, v2) }
}