package collections

fun main() {
    val seasons = listOf<String>("spring","summer","monsoon")
    println(seasons)

    val emptyList = emptyList<String>()
    println("emptyList Class ${emptyList.javaClass}")

    val nonEmptyList = listOfNotNull("Welcome",null,"GoodBye")
    println(nonEmptyList)
    emptyList.ifEmpty { println("List is empty") }

    var arrayList = arrayListOf<Int>(1,3,4,5)
    arrayList.remove(3)
    println(arrayList)

    val array = arrayOf(1,3,4,5,5)
    println("Print Array $array")
}