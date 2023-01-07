package oop.challenge1.kotlincode

open class Bicycle(private var cadence: Int, private var speed: Int, private var gear: Int) {
    fun getCandence() = cadence
    fun setCandence(cadence: Int) {
        this.cadence = cadence
    }

    fun getSpeed() = speed

    fun setSpeed(speed: Int) {
        this.speed = speed
    }

    fun getGear() = gear

    fun setGear(gear: Int) {
        this.gear = gear
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear " + gear +
                    " with a cadence of " + cadence +
                    " travelling at a speed of " + speed + "."
        )
    }
}