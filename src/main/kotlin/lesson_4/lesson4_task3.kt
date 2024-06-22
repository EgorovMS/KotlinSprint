package org.example.lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val favorableConditions = (sunnyWeather == SUNNY_WEATHER) && (openAwning == OPEN_AWNING) &&
            (airHumidity == AIR_HUMIDITY) && (season == SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val SUNNY_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "не зима"