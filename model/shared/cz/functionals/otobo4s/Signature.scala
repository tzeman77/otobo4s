package cz.functionals.otobo4s

import java.util.Date

case class Signature(
  id: Id[Signature],
  name: String,
  text: String,
  contentType: Option[String] = None,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])