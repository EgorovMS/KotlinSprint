package org.example.lesson_5

fun main() {

    val a = (1..100).random()
    val b = (1..100).random()
    println("Для входа решите пример $a +  $b = ?")

    val mathExample = readLine()?.toIntOrNull()
    val consolNumber = when(mathExample) {
        a + b -> "Добро пожаловать!"
        else -> "Доступ запрещен"
    }

    println(consolNumber)
}