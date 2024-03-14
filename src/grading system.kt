fun main() {
    println("Enter the student's score (out of 100): ")
    val score = readLine()?.toIntOrNull()

    if (score != null) {
        val grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "E"
        }
        println("The corresponding grade is: $grade")
    }
}