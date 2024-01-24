package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введи свой год рождения:")
    val yearOfBirth = readln().toInt()

    val thisYear = 2024

    val result = if ((thisYear - yearOfBirth) >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом."
    else "Подрасти и приходи =)"

    println(result)
}