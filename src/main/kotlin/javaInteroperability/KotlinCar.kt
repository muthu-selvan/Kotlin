@file:JvmName("StaticCar") // If u don't want to use KotlinCar name to create Object or refer in Java file.
package javaInteroperability

import oop.singleton.topLevelFunction

fun main() {
    val car1 = Car("Toyota","Blue", 2016)
    car1.color = null
    println(car1)
    println("Java Class: ${car1.javaClass}")

    val values = arrayOf("red","green","blue")
    // Using spread operator
    car1.acceptAndPrintVarargs(5, *values)

    val intArrayValue = intArrayOf(1,3,4,5,6,7,8)
    car1.acceptsAndPrintIntArray(intArrayValue)

    val list = listOf<String>("red","green","blue")
    car1.acceptsAndPrintList(list)

    println("Printing static value and method")
    println(Car.X)
    Car.printStaticMethod()

    // Call this method from java
    fun topLevelFunction() = "Called from Java"

}

// Call this method from java
fun topLevelFunction() = "Called from Java"

data class Student(val firstName: String, val lastName: String, val isAllPass: Boolean)
