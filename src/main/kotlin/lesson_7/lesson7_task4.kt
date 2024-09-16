package org.example.lesson_7

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val numberOfSeconds = readln().toInt()

    var counter = numberOfSeconds

    for (i in counter downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
        if (i == 1)
            println("Время вышло")
    }
}