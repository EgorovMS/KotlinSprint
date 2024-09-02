package org.example.lesson_5

fun main() {

    val numOne = 0
    val numTwo = 1

    println("Угадайте первое число")

    val userInputOne = readLine()?.toIntOrNull()

    println("Угадайте второе число")

    val userInputTwo = readLine()?.toIntOrNull()

    if (userInputOne == numTwo && userInputTwo == numOne) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userInputOne != numTwo && userInputTwo == numOne) {
        println("Вы выиграли утешительный приз!")
    } else if (userInputOne == numTwo && userInputTwo != numOne) {
        println("Вы выиграли утешительный приз!")
    } else if (userInputOne != numTwo && userInputTwo != numOne) {
        println("Неудача!")
    }

    println("Правильные числа $numOne и $numTwo")
}