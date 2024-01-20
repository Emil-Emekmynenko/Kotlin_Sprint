package lesson1

const val constTime = 60

fun main() {
    val seconds: Short = 6480

    val minutesOfSpace = seconds / constTime
    val hoursOfSpace = String.format("%02d", minutesOfSpace / constTime)

    val remainMinutesOfHours = String.format("%02d", minutesOfSpace % constTime)
    val remainSecondsOfMinutes = String.format("%02d", seconds % minutesOfSpace)

    println("Гагарин провёл в космосе:")
    println("Целых минут - $minutesOfSpace")
    println("Целых часов - $hoursOfSpace")

    println("Остаток секунд от целых минут - $remainSecondsOfMinutes")
    println("Остаток минут от целых часов - $remainMinutesOfHours")

    println("Общее время проведённое в космосе Гагариным:")
    println("$hoursOfSpace:$remainMinutesOfHours:$remainSecondsOfMinutes")
}