package org.example.lesson_6

fun main() {

    println("Придумайте логин")
    val consoleLogin = readln()

    println("Придумайте пароль")
    val consolePassword = readln()

    var userLogin: String
    var userPassword: String

    do {
        println("Введите логин")
        userLogin = readln()
        println("Введите пароль")
        userPassword = readln()
        if (consoleLogin == userLogin && consolePassword == userPassword) println("Авторизация прошла успешно")
    } while (consoleLogin != userLogin || consolePassword != userPassword)
}