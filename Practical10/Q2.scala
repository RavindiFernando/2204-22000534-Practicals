class Fraction(val numerator: Int, val denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")

  def neg: Fraction = new Fraction(-numerator, denominator)

  def subtract(that: Fraction): Fraction = {
    val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
    val newDenominator = this.denominator * that.denominator
    new Fraction(newNumerator, newDenominator)
  }

  override def toString: String = s"$numerator/$denominator"
}

object FractionSubtractionMain extends App {
  val a = new Fraction(3, 4)
  val b = new Fraction(5, 8)
  val c = new Fraction(2, 7)
  val result = a.subtract(b.subtract(c))
  println(result)  
}
