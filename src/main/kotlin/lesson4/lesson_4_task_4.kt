package lesson4

const val IS_GROUP_FOR_ARM_AND_ABDOMINAL = true
const val IS_GROUP_FOR_LEGS_AND_BACK = true

fun main() {

    val dayOfTraining = 5

    if(dayOfTraining % 2 != 0) {
        println("""
        Упражнения для рук: $IS_GROUP_FOR_ARM_AND_ABDOMINAL
        Упражнения для ног: ${!IS_GROUP_FOR_LEGS_AND_BACK}
        Упражнения для спины: ${!IS_GROUP_FOR_LEGS_AND_BACK}
        Упражнения для пресса: $IS_GROUP_FOR_ARM_AND_ABDOMINAL""".trimIndent()
        )
    } else {
        println("""
        Упражнения для рук: ${!IS_GROUP_FOR_ARM_AND_ABDOMINAL}
        Упражнения для ног: $IS_GROUP_FOR_LEGS_AND_BACK
        Упражнения для спины: $IS_GROUP_FOR_LEGS_AND_BACK
        Упражнения для пресса: ${!IS_GROUP_FOR_ARM_AND_ABDOMINAL}""".trimIndent()
        )
    }
}