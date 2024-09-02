package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val a = Random.nextInt(0, 100)
    val b = Random.nextInt(0, 100)
    println("Для входа решите пример $a +  $b = ?")

    val mathExample = readLine()?.toIntOrNull()
    val consolNumber = when(mathExample) {
        a + b -> "Добро пожаловать!"
        else -> "Доступ запрещен"
    }

    println(consolNumber)
}