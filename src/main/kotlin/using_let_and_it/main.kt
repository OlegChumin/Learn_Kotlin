package using_let_and_it

fun main() {
    List("3".toInt()) { readln().toInt() }.let {
        println(
            when {
                it[2] in it[0]..it[1] -> "Normal"
                it[2] < it[0] -> "Deficiency"
                it[2] > it[1] -> "Excess"
                else -> ""
            }
        )
    }
}