package org.example.lesson_5

fun main() {

    val login = "Zaphod"
    val password ="PanGalactic"

    val greetings = """
        |Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
        |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        |Да, вперед, пожалуйста, вводите свои данные...""".trimMargin()
    println(greetings)

    val welcomeMessage = """
        |Ваши данные проверены, и о, чудо, они верны...
        |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold".
        |Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
        |Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimMargin()

    val consoleLogin = readLine()
    if (consoleLogin != login) {
        println("Доступ к управлению кораблем запрещен! Требуется регистрация.")
        return
    } else {
        println("Введите пароль")
    }
    val consolePassword = readln()
    if (consoleLogin == login && consolePassword == password) {
        println(welcomeMessage)
    } else if (consoleLogin == login && consolePassword != password) {
        println("Доступ к управлению кораблем запрещен! Неверный пароль.")
    }
}