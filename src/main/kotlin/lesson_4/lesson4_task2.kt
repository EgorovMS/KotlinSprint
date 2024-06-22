package org.example.lesson_4

fun main() {

    var weight = 20
    var volume = 80

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': " +
            ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT) && (volume <= VOLUME)))

    weight = 50
    volume = 100

    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
            ((weight >= MIN_WEIGHT) && (weight <= MAX_WEIGHT) && (volume <= VOLUME)))

}

const val MIN_WEIGHT = 36
const val MAX_WEIGHT = 100
const val VOLUME = 99