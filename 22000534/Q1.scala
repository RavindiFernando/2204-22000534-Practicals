object AreaOfDisk {
  def areaOfDisk(radius: Double): Double = {
    math.Pi* radius * radius
  }

  def main(args: Array[String]): Unit = {
    val area = areaOfDisk(5)
    println(s"Area = $area square units.")
  }
}
