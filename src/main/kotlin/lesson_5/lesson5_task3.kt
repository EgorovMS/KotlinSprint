package org.example.lesson_5

fun main() {

    val numOne = 0
    val numTwo = 1

    println("Угадайте первое число")

    val userInputOne = readln()?.toIntOrNull()

    println("Угадайте второе число")

    val userInputTwo = readln()?.toIntOrNull()

    if ((userInputOne == numOne && userInputTwo == numTwo)
        || (userInputOne == numTwo && userInputTwo == numOne)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userInputOne == numOne || userInputTwo == numTwo)
        || (userInputOne == numTwo || userInputTwo == numOne)) {
        println("Вы выиграли утешительный приз!")
    } else  {
        println("Неудача!")
    }

    println("Правильные числа $numOne и $numTwo")
}