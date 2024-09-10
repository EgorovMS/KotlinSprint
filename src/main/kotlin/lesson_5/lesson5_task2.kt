package org.example.lesson_5

fun main() {

    println("Введите ваш год рождения")

    val consoleYear = readln().toInt()

    val currentYear = 2024
    val userAge: Int = (currentYear - consoleYear)

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
            println("Вернуть на главный экран")
        }
}

const val AGE_OF_MAJORITY = 18