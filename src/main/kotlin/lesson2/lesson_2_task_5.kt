package lesson2

import kotlin.math.pow

fun  main() {
    val deposit = 70_000
    var rate = 16.7
    val depositTerm = 20
    val period = 1

    // преобразование процентов в числовое значение
    rate /= 100

    // S = P*(1+ i)^n - Формула начисления сложных процентов
    val resultDeposit = deposit * (1 + rate).pow(depositTerm/period)

    println("%.3f".format(resultDeposit))
}