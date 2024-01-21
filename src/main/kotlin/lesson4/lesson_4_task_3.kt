package lesson4

const val SUNNY_WEATHER = true
const val OPEN_AWING = true
const val AIR_HUMIDITY = 20
const val SEASON = "не зима"

fun main() {
    val weatherToday = true
    val openAwingToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?: "  +
                "${
                    (weatherToday == SUNNY_WEATHER) and
                            (openAwingToday == OPEN_AWING) and
                            (airHumidityToday == AIR_HUMIDITY) and
                            (seasonToday == SEASON)
                }"
    )
}