package lesson5

const val FIRST_WINNING_NUMBER = 22
const val SECOND_WINNING_NUMBER = 33

fun main() {
    println("Угадай два числа от 0 до 42 и попади на фабрику Вилли Вонки")
    println("Введи своё первое число:")
    val firstNumberUser = readln().toInt()

    println("Введи своё второе число:")
    val secondNumberUser = readln().toInt()

    val result = if ((firstNumberUser == FIRST_WINNING_NUMBER || firstNumberUser == SECOND_WINNING_NUMBER) &&
        (secondNumberUser == FIRST_WINNING_NUMBER || secondNumberUser == SECOND_WINNING_NUMBER)
    )
        "Поздравляем! Вы выиграли главный приз!"
    else if ((firstNumberUser == FIRST_WINNING_NUMBER || firstNumberUser == SECOND_WINNING_NUMBER) ||
        (secondNumberUser == FIRST_WINNING_NUMBER || secondNumberUser == SECOND_WINNING_NUMBER)
    )
        "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(result)
}