package loops

fun main() {

    val intRange = 1..5
    val strRange = "AAA".."ZZZ"
    val charRange = 'a'..'z'

    println(10 in intRange)
    println("CCCC" in strRange)
    println('c' in charRange)
    println("ZZZ" in strRange)

    //Backward Range
    val backwardRange = 5.downTo(-5)
    backwardRange.forEach { println(it) }

    // Step Range
    val stepRange = 3..16
    val stepThree = stepRange.step(3)

    for (i in stepThree) {
        println(i)
    }


    // For excluding end limit

    for (i in 1 until 10) { // skips 10
        println(i)
    }

}