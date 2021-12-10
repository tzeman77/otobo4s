package cz.functionals.otobo4s

import java.util.Date

case class CustomerCompany(
  customerId: CustomerId,
  name: String,
  street: Option[String] = None,
  zip: Option[String] = None,
  city: Option[String] = None,
  country: Option[String] = None,
  url: Option[String] = None,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])
