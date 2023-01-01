fun main(args: Array<String>) {

    var float1 = 0.0001f
    var float2: Float? = 0.333f
    var float3 = 0.34343.toFloat()

    var shortArray = shortArrayOf(1,2,4,5,6)

    var shortArray1: Array<Short?> = arrayOf(1,2 ,34,55)

    var intArray = Array<Int?>(40) { i -> (i+1)*5}

    println("Printing Data")
    for (i in intArray) {
        println(i)
    }

}