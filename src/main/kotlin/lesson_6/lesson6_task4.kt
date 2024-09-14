package org.example.lesson_6

fun main() {

    val number = (1..9).random()
    var numberOfAttempts = 5
    var userNumber: Int
    println("Угадайте число от 1 до 9. У вас есть ${numberOfAttempts--} попыток")

    do {
        userNumber = readln().toInt()
        if (number != userNumber) println("Осталось ${numberOfAttempts--} попытки")
    } while (number != userNumber)
    println("Это была великолепная игра!")
    println("Было загадано число $number")
}

//(number == userNumber)
//(number != userNumber)
//println("Вы не угадали. Осталось ${numberOfAttempts-1} попытки")
//println("Это была великолепная игра!")
//(println("Было загадано число $number")