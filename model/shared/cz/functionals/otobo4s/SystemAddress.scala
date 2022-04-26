package cz.functionals.otobo4s

import java.util.Date

case class SystemAddress(
  id: Id[SystemAddress],
  value0: String,
  value1: String,
  value2: Option[String] = None,
  value3: Option[String] = None,
  queueId: Id[Queue],
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
