object ArithmeticMean {
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    // Format the mean to two decimal places
    f"$mean%.2f".toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 44
    val num2 = 33
    println(s"Mean of $num1 and $num2 = ${arithmeticMean(num1, num2)}")
  }
}

