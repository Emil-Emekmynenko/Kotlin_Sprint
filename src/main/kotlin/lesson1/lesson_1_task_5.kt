package lesson1

fun main(){
    val seconds: Short = 6480

    val minutesOfSpace = seconds / 60
    val hoursOfSpace = minutesOfSpace / 60

    val remainMinutesOfHours = minutesOfSpace % 60
    val remainSecondsOfMinutes = seconds % minutesOfSpace

    println("Гагарин провёл в космосе:")
    println("Целых минут - $minutesOfSpace")
    println("Целых часов - $hoursOfSpace")

    println("Остаток секунд от целых минут - $remainSecondsOfMinutes")
    println("Остаток минут от целых часов - $remainMinutesOfHours")

    println("Общее время проведённое в космосе Гагариным:")
    println("0$hoursOfSpace:$remainMinutesOfHours:0$remainSecondsOfMinutes")
}