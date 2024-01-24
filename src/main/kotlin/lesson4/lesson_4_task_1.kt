package lesson4

const val ALL_TABLES_COUNT = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val freeTablesToday = ALL_TABLES_COUNT - reservedTablesToday
    val freeTablesTomorrow = ALL_TABLES_COUNT - reservedTablesTomorrow

    println("Доступность столиков на сегодня: ${freeTablesToday > 0},\n" +
            "Доступность столиков на завтра: ${freeTablesTomorrow > 0}.")
}