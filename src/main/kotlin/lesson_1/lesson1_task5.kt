package org.example.lesson_1

fun main() {

    val timeInSpaceInSeconds: Int = 6480

    val secondsInSpace = timeInSpaceInSeconds % TRANSLATE_OF_TIME
    val timeInSpaceInMinutes = timeInSpaceInSeconds / TRANSLATE_OF_TIME

    val minutesInSpace = timeInSpaceInMinutes % TRANSLATE_OF_TIME
    val timeInSpaceInHours = timeInSpaceInMinutes / TRANSLATE_OF_TIME

    println(String. format("%02d:%d:%02d", timeInSpaceInHours, minutesInSpace, secondsInSpace))

}

const val TRANSLATE_OF_TIME = 60