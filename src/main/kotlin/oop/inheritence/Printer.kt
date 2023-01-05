package oop.inheritence

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The Printer Model is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    override fun printModel() = println("The Laser Printer Model is $modelName")

    final override fun bestSellingPrice(): Double = 90.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName,ppm) {

}

fun main() {
    val laserPrinter = LaserPrinter("LASERRR", 15)
    println("Printer ${laserPrinter.printModel()} Best Selling Price ${laserPrinter.bestSellingPrice()}")
}