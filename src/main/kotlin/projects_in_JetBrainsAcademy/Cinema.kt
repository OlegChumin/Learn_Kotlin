package projects_in_JetBrainsAcademy

fun main() {
    // write your code here
    var cinema = readCinemaData()
    while (true) {
        printMenu()
        val choise = readln().toInt()
        when (choise) {
            1 -> showTheSeats(cinema)
            2 -> {
                cinema = buyTicket(cinema)
            }

            0 -> return
        }
    }

}

data class Cinema(
    val rowsNumber: Int,
    val seatsNumber: Int,
    var bookedSeats: List<Pair<Int, Int>> = mutableListOf()
)

fun readCinemaData(): Cinema {
    println("Enter the number of rows:")
    val rowsNumber = readln().toInt()

    println("Enter the number of seats in each row:")
    val seatsNumber = readln().toInt()

    return Cinema(rowsNumber, seatsNumber)
}

fun printMenu() {
    println(
        "1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "0. Exit"
    )
}

fun showTheSeats(cinema: Cinema) {
    println()
    println("Total income:")
    println("\$${calculateProfit(cinema.rowsNumber, cinema.seatsNumber)}")
    printCinemaHall(cinema)
}

fun buyTicket(cinema: Cinema): Cinema {
    println("Enter a row number:")
    val row = readln().toInt()

    println("Enter a seat number in that row:")
    val seat = readln().toInt()

    val updatedCinema = bookSeatPosition(cinema, row, seat)

    println()
    println("Ticket price: \$${calculateTicketPrice(updatedCinema)}")

    // Создаем новый объект Cinema на основе старого и обновленного состояния
    val newCinema = Cinema(updatedCinema.rowsNumber, updatedCinema.seatsNumber, updatedCinema.bookedSeats)

    printCinemaHallWithBookedSeats(newCinema)

    return newCinema
}




fun printCinemaHall(cinema: Cinema) {
    println()
    println("Cinema:")

    // Print header with seats number in row
    print(" ")
    for (j in 1..cinema.seatsNumber) {
        print(" $j")
    }
    println()

    // Print hall with rows numbers
    for (i in 1..cinema.rowsNumber) {
        print(i)
        for (j in 1..cinema.seatsNumber) {
            print(" S")
        }
        println()
    }
    println()
}

fun calculateProfit(rowsNumber: Int, seatsNumber: Int): Int {
    return if (rowsNumber * seatsNumber <= 60) 10 * rowsNumber * seatsNumber
    else 10 * (rowsNumber / 2) * seatsNumber + 8 * (rowsNumber - rowsNumber / 2) * seatsNumber
}

fun printCinemaHallWithBookedSeats(cinema: Cinema) {
    println()
    println("Cinema:")

    // Вывод заголовка с номерами мест в ряду
    print(" ")
    for (j in 1..cinema.seatsNumber) {
        print(" $j")
    }
    println()

    // Вывод зала с меткой 'B' для забронированных мест
    for (i in 1..cinema.rowsNumber) {
        print(i)
        for (j in 1..cinema.seatsNumber) {
            val isBooked = cinema.bookedSeats.any { it.first == i && it.second == j }
            print(" ${if (isBooked) 'B' else 'S'}")
        }
        println()
    }
    println()
}

fun cinemaSize(cinema: Cinema) = cinema.rowsNumber * cinema.seatsNumber

fun bookSeatPosition(cinema: Cinema, row: Int, seat: Int): Cinema {
    // Проверяем, что выбранное место находится в пределах зала
    if (row !in 1..cinema.rowsNumber || seat !in 1..cinema.seatsNumber) {
        println("Invalid seat selection. Please choose a valid seat.")
        return cinema
    }

    // Проверяем, что выбранное место ещё не забронировано
    val isAlreadyBooked = cinema.bookedSeats.any { it.first == row && it.second == seat }
    if (!isAlreadyBooked) {
        val updatedBookedSeats = cinema.bookedSeats.toMutableList() + (row to seat)
        return cinema.copy(bookedSeats = updatedBookedSeats)
    } else {
        //println("This seat is already booked. Please choose another seat.")
        return cinema
    }
}




fun calculateTicketPrice(cinema: Cinema): Int {
    val bookedSeats = cinema.bookedSeats
    val totalSeats = cinema.rowsNumber * cinema.seatsNumber  // Используйте исходное количество мест

    return when {
        totalSeats <= 60 -> 10
        bookedSeats.size > totalSeats / 2 -> 8
        else -> 10
    }
}

