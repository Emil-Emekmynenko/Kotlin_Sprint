package lesson2

fun main() {
    var buffInPercentage = 20.0
    val crystalOre = 7
    val ironOre = 11

    buffInPercentage /= 100 //преобразование процентного значения в числовое
    val buffCrystalOre = (crystalOre * buffInPercentage).toInt()
    val buffIronOre = (ironOre * buffInPercentage).toInt()

    println(buffCrystalOre)
    println(buffIronOre)
}