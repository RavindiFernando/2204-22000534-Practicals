object NumberChecker {
  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      val input = args(0).toInt
      
      val result = (input: Int) => input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      println(result(input))
    }
  }
}
