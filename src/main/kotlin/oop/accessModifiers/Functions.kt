package oop.accessModifiers

fun main() {

    var car1 = Car(color = "Blue", name = "Toyoto", year = 2010)
    var car2 = Car(name = "Ford", color = "Red",  year = 2016)
    var car3 = Car(year = 2010, color = "Yellow", name = "Ferrari")

    printCars(car1, car2, car3)
}

fun printCars(vararg cars: Car) {
    for (car in cars) {
        println(car)
    }
}
data class Car(var name: String, var color: String, var year: Int) {

}