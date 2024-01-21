package lesson4

fun main() {
    val allTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val freeTablesToday = allTables - reservedTablesToday
    val freeTablesTomorrow = allTables - reservedTablesTomorrow

    println("Доступность столиков на сегодня: ${freeTablesToday > 0},\n" +
            "Доступность столиков на завтра: ${freeTablesTomorrow > 0}.")
}