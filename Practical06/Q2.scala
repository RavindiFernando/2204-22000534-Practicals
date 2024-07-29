import scala.io.StdIn.readLine

object StudentRecords {

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total marks must be positive integers."))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    println("Enter student's name:")
    val name = readLine()
    println("Enter student's marks:")
    val marks = readLine().toInt
    println("Enter total possible marks:")
    val totalMarks = readLine().toInt

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
    if (!isValid) {
      println(s"Error: ${errorMessage.get}")
      getStudentInfo()
    } else {
      val percentage = (marks.toDouble / totalMarks) * 100
      val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
      (name, marks, totalMarks, percentage, grade)
    }
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks: $marks")
    println(s"Total Marks: $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D')
    while (!isValid) {
      studentInfo = getStudentInfo()
      val (name, marks, totalMarks, _, _) = studentInfo
      val validation = validateInput(name, marks, totalMarks)
      isValid = validation._1
      if (!isValid) {
        println(s"Error: ${validation._2.get}")
      }
    }
    studentInfo
  }

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }
}
