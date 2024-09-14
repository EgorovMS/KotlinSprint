package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val numberOfSeconds = readln().toLong()
    Thread.sleep(numberOfSeconds * 1000)
    println("Прошло $numberOfSeconds секунд")
}