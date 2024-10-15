package org.example.lesson_9

fun main() {

    println("Введите пять ингредиентов, перечисленных через запятую с пробелом: ")

    val inputIngredients: String = readln()
    val ingredients = inputIngredients.split(", ")
    val ingredientsList = ingredients.sorted()
        println("$ingredientsList")
}
