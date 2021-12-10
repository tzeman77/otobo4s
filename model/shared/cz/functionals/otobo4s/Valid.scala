package cz.functionals.otobo4s

import java.util.Date

case class Valid(
  id: Id[Valid],
  name: String,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])

