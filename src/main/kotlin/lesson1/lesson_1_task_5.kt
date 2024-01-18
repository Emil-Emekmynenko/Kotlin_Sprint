package lesson1

fun main(){
    val constTime = 60
    val seconds: Short = 6480

    val minutesOfSpace = seconds / constTime
    val hoursOfSpace = minutesOfSpace / constTime

    val remainMinutesOfHours = minutesOfSpace % constTime
    val remainSecondsOfMinutes = seconds % minutesOfSpace

    println("Гагарин провёл в космосе:")
    println("Целых минут - $minutesOfSpace")
    println("Целых часов - $hoursOfSpace")

    println("Остаток секунд от целых минут - $remainSecondsOfMinutes")
    println("Остаток минут от целых часов - $remainMinutesOfHours")

    println("Общее время проведённое в космосе Гагариным:")
    println("0$hoursOfSpace:$remainMinutesOfHours:0$remainSecondsOfMinutes")
}