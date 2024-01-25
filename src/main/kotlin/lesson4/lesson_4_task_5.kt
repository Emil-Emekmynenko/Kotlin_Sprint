package lesson4

const val IS_NOT_DAMAGE = true
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val BOX_OF_PROVISIONS = 50
const val IS_FAVORABLE_WEATHER = true

fun main() {

    println("Введите, наличие повреждений корпуса коробля: true/false")
    val isDamage = readln().toBoolean()
    println("Введите, количество текущего состава: (число)")
    val currentCrewComposition = readln().toInt()
    println("Введите, количество ящиков с провизией на борту: (число)")
    val numberOfBoxesOnBoard = readln().toInt()
    println("Введите, блогоприятные сегодня условия?: true/false")
    val isFavorableWeatherToday = readln().toBoolean()

    val shipReadiness = if (isDamage == IS_NOT_DAMAGE &&
        currentCrewComposition >= MIN_NUMBER_OF_CREW &&
        currentCrewComposition <= MAX_NUMBER_OF_CREW &&
        numberOfBoxesOnBoard > BOX_OF_PROVISIONS
    )
        true
    else if (isDamage == !IS_NOT_DAMAGE &&
        currentCrewComposition == MAX_NUMBER_OF_CREW &&
        isFavorableWeatherToday == IS_FAVORABLE_WEATHER &&
        numberOfBoxesOnBoard > BOX_OF_PROVISIONS
    )
        true
    else false

    println("Может корабль отправляться в плаванье?: $shipReadiness")
}