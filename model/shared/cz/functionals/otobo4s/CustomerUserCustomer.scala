package cz.functionals.otobo4s

import java.util.Date

case class CustomerUserCustomer(
  userId: String,
  customerId: CustomerId,
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
