package org.example.lesson_5

fun main() {

    val login = "Zaphod"
    val password ="PanGalactic"

    println("Введите логин")

    val consoleLogin = readLine()

    if (consoleLogin != login) {
        println("Доступ к управлению кораблем запрещен! Требуется регистрация.")
        return
    } else {
        println("Введите пароль")
    }

    val consolePassword = readLine()

    if (consoleLogin == login && consolePassword == password) {
        println("Доступ к управлению кораблем разрешен.")
    } else if (consoleLogin == login && consolePassword != password) {
        println("Доступ к управлению кораблем запрещен! Неверный пароль.")
    }
}