package generics

import java.math.BigDecimal

fun main() {

    val stringList = listOf("one","two","three")
    val intList = listOf(1,3,5,6,6)
    val bigDecimalList = listOf(BigDecimal(1.05), BigDecimal(3.33), BigDecimal(908.87))

    printCollection(stringList)
    printCollection(intList)
    printCollection(bigDecimalList)

    append(StringBuilder("a"),StringBuilder("b"))

    //star projection
    val list: List<Any> = listOf("xxx","yyy","zzz")
    println(list is List<*>)

    // reified example
    val anyTypes: List<Any> = listOf(1, 10.0f, BigDecimal(10.00),"Hello World!")
    val result = getElementByType<Float>(anyTypes)

    println(result)
}


fun <T> append(item1: T,item2: T) where T: CharSequence, T:Appendable = println(item1.append(item2))

fun <T> printCollection(collection: List<T>) {
    for (i in collection) {
        println(i)
    }
}

inline fun <reified T> getElementByType(anyTypes: List<Any>) : List<T> {
    val result: MutableList<T> = mutableListOf()

    for (i in anyTypes) {
        if (i is T) {
            result.add(i)
        }
    }

    return result
}