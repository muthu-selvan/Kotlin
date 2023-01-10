package challenge4

fun main() {

//    for (i in 5..5000 step 5) {
//        println(i)
//    }

    // Fibonnaci Series

    var num1 = 0
    var num2 = 1
    var num3 = 0
    print("$num1 $num2 ")
    for(i in 3..15) {
        num3 = num1 + num2
        print("$num3 ")
        num1 = num2
        num2 = num3
    }
}