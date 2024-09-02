class Rational(val numerator: Int, val denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")

  def neg: Rational = new Rational(-numerator, denominator)

  override def toString: String = s"$numerator/$denominator"
}

object RationalMain extends App {
  val x = new Rational(3, 4)
  println(x.neg) 
}
