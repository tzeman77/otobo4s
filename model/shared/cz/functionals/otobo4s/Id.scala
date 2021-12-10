package cz.functionals.otobo4s

/**
 * Generic entity identifier, (phantom) type safe, database ID.
 * @param v ID value.
 * @tparam T Entity type.
 */
case class Id[+T](v: Int) extends AnyVal {
  def <(other: Id[_]): Boolean = v < other.v
  def >(other: Id[_]): Boolean = v > other.v
}

object Id {

  def empty[T]: Id[T] = Id[T](0)

  def unapply[T](s: String): Option[Id[T]] = s.toIntOption map Id[T]

}
