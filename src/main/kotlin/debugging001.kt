fun printXor(condition1: Int, condition2: Int) {
    println(condition1 xor condition2)
}

fun main() {
    val condition1 = 175892
    val condition2 = 98795

    if (condition1 and condition2 > 35925) // 175892 and 98795 = 33024 < 35925 as A and B 1010(10) and 1100(12) == 1000 (8)
        printXor(condition1 - condition2, condition1 or condition2) // 1
    else
        printXor(condition1 xor condition2, condition1 and condition2) // 2
    //condition1 xor condition2 == 208 639  condition1 and condition2 == 33024
    //condition1 xor condition2 == 241 663
}
