package lesson1

fun main(){
    var numberOrder: Int = 0

    val strSuccess: String = "Благодарим за оформление $numberOrder заказа"

    println("Заказ № $numberOrder")
    println(strSuccess)

    var numberOfWorkers = 2000
//    println(numberOfWorkers)

    numberOfWorkers -= 1
    println(numberOfWorkers)
}