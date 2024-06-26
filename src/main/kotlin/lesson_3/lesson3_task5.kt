package org.example.lesson_3

fun main() {

    val playerMove: String = "D2-D4;0"

    val splittedPlayerMoveList = playerMove.split("-", ";")

    val startOfMove = splittedPlayerMoveList.get(0)
    println(startOfMove)

    val endOfMove = splittedPlayerMoveList.get(1)
    println(endOfMove)

    val moveNumber = splittedPlayerMoveList.get(2)
    println(moveNumber)
}