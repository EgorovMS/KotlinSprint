package org.example.lesson_2

fun main() {

    val crystalOre: Float = 7f
    val onePercentCrystalOre = crystalOre / PERCENTAGE
    val twentyPercentCrystalOre = onePercentCrystalOre * TWENTY_PERCENTAGE

    val ironOre: Float = 11f
    val onePercentIronOre = ironOre / PERCENTAGE
    val twentyPercentIronOre = onePercentIronOre * TWENTY_PERCENTAGE

    println(String.format("Бонусная кристалическая руда " + "%.0f", twentyPercentCrystalOre))
    println(String.format("Бонусная железная руда " + "%.0f", twentyPercentIronOre))

}

const val PERCENTAGE = 100
const val TWENTY_PERCENTAGE = 20