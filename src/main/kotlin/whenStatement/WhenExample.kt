package whenStatement

import whenStatement.Seasons.*
import java.math.BigDecimal

enum class Seasons(name: String) {
    WINTER("Winter"),
    SPRING("Spring"),
    MONSOON("Monsoon"),
    AUTUMN("Autumn");
}
fun main() {
    val num = 150
    val y = 100

    when (num) {
        y+50 -> println("Value is 200")
        in 100..600 -> println("Value is 100")
        300 -> println("Value is 300")
        else -> println("Didn't match to anyone")
    }

    val value1:Any = "This is string"
    val value2:Any = 'a'
    val value3:Any = BigDecimal(12)

    whileStatementExample(value3, AUTUMN)
}

fun whileStatementExample(value: Any, autumn: Seasons) {
   val x = when(value) {
        is String -> {
            println("This is String")
        }
        is Char -> {
            println("This is char")
        }
        is BigDecimal -> {
            println("This is Big Integer")
            BigDecimal(100.12)
        }
        else -> {
            println("Not matched")
        }
    }
    println(x)

    val seasonString: String = when(autumn) {
        AUTUMN -> "The season is Autumn"
        MONSOON -> "The season is Monsoon"
        SPRING -> "The season is Spring"
        else -> "Unknown Season"
    }

    println("Season String: $seasonString")


}