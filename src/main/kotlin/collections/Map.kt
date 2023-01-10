package collections

data class Car(val name: String, val color: String, val releasedYear: Int)
fun main() {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("Toyoto", "Green", 2022),
        2 to Car("XYZ", "Blue", 2024),
        3 to Car("ABC", "Yellow", 2023)
    )

    println(immutableMap)

    // Destructuring declaration
    val pair = Pair("Muthu", "Selvan")
    val (firstName, secondName) = pair

    println("FirstName: $firstName , SecondName $secondName")

    var car1 = Car("Toyoto", "Green", 2022)
    val (name, color, year) = car1
    println("Destructuring declaration : $name <> $color <> $year")
}