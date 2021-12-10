package cz.functionals.otobo4s

import java.util.Date

case class Users(
  id: Id[Users],
  login: String,
  pw: Password,
  title: Option[String] = None,
  firstName: String,
  lastName: String,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])

