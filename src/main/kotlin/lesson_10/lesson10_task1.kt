package org.example.lesson_10

fun main() {
    val throwHuman = dice(player = "Человека")
    val throwMachine = dice(player = "Машины" )
    when {
        throwHuman > throwMachine -> println("Победило человечество")
        throwHuman < throwMachine -> println("Победила машина")
        else -> println("Ничья")
    }
}

fun dice(player: String): Int {

    val diceRoll= (1..6).random()
    println("Бросок $player $diceRoll")
    return diceRoll
}