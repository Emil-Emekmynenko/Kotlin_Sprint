package lesson2

fun main() {
    val numberOfWorkers = 50
    val salaryOneWorker = 30000
    val numberOfTrainee = 30
    val salaryOneTrainee = 20000

    val salaryOfWorkers = numberOfWorkers * salaryOneWorker

    val salaryOfAllEmployees = salaryOfWorkers + (numberOfTrainee * salaryOneTrainee)

    val averageSalaryEmployee = salaryOfAllEmployees / (numberOfWorkers + numberOfTrainee)

    println(salaryOfWorkers)
    println(salaryOfAllEmployees)
    println(averageSalaryEmployee)
}