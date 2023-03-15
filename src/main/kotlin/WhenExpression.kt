fun main() {
    val a = 10
    val b = 11

    when {
        a < 2 -> print(1)
        b > 3 -> print(2)
        a < b -> print(3)
    }
}