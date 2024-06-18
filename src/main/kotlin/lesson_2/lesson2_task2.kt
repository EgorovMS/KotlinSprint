package org.example.lesson_2

fun main() {

    val employees: Int = 50
    val trainees: Int = 30
    val numberOfEmployees = employees + trainees

    val employeesSalary: Int = 30000
    val traineesSalary: Int = 20000

    val paymentsToEmployees = employees * employeesSalary
    val paymentsToInterns = trainees * traineesSalary
    val generalExpenses = paymentsToEmployees + paymentsToInterns

    println(paymentsToEmployees)
    println(generalExpenses)
    println(generalExpenses / numberOfEmployees)
}