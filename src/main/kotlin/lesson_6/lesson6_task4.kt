package org.example.lesson_6

fun main() {

    val number = (1..9).random()
    var numberOfAttempts = 5
    var userNumber: Int

    println("Угадайте число от 1 до 9. У вас есть ${numberOfAttempts--} попыток")

    do {
        println("Введите число")
        userNumber = readln().toInt()
        if (number != userNumber) println("Вы не угадали. Осталось ${numberOfAttempts} попытки")
        if (number == userNumber) {
            println("Это была великолепная игра!")
            return
        }
    } while (numberOfAttempts-- > 0)
    println("Было загадано число $number")
}