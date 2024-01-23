package lesson4

fun main() {

    val minWeightAverage = 35
    val maxWeightAverage = 100
    val volumeInLitersAverage = 100

    val weightCargoFirst = 20
    val volumeInLitersCargoFirst = 80

    val weightCargoSecond = 50
    val volumeInLitersCargoSecond = 100

    println("Груз с весом $weightCargoFirst кг и объемом $volumeInLitersCargoFirst л соответствует категории 'Average': ${(weightCargoFirst >= minWeightAverage) and (weightCargoFirst <= maxWeightAverage) and (volumeInLitersCargoFirst < volumeInLitersAverage)}")
    println("Груз с весом $weightCargoSecond кг и объемом $volumeInLitersCargoSecond л соответствует категории 'Average': ${(weightCargoSecond >= minWeightAverage) and (weightCargoSecond <= maxWeightAverage) and (volumeInLitersCargoSecond < volumeInLitersAverage)}")


}