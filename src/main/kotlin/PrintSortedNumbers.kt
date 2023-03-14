import java.util.*
import kotlin.math.abs

/**
 * Invocation
 * Imagine you have a function that outputs three sorted numbers:
 * fun printSortedNumbers(a: Int, b: Int, c: Int, asc: Boolean = true, abs: Boolean = false) = ...
 * You can change the sorting order with an asc parameter. By default, the function sorts values in ascending order.
 * Also, if you set abs = true, you can sort the numbers by the absolute value.
 * Example: printSortedNumbers(-6, -2, 4, false, true)  // prints -6 4 -2
 * */
const val INIT_VALUE_ZERO = 0

fun main() {
//    printSortedNumbers(-6, -2, 4, false, true)
    val dataLake = readDataFromConsoleAndAddToDataLake()
    println("Data before process: $dataLake")
    println()
    println("Data after sorting: ${sortingDataAccordingtoFlags(dataLake)}")
}

fun sortingDataAccordingtoFlags(datalake: DataFromString): DataFromString {
    return if (datalake.ascendingOrderFlag && !datalake.absoluteValueOrderFlag) {
        println(
            "ascendingOrderFlag = ${datalake.ascendingOrderFlag}; absoluteValueOrderFlag = " +
                    "${datalake.absoluteValueOrderFlag} -> case when sorting go by ascending"
        )
        sortingByAscendingOrder(datalake)
    } else if ((datalake.ascendingOrderFlag && datalake.absoluteValueOrderFlag)) {
        println(
            "ascendingOrderFlag = ${datalake.ascendingOrderFlag}; absoluteValueOrderFlag = " +
                    "${datalake.absoluteValueOrderFlag} -> case when sorting go by ascending then by absoluteValue"
        )
        sortingByAbsoluteValue(sortingByAscendingOrder(datalake))
    } else if (!datalake.ascendingOrderFlag && datalake.absoluteValueOrderFlag) {
        println(
            "ascendingOrderFlag = ${datalake.ascendingOrderFlag}; absoluteValueOrderFlag = " +
                    "${datalake.absoluteValueOrderFlag} -> case when sorting go by absoluteValue"
        )
        sortingByAbsoluteValue(datalake)
    } else { //false false
        println(
            "ascendingOrderFlag = ${datalake.ascendingOrderFlag}; absoluteValueOrderFlag = " +
                    "${datalake.absoluteValueOrderFlag} -> case when no sorting go"
        )
        datalake
    }
    return datalake
}

fun sortingByAscendingOrder(dataLake: DataFromString): DataFromString {
    val intArrayOfNumbers = intArrayOf(dataLake.aNumber, dataLake.bNumber, dataLake.cNumber)
    Arrays.sort(intArrayOfNumbers)
    dataLake.aNumber = intArrayOfNumbers[0]
    dataLake.bNumber = intArrayOfNumbers[1]
    dataLake.cNumber = intArrayOfNumbers[2]
    return dataLake
}

fun sortingByAbsoluteValue(dataLake: DataFromString): DataFromString {
    val intArrayOfNumbers = intArrayOf(abs(dataLake.aNumber), abs(dataLake.bNumber), abs(dataLake.cNumber))
    Arrays.sort(intArrayOfNumbers)
    dataLake.aNumber = intArrayOfNumbers[0]
    dataLake.bNumber = intArrayOfNumbers[1]
    dataLake.cNumber = intArrayOfNumbers[2]
    return dataLake
}

fun readDataFromConsoleAndAddToDataLake(): DataFromString {
    val stringLineScanner = Scanner(System.`in`)
    val stringLineFromConsole = stringLineScanner.nextLine()
    println("Line to process: $stringLineFromConsole")
    stringLineScanner.close()
    val scanner = Scanner(stringLineFromConsole).useDelimiter(", ")
    val dataLake = DataFromString()
    dataLake.aNumber = scanner.next().toInt()
    dataLake.bNumber = scanner.next().toInt()
    dataLake.cNumber = scanner.next().toInt()
    dataLake.ascendingOrderFlag =
        if (scanner.hasNextBoolean()) scanner.next().toBoolean() else true
    dataLake.absoluteValueOrderFlag =
        if (scanner.hasNextBoolean()) scanner.next().toBoolean() else false
    scanner.close()
    return dataLake
}

class DataFromString {
    var aNumber: Int = INIT_VALUE_ZERO
    var bNumber: Int = INIT_VALUE_ZERO
    var cNumber: Int = INIT_VALUE_ZERO
    var ascendingOrderFlag: Boolean = false
    var absoluteValueOrderFlag: Boolean = false
    override fun toString(): String {
        return "DataFromString(aNumber=$aNumber, bNumber=$bNumber, cNumber=$cNumber, " +
                "ascendingOrderFlag=$ascendingOrderFlag, absoluteValueOrderFlag=$absoluteValueOrderFlag)"
    }
}

