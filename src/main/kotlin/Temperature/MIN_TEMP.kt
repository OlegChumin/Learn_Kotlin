package Temperature

const val MIN_TEMP = -92
const val MAX_TEMP = 57
const val AVERAGE_TEMP_DUBAI = 30
const val AVERAGE_TEMP_MOSCOW = 5
const val AVERAGE_TEMP_HANOI = 20

data class City(val name: String) {
    var degrees: Int = 0
}

fun main() {
    findColdestCity(adjustTemperatures(readDataFromConsole()))
        .takeIf { it.size == 1 }
        ?.let { println("${it.first().name}") }
        ?: println("neither")
}

fun findColdestCity(temperatureMap: LinkedHashMap<String, Int>): List<City> {
    val minTemperature = temperatureMap.values.minOrNull()

    return temperatureMap.filterValues { it == minTemperature }
        .keys
        .map { City(it) }
}

fun readDataFromConsole(): LinkedHashMap<String, Int> {
    val currentTempList = List("3".toInt()) { readln().toInt() }
    val currentTempMap = linkedMapOf(
        "Dubai" to currentTempList.first(),
        "Moscow" to currentTempList["1".toInt()],
        "Hanoi" to currentTempList.last()
    )
    return currentTempMap
}

fun adjustTemperatures(inputMap: LinkedHashMap<String, Int>): LinkedHashMap<String, Int> {
    val averageTempMap: LinkedHashMap<String, Int> = linkedMapOf(
        "Dubai" to AVERAGE_TEMP_DUBAI,
        "Moscow" to AVERAGE_TEMP_MOSCOW,
        "Hanoi" to AVERAGE_TEMP_HANOI
    )

    return linkedMapOf<String, Int>().apply {
        inputMap.forEach { (city, temperature) ->
            this[city] = when {
                temperature < MIN_TEMP || temperature > MAX_TEMP -> averageTempMap[city] ?: temperature
                else -> temperature
            }
        }
    }
}
