package oop.accessModifiers

fun main() {

    var employee = Employee("Muthu Selvan")
    println(employee.firstName)

    var emp2 = Employee("Muthu", false)
    println(emp2)
}

class Employee(var firstName: String, var fullTime: Boolean = true) {

    override fun toString(): String {
        return "Employee [ First Name : ${firstName} FullTime ${fullTime} ]"
    }
}