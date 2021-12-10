package cz.functionals.otobo4s

case class Password(v: String) extends AnyVal {
  override def toString: String = s"Password(*******)"
}
