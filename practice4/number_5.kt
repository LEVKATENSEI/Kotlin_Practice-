//Определить знак числа
fun chislo(num: Int): String {
    return when {
        num > 0 -> "положительное"
        num < 0 -> "отрицательное"
        else -> "ноль"
    }
}

fun main() {
    val number = readln().toInt()
    println("число $number является: ${chislo(number)}")
}
