fun main() {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * idx })

    val numbers2 = setOf(1, 2, 3)
    println(numbers2.mapNotNull { if (it == 2) null else it * 3 })
    println(numbers2.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })
    println()

    val colors = listOf("red", "brown", "grey")
    println("colors: $colors")
    val animals = listOf("fox", "bear", "wolf")
    println("animals: $animals")
    println("colors zip animals: ${colors zip animals}")
    println()

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))
    println()

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    val numbers3 = listOf("one", "two", "three", "four")
    println("numbers3: $numbers3")
    println(numbers3.associateWith { it.length })
    println()

    val numbers4 = listOf("one", "two", "three", "four")
    println("numbers4: $numbers4")
    println("numbers4.associateBy { it.first().uppercaseChar(): ${numbers4.associateBy { it.first().uppercaseChar() }}")
    println("numbers4.associateBy(keySelector = { it.first().uppercaseChar() }, valueTransform = { it.length })" +
            ": ${numbers4.associateBy(keySelector = { it.first().uppercaseChar() }, valueTransform = { it.length })}")
}