package lesson3

fun main() {
    val dataMove = "D2-D4;0"
    //преобразование строки в список
    val listDateMove = dataMove.split('-',';')

    val placeOfFigure = listDateMove[0]
    val transitionFigure = listDateMove[1]
    val numberMove = listDateMove[2]

    println("""
        Место фигуры: $placeOfFigure
        Выполненный ход: $transitionFigure
        Номер хода : $numberMove
    """.trimIndent())
}