package org.example.lesson_4

fun main() {

    println("Корабль имеет повреждения?")
    val damage: Boolean = readlnOrNull().toBoolean()
    println("Какое число экипажа на борту?")
    val numberOfCrew: Int = readlnOrNull()?.toInt() ?: 0
    println("Какое количество ящиков провизии на борту?")
    val numberOfProvisions: Int = readlnOrNull()?.toInt() ?: 0
    println("Погода благоприятная?")
    val weather: Boolean = readlnOrNull().toBoolean()

    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию ${
        (damage && numberOfCrew in MIN_CREW..MAX_CREW && numberOfProvisions > MIN_PROVISIONS) || (
                numberOfCrew == RECOMMENDED_NUMBER_OF_CREW && weather && numberOfProvisions >= MIN_PROVISIONS)}"
    )
}

const val MIN_CREW: Int = 55
const val MAX_CREW: Int = 70
const val MIN_PROVISIONS: Int = 50
const val RECOMMENDED_NUMBER_OF_CREW: Int = 70