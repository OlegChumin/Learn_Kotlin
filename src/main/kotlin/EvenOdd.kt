fun main() {
    var sum = 0                                                // 1
    var countOdd = 0                                           // 2
    var countEven = 0                                          // 3
    val intsList = listOf<Int>(25, 14, 32, 13, 11, 55, 32, 21) // 4

    for (i in intsList) { // 5
        if (i % 2 == 0) { // 6
            sum += i      // 7
            countEven--   // 8
        } else {          // 9
            countOdd++    // 10
        }
    }
    println(countOdd)     // 11
}