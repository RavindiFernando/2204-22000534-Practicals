object FilterStrings {
  def filterStringsByLength(strings: List[String]): List[String] = {
    var result = List[String]()
    for (str <- strings) {
      if (str.length > 5) {
        result = result :+ str
      }
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("Ravindi", "Oneli", "Nidni", "Malitha", "Mithara")
    val filteredList = filterStringsByLength(inputList)
    println("Original List: " + inputList)
    println("Filtered List: " + filteredList)
  }
}

