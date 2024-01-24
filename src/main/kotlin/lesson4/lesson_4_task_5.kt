package lesson4

fun main() {
    val isNotDamage = true
    val numberOfCrew = 55..70
    val recommendedNumberOfCrew = 70
    val boxOfProvisions = 50
    val isFavorableWeather = true

    println("Введите, наличие повреждений корпуса коробля: true/false")
    val damage = readln().toBoolean()
    println("Введите, количество текущего состава: (число)")
    val currentCrewComposition = readln().toInt()
    println("Введите, количество ящиков с провизией на борту: (число)")
    val numberOfBoxesOnBoard = readln().toInt()
    println("Введите, блогоприятные сегодня условия?: true/false")
    val favorableWeatherToday = readln().toBoolean()

    val shipReadiness: Boolean = (((damage == isNotDamage) || (damage != isNotDamage)) and (currentCrewComposition in numberOfCrew) and (numberOfBoxesOnBoard > boxOfProvisions) and (favorableWeatherToday == isFavorableWeather)) || ((currentCrewComposition == recommendedNumberOfCrew) and (favorableWeatherToday == isFavorableWeather) and (numberOfBoxesOnBoard > boxOfProvisions))
    // условие (damage == isNotDamage) || (damage != isNotDamage) вообще можно убрать
    println("Может корабль отправляться в плаванье?: $shipReadiness")
}