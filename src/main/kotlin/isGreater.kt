fun main() = List("4".toInt()) { readln().toInt() }.let {
    println(it.first() + it["1".toInt()] > it["2".toInt()] + it.last())
}

//fun main() {
//    val listSize = "4".toInt()
//    val numbers = List(listSize) { readln().toInt() }
//    val sumFirstTwo = numbers.take(2).fold(0) { acc, num -> acc + num }
//    val sumLastTwo = numbers.takeLast(2).fold(0) { acc, num -> acc + num }
//    println(sumFirstTwo > sumLastTwo)
//}