object ExpressionEvaluator {
    var a: Int = 2;
    var b: Int = 3;
    var c: Int = 4;
    var d: Int = 5;
    var k: Float = 4.3f;

    def evaluateExpressionA(): Unit = {
        b -= 1
        val temp = b * a + c * d;
        d -= 1
        println(temp)
    }

    def evaluateExpressionB(): Unit = {
        println(a)
        a += 1
    }

    def evaluateExpressionC(): Unit = {
        var g = 0.0f 
        println(-2 * (g - k) + c)
    }

    def evaluateExpressionD(): Unit = {
        val temp = c
        c += 1
        println(temp)
    }

    def evaluateExpressionE(): Unit = {
        c += 1 
        val temp = c * a
        a += 1 
        c = temp
        println(c)
    }

    def main(args: Array[String]): Unit = {
        evaluateExpressionA()
        evaluateExpressionB()
        evaluateExpressionC()
        evaluateExpressionD()
        evaluateExpressionE()
    }
}
