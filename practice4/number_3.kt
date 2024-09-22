//Вывод оценок по числовым значениям
fun grade(score: Int): String {
    return when {
        score < 2 || score > 5 -> "некорректное значение"
        score >= 5 -> "A"
        score >= 4 -> "B"
        score >= 3 -> "C"
        score >= 2 -> "D"
        else -> "F"
    }
}

fun main() {
    val score = readln().toInt()
    println("оценка для $score: ${grade(score)}")

}
