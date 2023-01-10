package ifExpressions

fun main() {
    val condition = 80 < 90

    if (condition) println("Condition satisfied") else println("Condition is not satisfied")

    val value = if (condition) {
        println("Condition satisfied")
        80
    } else {
        println("Condition is not satisfied")
        90
    }

    println("Printed value $value")
}