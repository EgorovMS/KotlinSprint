package org.example.lesson_9

import kotlin.time.times

fun main() {

    val oneServing: MutableList<Int> = mutableListOf(2, 50, 15)

    println("Введите количество порций: ")

    val numberOfServings = readln().toInt()

    val eggs = oneServing[0] * numberOfServings
    val milk = oneServing[1] * numberOfServings
    val butter = oneServing[2] * numberOfServings

    println("На $numberOfServings порций вам понадобится: Яиц - $eggs, молока - $milk, сливочного масла - $butter")
}