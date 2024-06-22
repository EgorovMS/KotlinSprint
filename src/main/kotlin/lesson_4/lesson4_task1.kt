package org.example.lesson_4

fun main() {

    val reservationForToday: Int = 13
    val reservationForTomorrow: Int = 4

    val tableAvailabilityToday = reservationForToday < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня: $tableAvailabilityToday")

    val tableAvailabilityForTomorrow = reservationForTomorrow < NUMBER_OF_TABLES
    println("Доступность столиков на завтра: $tableAvailabilityForTomorrow")
}

const val NUMBER_OF_TABLES = 13