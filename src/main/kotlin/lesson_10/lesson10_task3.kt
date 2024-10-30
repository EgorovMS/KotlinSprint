package org.example.lesson_10

fun main() {
    println("Введите длинну пароля: ")
    val length = readln().toInt()
    val password = generationPassword(length)
    println("Ваш пароль: $password")
}

fun generationPassword(length: Int): String {
    val number = ('0'..'9').toList()
    val characters = listOf('!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.append(number.random())
        } else {
            password.append(characters.random())
        }
    }
    return password.toString()
}