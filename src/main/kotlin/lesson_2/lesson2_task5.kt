package org.example.lesson_2
import kotlin.math.pow

fun main() {

    val deposit = 70000
    val interestRate = 16.7
    val depositTerm = 20

    val futureAmount = deposit * (1 + interestRate / 100).pow(depositTerm)

    println(String.format("%.3f", futureAmount))
}