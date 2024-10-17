package org.example.lesson_9

fun main() {

    val oneServing: MutableList<Int> = mutableListOf(2, 50, 15)

    println("Введите количество порций: ")

    val numberOfServings = readln().toInt()
    val manyServing = oneServing.map { it * numberOfServings }

    println("На $numberOfServings порций вам понадобится: Яиц - ${manyServing[0]}, молока - ${manyServing[1]}, сливочного масла - ${manyServing[2]}")
}