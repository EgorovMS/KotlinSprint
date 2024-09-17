package org.example.lesson_7

fun main() {

    var enteringTheCode: Int
    var smsCode: Int

    do {
        smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        println("Введите код авторизации")
        enteringTheCode = readln().toInt()
        if (enteringTheCode == smsCode) {
            println("Добро пожаловать!")
            break
        }
    } while (enteringTheCode != smsCode)
}