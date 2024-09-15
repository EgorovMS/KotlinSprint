package org.example.lesson_7

fun main() {

    val number1 = (1..9).random()
    val number2 = (1..9).random()
    val number3 = (1..9).random()
    val letter1 = ('a'..'z').random()
    val letter2 = ('a'..'z').random()
    val letter3 = ('a'..'z').random()

    println("Ваш пароль: $number1$letter1$number2$letter2$number3$letter3")
}