// complete this function, add default values
//fun carPrice(old: Int, kilometers, maximumSpeed: Int, automatic: Boolean){
//
//}

// complete this function, add default values
const val DEFAULT_CAR_YEARS_OLD = 5
const val DEFAULTS_CAR_KILOMETERS_PASSED = 100_000
const val DEFAULT_CAR_MAX_SPEED = 120
const val DEFAULT_CAR_IS_AUTOMATIC_TRANSMISSION = false
const val CAR_PRICE_BONUS_IS_AUTOMATIC_TRANSMISSION = 1500
const val INITIAL_CAR_PRICE = 20_000
const val CAR_PRICE_YEARS_OLD_MALUS = 2000
const val CAR_PRICE_BONUS_MALUS_FOR_MAX_SPEED = 100
const val CAR_PRICE_DISTANCE_MALUS = 10_000
const val CAR_PRICE_DISTANCE_DECREASE = 200
fun carPrice(old: Int, kilometers: Int, maximumSpeed: Int, automatic: Boolean){
    var carPrice = INITIAL_CAR_PRICE
    carPrice -= (old - DEFAULT_CAR_YEARS_OLD) * CAR_PRICE_YEARS_OLD_MALUS
    carPrice += (maximumSpeed - DEFAULT_CAR_MAX_SPEED) * CAR_PRICE_BONUS_MALUS_FOR_MAX_SPEED
    carPrice += (DEFAULTS_CAR_KILOMETERS_PASSED - kilometers) / CAR_PRICE_DISTANCE_MALUS * CAR_PRICE_DISTANCE_DECREASE
    carPrice = if (automatic) carPrice + CAR_PRICE_BONUS_IS_AUTOMATIC_TRANSMISSION
    else carPrice
    println(carPrice)
}

fun main() {
//    carPrice(5, 119_999, 130, false)
    val numbers = mutableListOf(1, 2, 3, 4, 5)

//    for (element in numbers) {
//        println(element)
//    }

//    for (i in numbers.indices) {
//        println(i)
//    }
//    for (i in numbers.indices) {
//        println(i)
//    }

    for (i in numbers.indices) {
        println(numbers[i])
    }

}