class Person(val name: String, val age: Int) {
    init {
        require(name.isNotEmpty()) { "Name cannot be empty" }
        require(age >= 0) { "Age cannot be negative" }
        check(name.length <= 100) { "Name length should not exceed 100 characters" }
    }
}

fun main() {
    try {
        val person1 = Person("", 30) // выбросит IllegalArgumentException с сообщением "Name cannot be empty"
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val person2 = Person("John", -5) // выбросит IllegalArgumentException с сообщением "Age cannot be negative"
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val person3 = Person("A".repeat(101), 30) // выбросит IllegalStateException с сообщением "Name length should not exceed 100 characters"
    } catch (e: IllegalStateException) {
        println(e.message)
    }
}
