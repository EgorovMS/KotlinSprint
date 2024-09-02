package org.example.lesson_5

fun main() {

    val userYear = readLine()!!.toInt()

    if(userYear <= YEAR_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (userYear > YEAR_OF_MAJORITY) {
        println("Вернуть на главный экран")
    }
}

const val YEAR_OF_MAJORITY = 2006