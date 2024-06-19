package org.example.lesson_2

fun main () {

    val departureHours: Int = 9
    val departureMinutes: Int = 39

    val numberOfMinutesInHour: Int = 60

    val travelTimeInMinutes: Int = 457

    val arrivalInMinutes = departureHours * numberOfMinutesInHour + departureMinutes + travelTimeInMinutes

    val arrivalHours = arrivalInMinutes / numberOfMinutesInHour
    val arrivalMinutes = arrivalInMinutes % numberOfMinutesInHour

    println(arrivalHours)
    println(arrivalMinutes)

    println(String. format ("%d:%d", 17, 16))
}
