package cz.functionals.otobo4s

import java.util.Date

case class TicketPriority(
  id: Id[TicketPriority],
  name: String,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])