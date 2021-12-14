package cz.functionals.otobo4s

import java.util.Date

case class CustomerUser(
  id: Id[CustomerUser],
  login: String, /* UNIQUE */
  email: String,
  customerId: CustomerId,
  pw: Option[Password] = None,
  title: Option[String] = None,
  firstName: String,
  lastName: String,
  phone: Option[String] = None,
  fax: Option[String] = None,
  mobile: Option[String] = None,
  street: Option[String] = None,
  zip: Option[String] = None,
  city: Option[String] = None,
  country: Option[String] = None,
  comments: Option[String] = None,
  validId: Id[Valid],
  createTime: Date,
  createBy: Id[Users],
  changeTime: Date,
  changeBy: Id[Users])