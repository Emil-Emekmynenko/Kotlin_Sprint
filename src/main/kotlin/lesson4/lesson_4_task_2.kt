package lesson4

fun main() {
//    val weightAverage = 35..100 - первый вариант исполнения
//    val volumeInLitersAverage = 0..99 - первый вариант исполнения

    val minWeightAverage = 35
    val maxWeightAverage = 100
    val minVolumeInLitersAverage = 1 // возможно отсчёт имеет смысл сделать от 0
    val maxVolumeInLitersAverage = 99

    val weightCargoFirst = 20
    val volumeInLitersCargoFirst = 80

    val weightCargoSecond = 50
    val volumeInLitersCargoSecond = 100

//    println("Груз с весом $weightCargoFirst кг и объемом $volumeInLitersCargoFirst л соответствует категории 'Average': ${(weightCargoFirst in weightAverage) and (volumeInLitersCargoFirst in volumeInLitersAverage)}") - первый вариант исполнения
//    println("Груз с весом $weightCargoSecond кг и объемом $volumeInLitersCargoSecond л соответствует категории 'Average': ${(weightCargoSecond in weightAverage) and (volumeInLitersCargoSecond in volumeInLitersAverage)}") - первый вариант исполнения

    println("Груз с весом $weightCargoFirst кг и объемом $volumeInLitersCargoFirst л соответствует категории 'Average': ${(weightCargoFirst >= minWeightAverage) and (weightCargoFirst <= maxWeightAverage) and (volumeInLitersCargoFirst >= minVolumeInLitersAverage) and (volumeInLitersCargoFirst <= maxVolumeInLitersAverage)}")
    println("Груз с весом $weightCargoSecond кг и объемом $volumeInLitersCargoSecond л соответствует категории 'Average': ${(weightCargoSecond >= minWeightAverage) and (weightCargoSecond <= maxWeightAverage) and (volumeInLitersCargoSecond >= minVolumeInLitersAverage) and (volumeInLitersCargoSecond <= maxVolumeInLitersAverage)}")


}