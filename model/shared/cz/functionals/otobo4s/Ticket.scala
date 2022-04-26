package cz.functionals.otobo4s

import java.util.Date

case class Ticket(
  id: Id[Ticket],
  tn: String,
  title: Option[String] = None,
  queueId: Id[Queue],
  ticketLockId: Id[TicketLockType],
  typeId: Option[Id[TicketType]] = None,
  serviceId: Option[Id[Service]] = None,
  slaId: Option[Id[Sla]] = None,
  userId: Id[Users],
  responsibleUserId: Id[Users],
  ticketPriorityId: Id[TicketPriority],
  ticketStateId: Id[TicketState],
  customerId: Option[CustomerId] = None,
  customerUserId: Option[String] = None,
  timeout: Int,
  untilTime: Int,
  escalationTime: Int,
  escalationUpdateTime: Int,
  escalationResponseTime: Int,
  escalationSolutionTime: Int,
  archiveFlag: Int,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
