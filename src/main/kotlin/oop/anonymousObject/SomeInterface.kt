package oop.anonymousObject

/**
 * This is Anon Object example
 */
interface SomeInterface {
    fun mustImplement(number: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println(si.mustImplement(22))
}

fun main() {

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(number: Int): String =
            "This is from mustImplement Implementation $number"
    })
}