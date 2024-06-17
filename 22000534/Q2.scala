object CelsiusToFahrenheit {
  def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32.0
  }

  def main(args: Array[String]): Unit = {
    val fahrenheit = celsiusToFahrenheit(35.0)
    println(s"Fahrenheit : $fahrenheit degrees" )
  }
}
