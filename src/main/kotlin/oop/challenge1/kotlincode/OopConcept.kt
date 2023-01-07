package oop.challenge1.kotlincode


fun main() {
    val bicycle = Bicycle(10,10,10)
    bicycle.printDescription()

    val mountainBike = MountainBike(10, 10, 1,5)
    mountainBike.printDescription()

    val roadBike = RoadBike(10, 2, 4, 5 )
    println("Roadbike Object without default argument")
    roadBike.printDescription()

    val roadBike2 = RoadBike(10, 2, 4)
    println("Roadbike Object with default argument")
    roadBike2.printDescription()

    RoadBike.availableColors.forEach { println(it) }
}