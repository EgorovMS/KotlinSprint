package org.example.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("паста", "желток", "сыр", "бекон", "соль", "перец")
    println("Какой ингредиент вы хотите найти?")
    var userInput = readln()
    for (i in arrayOfIngredients) {
        if (i == userInput) {
            println("Ингредиент $userInput в рецепте есть")
            break
        }
        if (i != userInput) {
            println("Такого ингредиента в рецепте нет")
        }
    }
}