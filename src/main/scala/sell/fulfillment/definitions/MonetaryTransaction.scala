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
case class MonetaryTransaction(date: Option[String] = None, `type`: Option[String] = None, reason: Option[String] = None, amount: Option[DisputeAmount] = None)
object MonetaryTransaction {
  implicit val encodeMonetaryTransaction: _root_.io.circe.Encoder.AsObject[MonetaryTransaction] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[MonetaryTransaction](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("date", a.date.asJson), ("type", a.`type`.asJson), ("reason", a.reason.asJson), ("amount", a.amount.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeMonetaryTransaction: _root_.io.circe.Decoder[MonetaryTransaction] = new _root_.io.circe.Decoder[MonetaryTransaction] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[MonetaryTransaction] = for (v0 <- c.downField("date").as[Option[String]]; v1 <- c.downField("type").as[Option[String]]; v2 <- c.downField("reason").as[Option[String]]; v3 <- c.downField("amount").as[Option[DisputeAmount]]) yield MonetaryTransaction(v0, v1, v2, v3) }
}