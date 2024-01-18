package lesson2

fun main() {
    val numberStudents = 4

    val gpaFirstStudent = 3
    val gpaSecondStudent = 4
    val gpaThirdStudent = 3
    val gpaFourStudent = 5

    val gpaResultStudents: Double = (gpaFirstStudent + gpaSecondStudent + gpaThirdStudent + gpaFourStudent).toDouble() / numberStudents
    println(gpaResultStudents)
}