package org.example.lesson_3

fun main() {

    var startOfMove: String = "E2"
    var endOfMove: String = "E4"
    var gameMoveNumber: Int = 1

    var whiteMove = "$startOfMove-$endOfMove;$gameMoveNumber"
    println(whiteMove)

    startOfMove = "D2"
    endOfMove = "D3"
    gameMoveNumber = 3

    whiteMove = "$startOfMove-$endOfMove;$gameMoveNumber"
    println(whiteMove)
}