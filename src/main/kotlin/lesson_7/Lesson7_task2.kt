package org.example.lesson_7

fun main() {
    var smsCode = (1000..9999).random()
    println("Ваш код авторизации: $smsCode")

    var enteringTheCode: Int

    for (i in 9999 downTo 1000) {
        println("Введите код авторизации")
        enteringTheCode = readln().toInt()
        if (enteringTheCode == smsCode) {
            println("Добро пожаловать!")
            break
        }
        if (enteringTheCode != smsCode) {
            println("Ваш код авторизации: $smsCode")
        }
    }
}