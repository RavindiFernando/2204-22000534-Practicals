object NameFormatter {
  def toUpper(name: String): String = name.toUpperCase
  
  def toLower(name: String): String = name.toLowerCase
  
  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames("Benny")(toUpper))         
    println(formatNames("Niroshan")(name => {
      val (firstTwo, rest) = name.splitAt(2)
      firstTwo.toUpperCase + rest
    }))                                            
    println(formatNames("Saman")(toLower))         
    println(formatNames("Kumara")(name => {
      val (first, rest) = name.splitAt(name.length - 1)
      first + rest.toUpperCase
    }))                                            /
  }
}
