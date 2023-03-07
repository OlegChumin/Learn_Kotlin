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
        "+", "plus" -> println(a + b)
        "-", "minus" -> println(a - b)
        "*", "times" -> println(a * b)
        else -> println("Unknown operator")
    }
}