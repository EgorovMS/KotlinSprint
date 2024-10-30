package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("паста", "сыр", "бекон")

    println("В рецепте есть базовые ингредиенты: $ingredients ")

    println("Желаете добавить еще?")

    val questionToUser: String = readln()

    if (questionToUser.equals(YES, true )) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredients: String = readln()
        ingredients.add(newIngredients)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}

const val YES = "да"