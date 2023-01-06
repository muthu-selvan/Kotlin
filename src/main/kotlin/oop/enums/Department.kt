package oop.enums

enum class Department(val fullName: String, val numOfEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information technologies", 10),
    ACCOUNTS("Accounts", 5);

    fun getInfo() = "This $fullName Department has $numOfEmployees Employees"
}

fun main() {
    println(Department.IT.getInfo())
}