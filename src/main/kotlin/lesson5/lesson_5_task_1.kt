package lesson5

fun main() {
    println("Напиши ответ простого математического примера 2 + 2 * 2 = :")
    val answerUser = readln().toInt()

    val answerToExample = 2 + 2 * 2

    val result = if (answerUser == answerToExample) "Добро пожаловать!"
    else "Доступ запрещен, учи математику."

    println(result)
}