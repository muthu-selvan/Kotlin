package oop.singleton

import java.time.Year

/**
 * Singleton Example
 */
object CompanyCommunications {

    private val currentYear = Year.now().value

    fun getTagLine() = "Our Company Rocks!!!"
    fun getCopyRightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"
}

class SomeClass private constructor(val someString: String) {
    companion object {
        private const val privateVal = 6
        fun printPrivateVal() = "Printing privateVal $privateVal"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, isLower: Boolean): String {
            return if(isLower) str.lowercase() else str.uppercase()
        }
    }
}

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyRightLine())

    println(SomeClass.printPrivateVal())
    println(SomeClass.justAssign("test"))
    println(SomeClass.upperOrLowerCase("india", false))
}