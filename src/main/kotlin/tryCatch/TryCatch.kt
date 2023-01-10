package tryCatch

fun main() {
    println(getNumber("s") ?: "Invalid input")
}
fun getNumber(str: String): Int? {
    return try {
        Integer.getInteger(str)
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    } catch (e: NullPointerException) {
        null
    }
}