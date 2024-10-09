package org.example.lesson_7

fun main() {

    val number = 1..9
    val letter = 'a'..'z'
    val passwordLenght = 6

    val password = StringBuilder()

    for (i in 0 until passwordLenght) {
        if (i % 2 == 0) {
            password.append(letter.random())
        } else {
            password.append(number.random())
        }
    }

    println("Ваш пароль: $password")
}