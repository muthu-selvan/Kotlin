package loops

fun main() {

    val seasons = arrayOf("Winter", "Summer", "Spring", "Monsoon", "Fall")
    seasons.forEach { println(it) }

    val notSeason = "whatever" !in seasons
    println(notSeason)

    // forEach with lambda expression
    seasons.forEachIndexed { index, season -> println("$season is season in number $index") }
}