package oop.challenge1.kotlincode

class RoadBike(private val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10): Bicycle(cadence, speed, gear) {

    // Secondary constructor to add additional attribute called color
    constructor(tireWidth: Int, cadence: Int, speed: Int, gear: Int, color: String):
            this(tireWidth, cadence, speed, gear) {
                println("The color is $color")
            }

    fun getTireWidth() = tireWidth

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }

    companion object {
        val availableColors: List<String> = arrayListOf("Red", "Green", "Blue")
    }
}