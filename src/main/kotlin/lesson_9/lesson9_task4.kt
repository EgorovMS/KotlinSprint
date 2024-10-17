package org.example.lesson_9

fun main() {

    println("Введите пять ингредиентов, перечисленных через запятую с пробелом: ")
    val ingredients = readln().split(", ").sorted()
        println("$ingredients")
}