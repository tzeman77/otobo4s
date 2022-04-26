package cz.functionals.otobo4s

import java.util.Date

case class FollowUpPossible(
  id: Id[FollowUpPossible],
  name: String,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
