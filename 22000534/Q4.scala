object TotalCost {
  def totalCost(numBooks: Int): Double = { 
    val total = numBooks * 24.95 * (1.0 - 0.4)
    
    if (numBooks <= 50) {
      total + 3.0
    } else {
      total+ 3.0 + (numBooks - 50) * 0.75
    }
  }

  def main(args: Array[String]): Unit = {
    val totalWholesaleCost = totalCost(60)
    println(s"The total wholesale cost =  Rs. $totalWholesaleCost")
  }
}
