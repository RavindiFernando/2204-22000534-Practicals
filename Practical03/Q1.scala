object ReverseString{
  def reverseString(input: String): String = {
    if (input.isEmpty) 
        ""
    else 
        reverseString(input.tail) + input.head
  }

  def main(args: Array[String]): Unit = {
    val str = "ravindi"
    println(s"Original string: $str")
    println(s"Reversed string: ${reverseString(str)}")  
  }
}

