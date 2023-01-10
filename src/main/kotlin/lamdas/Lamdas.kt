package lamdas

import java.util.StringJoiner

data class Employee(var firstName: String, var lastName: String, var startYear: Int)

fun main() {
    val employees = listOf(
        Employee("Muthu","Selvan", 2015),
        Employee("Muthu","Raj", 2021),
        Employee("Arul","Lingam", 2022),
        Employee("Muthu","Prabhu", 2028)
    )

   val employee = employees.maxBy (Employee::startYear)
    println("Employee with max start date $employee")

    printEmployeesFirstName(employees)

    println(countTo100With())

    upperCaseString("this is some string","this is another string")
}

fun printEmployeesFirstName(employees: List<Employee>) {
    employees.forEach { println(it.firstName) }
}

//fun countTo100(): String {
//    val stringJoiner = StringJoiner(",")
//
//    for (i in 1..100) {
//        stringJoiner.add(i.toString())
//    }
//    return stringJoiner.toString()
//}
//}


fun countTo100With() =
    with(StringJoiner(",")) {
        for (i in 1..100) {
            add(i.toString())
        }
        toString()
    }

fun countTo100Apply() =
    StringJoiner(",").apply {
        for (i in 1..100) {
            add(i.toString())
        }
    }.toString()

fun upperCaseString(str1: String, str2: String) {
    str1.apply str1@ {
        str2.apply {
            println(uppercase())
            println(this@str1.uppercase())
        }
    }
}