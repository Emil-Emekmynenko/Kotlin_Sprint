package lesson3

fun main() {
    val dataMove = "D2-D4;0"

    val placeOfFigure = dataMove[0] + dataMove[1].toString()
    val transitionFigure = dataMove[3] + dataMove[4].toString()
    val numberMove = dataMove.substringAfter(';')

    println("""
        Место фигуры: $placeOfFigure
        Выполненный ход: $transitionFigure
        Номер хода : $numberMove
    """.trimIndent())
}