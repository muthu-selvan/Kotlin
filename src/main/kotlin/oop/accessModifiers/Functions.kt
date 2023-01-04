package oop.accessModifiers

fun main() {

    var car1 = Car(color = "Blue", name = "Toyoto", year = 2010)
    var car2 = Car(name = "Ford", color = "Red",  year = 2016)
    var car3 = Car(year = 2010, color = "Yellow", name = "Ferrari")
    var car4 = car3.copy()

    printCars(car1, car2, car3)

    // Spread operator Exaomple : Unpack array into list of elements
    var moreCarsInArray = arrayOf(car1, car2)
    printCars(cars = *moreCarsInArray)

    // Extension Function example
    println("this is lowercase".upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0,1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length-1)+upperFirst.substring(upperFirst.length-1, upperFirst.length).uppercase()
}

fun printCars(vararg cars: Car) {
    for (car in cars) {
        println(car)
    }
}
data class Car(var name: String, var color: String, var year: Int) {

}