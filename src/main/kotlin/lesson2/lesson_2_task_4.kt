package lesson2

fun main() {
    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val buffCrystalOre = (crystalOre * buff).toInt()
    val buffIronOre = (ironOre * buff).toInt()

    println(buffCrystalOre)
    println(buffIronOre)
}