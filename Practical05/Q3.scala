object Fibonacci {
  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      n
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  def printFibonacci(n: Int): Unit = {
    if (n <= 0) {
      println("Invalid input. Please enter a positive integer.")
    } else {
      println("Fibonacci Sequence:")
      for (i <- 0 until n) {
        print(s"${fibonacci(i)} ")
      }
      println()
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of Fibonacci numbers to print:")
    val n = scala.io.StdIn.readInt()
    printFibonacci(n)
  }
}
