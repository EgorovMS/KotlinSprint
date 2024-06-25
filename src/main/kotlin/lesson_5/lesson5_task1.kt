package org.example.lesson_5

fun main() {

    println("Для входа решите пример 2 + 2 = ?")

    val mathExample = readLine()!!.toInt()

    val consolNumber = when(mathExample) {
        4 -> "Добро пожаловать!"
        else -> "Доступ запрещен"
    }

    println(consolNumber)
}