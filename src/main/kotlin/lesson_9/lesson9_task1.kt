package org.example.lesson_9

fun main() {

    val ingredients: List<String> = mutableListOf("паста", "желток", "сыр", "бекон", "соль", "перец")

    println("В рецепте есть следующие ингредиенты: ")

    for (ingredients in ingredients) {
        println(ingredients)
    }
}