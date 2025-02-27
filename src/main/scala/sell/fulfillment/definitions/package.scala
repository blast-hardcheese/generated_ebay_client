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
object definitions$ {
  val guardrailDecodeInstant: _root_.io.circe.Decoder[java.time.Instant] = _root_.io.circe.Decoder[java.time.Instant].or(_root_.io.circe.Decoder[_root_.scala.Long].map(java.time.Instant.ofEpochMilli))
  val guardrailDecodeLocalDate: _root_.io.circe.Decoder[java.time.LocalDate] = _root_.io.circe.Decoder[java.time.LocalDate].or(_root_.io.circe.Decoder[java.time.Instant].map(_.atZone(java.time.ZoneOffset.UTC).toLocalDate))
  val guardrailDecodeLocalDateTime: _root_.io.circe.Decoder[java.time.LocalDateTime] = _root_.io.circe.Decoder[java.time.LocalDateTime]
  val guardrailDecodeLocalTime: _root_.io.circe.Decoder[java.time.LocalTime] = _root_.io.circe.Decoder[java.time.LocalTime]
  val guardrailDecodeOffsetDateTime: _root_.io.circe.Decoder[java.time.OffsetDateTime] = _root_.io.circe.Decoder[java.time.OffsetDateTime].or(_root_.io.circe.Decoder[java.time.Instant].map(_.atZone(java.time.ZoneOffset.UTC).toOffsetDateTime))
  val guardrailDecodeZonedDateTime: _root_.io.circe.Decoder[java.time.ZonedDateTime] = _root_.io.circe.Decoder[java.time.ZonedDateTime]
  val guardrailDecodeBase64String: _root_.io.circe.Decoder[Base64String] = _root_.io.circe.Decoder[_root_.scala.Predef.String].emapTry(v => scala.util.Try(java.util.Base64.getDecoder.decode(v))).map(new Base64String(_))
  val guardrailEncodeInstant: _root_.io.circe.Encoder[java.time.Instant] = _root_.io.circe.Encoder[java.time.Instant]
  val guardrailEncodeLocalDate: _root_.io.circe.Encoder[java.time.LocalDate] = _root_.io.circe.Encoder[java.time.LocalDate]
  val guardrailEncodeLocalDateTime: _root_.io.circe.Encoder[java.time.LocalDateTime] = _root_.io.circe.Encoder[java.time.LocalDateTime]
  val guardrailEncodeLocalTime: _root_.io.circe.Encoder[java.time.LocalTime] = _root_.io.circe.Encoder[java.time.LocalTime]
  val guardrailEncodeOffsetDateTime: _root_.io.circe.Encoder[java.time.OffsetDateTime] = _root_.io.circe.Encoder[java.time.OffsetDateTime]
  val guardrailEncodeZonedDateTime: _root_.io.circe.Encoder[java.time.ZonedDateTime] = _root_.io.circe.Encoder[java.time.ZonedDateTime]
  val guardrailEncodeBase64String: _root_.io.circe.Encoder[Base64String] = _root_.io.circe.Encoder[_root_.scala.Predef.String].contramap[Base64String](v => new _root_.scala.Predef.String(java.util.Base64.getEncoder.encode(v.data)))
}
package object definitions {
  implicit val guardrailDecodeInstant: _root_.io.circe.Decoder[java.time.Instant] = definitions$.guardrailDecodeInstant
  implicit val guardrailDecodeLocalDate: _root_.io.circe.Decoder[java.time.LocalDate] = definitions$.guardrailDecodeLocalDate
  implicit val guardrailDecodeLocalDateTime: _root_.io.circe.Decoder[java.time.LocalDateTime] = definitions$.guardrailDecodeLocalDateTime
  implicit val guardrailDecodeLocalTime: _root_.io.circe.Decoder[java.time.LocalTime] = definitions$.guardrailDecodeLocalTime
  implicit val guardrailDecodeOffsetDateTime: _root_.io.circe.Decoder[java.time.OffsetDateTime] = definitions$.guardrailDecodeOffsetDateTime
  implicit val guardrailDecodeZonedDateTime: _root_.io.circe.Decoder[java.time.ZonedDateTime] = definitions$.guardrailDecodeZonedDateTime
  implicit val guardrailDecodeBase64String: _root_.io.circe.Decoder[Base64String] = definitions$.guardrailDecodeBase64String
  implicit val guardrailEncodeInstant: _root_.io.circe.Encoder[java.time.Instant] = definitions$.guardrailEncodeInstant
  implicit val guardrailEncodeLocalDate: _root_.io.circe.Encoder[java.time.LocalDate] = definitions$.guardrailEncodeLocalDate
  implicit val guardrailEncodeLocalDateTime: _root_.io.circe.Encoder[java.time.LocalDateTime] = definitions$.guardrailEncodeLocalDateTime
  implicit val guardrailEncodeLocalTime: _root_.io.circe.Encoder[java.time.LocalTime] = definitions$.guardrailEncodeLocalTime
  implicit val guardrailEncodeOffsetDateTime: _root_.io.circe.Encoder[java.time.OffsetDateTime] = definitions$.guardrailEncodeOffsetDateTime
  implicit val guardrailEncodeZonedDateTime: _root_.io.circe.Encoder[java.time.ZonedDateTime] = definitions$.guardrailEncodeZonedDateTime
  implicit val guardrailEncodeBase64String: _root_.io.circe.Encoder[Base64String] = definitions$.guardrailEncodeBase64String
}