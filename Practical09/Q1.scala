object InterestCalculator {
  def calculateInterest(deposit: Double): Double = {
    val interestRate: Double => Double = depositAmount => depositAmount match {
      case d if d <= 20000 => d * 0.02  
      case d if d <= 200000 => d * 0.04 
      case d if d <= 2000000 => d * 0.035 
      case _ => depositAmount * 0.065
    }

    interestRate(deposit)
  }

  def main(args: Array[String]): Unit = {
    val deposits = List(15000.0, 50000.0, 250000.0, 3000000.0)
    
    deposits.foreach { deposit =>
      println(f"Deposit: Rs. $deposit%.2f, Interest: Rs. ${calculateInterest(deposit)}%.2f")
    }
  }
}
