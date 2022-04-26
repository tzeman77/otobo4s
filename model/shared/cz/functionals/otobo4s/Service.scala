package cz.functionals.otobo4s

import java.util.Date

case class Service(
  id: Id[Service],
  name: String,
  validId: Id[Valid],
  comments: Option[String] = None,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])