package oop.interfaces

interface MyInterface {
    fun myFunction(): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(): String
}

class InterfaceImpl: MySubInterface {
    override fun myFunction(): String = "I am My Function"

    override fun mySubFunction(): String = "I am My Sub Function"
}

fun main() {
    val interfaceImpl = InterfaceImpl()

    println(" My Function:  ${interfaceImpl.myFunction()}, My Sub Function: ${interfaceImpl.mySubFunction()}")
}