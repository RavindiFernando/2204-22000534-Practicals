object NameFormatter {
  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    println(formatNames(names(0), toUpper)) 
    println(formatNames(names(1), name => name.head.toUpper + name.tail.toLowerCase))  
    println(formatNames(names(2), toLower)) 
    println(formatNames(names(3), name => name.init + name.last.toUpper)) 
  }
}
