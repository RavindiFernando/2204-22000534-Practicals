object TotalRunningTimeApp {
  def totalRunningTime(easyDistance: Int, easyPace: Int, tempoDistance: Int, tempoPace: Int): Int = {
    (easyDistance * easyPace) + (tempoDistance * tempoPace) + (easyDistance * easyPace)
  }

  def main(args: Array[String]): Unit = {
    val totalTime = totalRunningTime(2, 8, 3, 7)
    println(s"Total running time = $totalTime minutes")
  }
}
