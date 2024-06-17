object VolumeOfSphere {
  def volumeOfSphere(radius: Double): Double = {
    (4.0 / 3.0) * math.Pi * radius * radius * radius
  }

  def main(args: Array[String]): Unit = {
    val volumeSphere = volumeOfSphere(5)
    println(s"Volume of the sphere = $volumeSphere cubic units.")
  }
}
