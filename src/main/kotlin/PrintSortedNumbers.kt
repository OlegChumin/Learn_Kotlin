import java.util.*
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
    printDataFromDataLake(readDataFromConsoleAndAddToDataLake())
}

fun sortingDataAccordingtoFlags(datalake: DataFromString): DataFromString {
    if (datalake.ascendingOrderFlag && !datalake.absoluteValueOrderFlag) {

    } else if ((datalake.ascendingOrderFlag && datalake.absoluteValueOrderFlag)) {

    } else if (!datalake.ascendingOrderFlag && datalake.absoluteValueOrderFlag) {

    } else { //false false

    }
    return datalake
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
    dataLake.ascendingOrderFlag = scanner.next().toBoolean()
    dataLake.absoluteValueOrderFlag = scanner.next().toBoolean()
    scanner.close()
    return dataLake
}

fun printDataFromDataLake(dataLake: DataFromString) {
    println("Source data to process: $dataLake")
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

