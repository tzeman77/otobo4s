package cz.functionals.otobo4s

import java.util.Date

case class TicketStateType(
  id: Id[TicketStateType],
  name: String,
  comments: Option[String] = None,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
