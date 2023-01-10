package covariance

open class Flower {

}

class Rose : Flower() {

}

class Garden<out T: Flower> {

}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}
fun waterGarden(garden: Garden<Flower>) {

}
fun main() {

}

