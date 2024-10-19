package org.example.lesson_10

import javax.security.auth.spi.LoginModule

fun main () {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (validationLogin(login) && validationPassword(password)) {
        println("Логин и пароль приняты!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validationLogin (login: String): Boolean {
    return login.length in 4..20

}

fun validationPassword (password: String): Boolean {
    return password.length in 4..20
}