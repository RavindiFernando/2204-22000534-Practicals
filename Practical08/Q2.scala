object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    if (args.length == 0) {
      println("Please provide an integer as an argument.")
      return
    }

    val input = args(0).toInt

    val categorizeNumber: Int => String = {
      case x if x % 15 == 0 => "Multiple of Both Three and Five"
      case x if x % 3 == 0 => "Multiple of Three"
      case x if x % 5 == 0 => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(categorizeNumber(input))
  }
}
