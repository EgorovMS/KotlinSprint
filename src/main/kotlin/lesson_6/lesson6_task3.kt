package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val numberOfSeconds = readln().toInt()

    var counter = numberOfSeconds

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
        if (counter == 0)
            println("Время вышло")
    }
}