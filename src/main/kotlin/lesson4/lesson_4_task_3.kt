package lesson4

const val IS_SUNNY_WEATHER = true
const val IS_OPEN_AWING = true
const val AIR_HUMIDITY = 20
const val IS_SEASON = "зима"

fun main() {
    val isWeatherToday = true
    val isOpenAwingToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?: "  +
                "${
                    (isWeatherToday == IS_SUNNY_WEATHER) and
                            (isOpenAwingToday == IS_OPEN_AWING) and
                            (airHumidityToday == AIR_HUMIDITY) and
                            (seasonToday != IS_SEASON)
                }"
    )
}