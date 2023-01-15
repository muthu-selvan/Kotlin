package files

import java.io.File

fun main() {
    File(".").walkTopDown().forEach { println(it) }

    // Filtering FileName
    File(".").walkTopDown().asSequence().filter { it.name.endsWith("kt") }.forEach { println(it) }
}