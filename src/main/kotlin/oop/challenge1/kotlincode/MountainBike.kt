package oop.challenge1.kotlincode

class MountainBike(private var seatHeight: Int, cadence: Int, speed: Int, gear: Int): Bicycle(cadence, speed, gear) {

    fun getSeatHeight() = seatHeight

    fun setSeatHeight(seatHeight: Int) {
        this.seatHeight = seatHeight
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of  $seatHeight inches.")
    }
}