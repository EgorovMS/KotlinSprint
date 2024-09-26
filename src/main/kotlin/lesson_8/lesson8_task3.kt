package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("паста", "желток", "сыр", "бекон", "соль", "перец")
    println("Какой ингредиент вы хотите найти?")
    var userInput = readln()
        if (userInput in arrayOfIngredients) {
            println("Ингредиент $userInput в рецепте есть")
        }
        if (userInput !in arrayOfIngredients) {
            println("Такого ингредиента в рецепте нет")
        }
    }