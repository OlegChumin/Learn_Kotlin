fun main() {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * idx })

    val numbers2 = setOf(1, 2, 3)
    println(numbers2.mapNotNull { if ( it == 2) null else it * 3 })
    println(numbers2.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })

    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))
}