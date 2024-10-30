package org.example.lesson_8

fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("паста", "желток", "сыр", "бекон", "соль", "перец")
    println("Список ингредиентов: ${arrayOfIngredients.contentToString()}")
    println("Какой ингредиент, вы хотите заменить?")

    val replacingAnIngredient: String = readln()

    val indexOfReplacingIngredient = arrayOfIngredients.indexOf(replacingAnIngredient)

    if (indexOfReplacingIngredient != -1) {
        println("Введите новый ингредиент")
        val newIngredient: String = readln()
        arrayOfIngredients[indexOfReplacingIngredient] = newIngredient
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
    } else  {
        println("Ингредиент не найден в списке.")
    }

}