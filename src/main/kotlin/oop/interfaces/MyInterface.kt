package oop.interfaces

interface MyInterface {
    fun myFunction(): String
}

interface MySubInterface: MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100

    fun mySubFunction(): String
}

class InterfaceImpl: MySubInterface {
    override fun myFunction(): String = "I am My Function"
    override var number: Int = 90

    override fun mySubFunction(): String = "I am My Sub Function"
}

fun main() {
    val interfaceImpl = InterfaceImpl()

    println(" My Function:  ${interfaceImpl.myFunction()}, My Sub Function: ${interfaceImpl.mySubFunction()}")
}