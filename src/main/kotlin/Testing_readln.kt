fun main() {
//    showReadlnSpril()
    showWhenExpression()
}

fun showReadlnSpril(): Unit {
    val (numberOne, numberTwo, numberThree, numberFour) = readln().split(" ")
    println("$numberOne $numberTwo $numberThree $numberFour")
}

fun showWhenExpression() {
    val (variableOne, operation, variableTwo) = readln().split(" ")

    val a = variableOne.toInt()
    val b = variableTwo.toInt()

    when (operation) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}