fun main() {
    val str = "Hello, Kotlin"
    var i = str.lastIndex
    while (i >= 1) {
        print(str[i])
        i--
    }
}