object EvaluateExpressions {
  def main(args: Array[String]): Unit = {
    var i,j,k = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    val A = k + 12 * m
    val B = m / j
    val C = n % j
    val D = m / j * j
    val E = f + 10 * 5 + g
    i += 1
    val F = i * n

    println(s"k + 12 * m = $A")
    println(s"m / j = $B")
    println(s"n % j = $C")
    println(s"m / j * j = $D")
    println(s"f + 10 * 5 + g = $E")
    println(s"++i * n = $F")
  }
}
