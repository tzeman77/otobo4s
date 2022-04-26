package cz.functionals.otobo4s

import java.util.Date

case class GroupsTable(
  id: Id[GroupsTable],
  name: String,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])