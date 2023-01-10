package collections

fun main() {

    val immutableMap = mapOf(
        1 to Car("Toyota", "Green", 2022),
        2 to Car("Ford", "Blue", 2024),
        3 to Car("ABC", "Yellow", 2023),
        4 to Car("Ford", "Yellow", 2023)
    )

    val sets = mutableSetOf(10,21,30,40,51)
    sets.add(300)
    println(sets)

    val odds = sets.filter { it%2 == 1 }
    println("Odds $odds")

    val filteredValue = immutableMap.filter { it.value.name == "Ford" }
        .map { it.value.color }
        .toList()
    println("Filtered Value $filteredValue")
}