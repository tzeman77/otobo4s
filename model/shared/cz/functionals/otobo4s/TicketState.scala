package cz.functionals.otobo4s

import java.util.Date

case class TicketState(
  id: Id[TicketState],
  name: String,
  comments: Option[String] = None,
  typeId: Id[TicketStateType],
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
