fun main() {

    // Declare another variable while holds lowercase of string, if null then print 'I give up!'
    val x = "I AM UPPERCASE"
    val lowercase = x.lowercase() ?: "I give up!"
    println(lowercase)
    lowercase.let { println(it.replace("am", "am not")) }
}