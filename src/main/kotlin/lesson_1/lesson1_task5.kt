package org.example.lesson_1

fun main() {

    val timeInSpaceInSeconds: Int = 6480
    val numberOfSecondsInMinutes: Int = 60

    val secondsInSpace = timeInSpaceInSeconds % numberOfSecondsInMinutes
    val timeInSpaceInMinutes = timeInSpaceInSeconds / numberOfSecondsInMinutes

//    println(secondsInSpace)
//    println(timeInSpaceInMinutes)

    val numberOfMinutesInHours: Int = 60
    val minutesInSpace = timeInSpaceInMinutes % numberOfMinutesInHours
    val timeInSpaceInHours = timeInSpaceInMinutes / numberOfMinutesInHours

//    println(minutesInSpace)
//    println(timeInSpaceInHours)

    println(String. format("%02d:%d:%02d", 1, 48, 0))




//    secondsInSpace
    val minute: Float = 108f


//    println(flightTime)
}