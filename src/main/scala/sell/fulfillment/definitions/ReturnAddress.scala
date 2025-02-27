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
case class ReturnAddress(addressLine1: Option[String] = None, addressLine2: Option[String] = None, city: Option[String] = None, country: Option[String] = None, county: Option[String] = None, fullName: Option[String] = None, postalCode: Option[String] = None, primaryPhone: Option[Phone] = None, stateOrProvince: Option[String] = None)
object ReturnAddress {
  implicit val encodeReturnAddress: _root_.io.circe.Encoder.AsObject[ReturnAddress] = {
    val readOnlyKeys = _root_.scala.Predef.Set[_root_.scala.Predef.String]()
    _root_.io.circe.Encoder.AsObject.instance[ReturnAddress](a => _root_.io.circe.JsonObject.fromIterable(_root_.scala.Vector(("addressLine1", a.addressLine1.asJson), ("addressLine2", a.addressLine2.asJson), ("city", a.city.asJson), ("country", a.country.asJson), ("county", a.county.asJson), ("fullName", a.fullName.asJson), ("postalCode", a.postalCode.asJson), ("primaryPhone", a.primaryPhone.asJson), ("stateOrProvince", a.stateOrProvince.asJson)))).mapJsonObject(_.filterKeys(key => !(readOnlyKeys contains key)))
  }
  implicit val decodeReturnAddress: _root_.io.circe.Decoder[ReturnAddress] = new _root_.io.circe.Decoder[ReturnAddress] { final def apply(c: _root_.io.circe.HCursor): _root_.io.circe.Decoder.Result[ReturnAddress] = for (v0 <- c.downField("addressLine1").as[Option[String]]; v1 <- c.downField("addressLine2").as[Option[String]]; v2 <- c.downField("city").as[Option[String]]; v3 <- c.downField("country").as[Option[String]]; v4 <- c.downField("county").as[Option[String]]; v5 <- c.downField("fullName").as[Option[String]]; v6 <- c.downField("postalCode").as[Option[String]]; v7 <- c.downField("primaryPhone").as[Option[Phone]]; v8 <- c.downField("stateOrProvince").as[Option[String]]) yield ReturnAddress(v0, v1, v2, v3, v4, v5, v6, v7, v8) }
}