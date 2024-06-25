object TheaterProfitCalculator {

  val basePrice = 15
  val baseAttendance = 120
  val attendanceChange = 20
  val fixedCost = 500
  val costPerAttendee = 3

  def attendance(ticket: Int): Int = {
    baseAttendance + ((basePrice - ticket) / 5) * attendanceChange
  }

  def calculateCost(ticket: Int): Int = {
    fixedCost + attendance(ticket) * costPerAttendee
  }

  def calculateProfit(ticket: Int): Int = {
    ticket * attendance(ticket) - calculateCost(ticket)
  }

  def findBestTicketPrice(): Int = {
    (0 to 100 by 5).maxBy(calculateProfit)
  }

  def main(args: Array[String]): Unit = {
    val bestPrice = findBestTicketPrice()
    val bestProfit = calculateProfit(bestPrice)
    
    println(s"Best ticket price: Rs. $bestPrice")
    println(s"Highest profit: Rs. $bestProfit")
  }
}
