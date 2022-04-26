package cz.functionals.otobo4s

import java.util.Date

case class Sla(
  id: Id[Sla],
  name: String,
  calendarName: Option[String] = None,
  firstResponseTime: Option[Int] = None,
  firstResponseNotify: Option[Int] = None,
  updateTime: Option[Int] = None,
  updateNotify: Option[Int] = None,
  solutionTime: Option[Int] = None,
  solutionNotify: Option[Int] = None,
  validId: Id[Valid],
  comments: Option[String] = None,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
