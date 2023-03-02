package Scanner

import java.util.Scanner

//        debit = scanner.useDelimiter(System.getProperty("line.separator")).nextInt()

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextLine().toInt()
    var debit: Int
    var isPositiveBalance = false

    if (scanner.hasNextLine()) {
        val lineOfPurchasesSequence = scanner.nextLine()
        val lineScan = Scanner(lineOfPurchasesSequence)

        while (lineScan.hasNextInt()) {
            debit = lineScan.nextInt()
            if (debit > balance) {
                println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $debit.")
                isPositiveBalance = false
                lineScan.close()
                break
            }
            balance -= debit
            isPositiveBalance = true
        }
        lineScan.close()
    }
    if (isPositiveBalance) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}