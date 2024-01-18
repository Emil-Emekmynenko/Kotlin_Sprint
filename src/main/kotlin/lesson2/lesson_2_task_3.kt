package lesson2

fun main(){
    val hourDeparture = 9
    val minuteDeparture = 39
    val minuteOnWay = 457

    val constTime = 60

    var hourArrival = minuteOnWay / constTime + hourDeparture
    var minuteArrival = (minuteOnWay % constTime) + minuteDeparture

    if (minuteArrival >= 60) {
        hourArrival += (minuteArrival / constTime)
        minuteArrival %= constTime
    }

    println("Время прибытия поезда $hourArrival:$minuteArrival")
}