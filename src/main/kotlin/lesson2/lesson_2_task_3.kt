package lesson2

const val constTime = 60

fun main(){
    val hourDeparture = 9
    val minuteDeparture = 39
    val minuteOnWay = 457

    var hourArrival = minuteOnWay / constTime + hourDeparture
    var minuteArrival = (minuteOnWay % constTime) + minuteDeparture

    if (minuteArrival >= constTime) {
        hourArrival += (minuteArrival / constTime)
        minuteArrival %= constTime
    }

    println("Время прибытия поезда $hourArrival:$minuteArrival")
}