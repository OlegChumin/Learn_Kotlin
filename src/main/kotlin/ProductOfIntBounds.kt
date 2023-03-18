fun main() {
    println(productOfIntFromBounds(readDataFromConsole()))
}

data class IntBounds(val lowBounds: Int, val upperBounds: Int)

fun readDataFromConsole() = IntBounds(readln().toInt(), readln().toInt())

fun productOfIntFromBounds(bounds: IntBounds): Long {
    var result = 1L
    for (iterator in bounds.lowBounds until bounds.upperBounds) result *= iterator
    return result
}