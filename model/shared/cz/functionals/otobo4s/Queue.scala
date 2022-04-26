package cz.functionals.otobo4s

import java.util.Date

case class Queue(
  id: Id[Queue],
  name: String,
  groupId: Id[GroupsTable],
  unlockTimeout: Option[Int] = None,
  firstResponseTime: Option[Int] = None,
  firstResponseNotify: Option[Int] = None,
  updateTime: Option[Int] = None,
  updateNotify: Option[Int] = None,
  solutionTime: Option[Int] = None,
  solutionNotify: Option[Int] = None,
  systemAddressId: Id[SystemAddress],
  calendarName: Option[String] = None,
  defaultSignKey: Option[String] = None,
  salutationId: Id[Salutation],
  signatureId: Id[Signature],
  followUpId: Id[FollowUpPossible],
  followUpLock: Int,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
