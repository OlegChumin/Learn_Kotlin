import java.util.Scanner

fun main() {
    var balance = readln().toInt()
    val input = Scanner(System.`in`)

    while (input.hasNextInt()) {
        val n = input.next().toInt()
        if (balance - n < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $n.")
        }
        balance -= n
    }
    if (balance >= 0) println("Thank you for choosing us to manage your account! Your balance is $balance.")
}