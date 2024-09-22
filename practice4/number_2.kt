//Определить тип треугольника по длинам сторон
fun triangle(a: Double, b: Double, c: Double): String {
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
        return "не треугольник"
    }

    return when {
        a == b && b == c -> "равносторонний"
        a == b || b == c || a == c -> "равнобедренный"
        else -> "разносторонний"
    }
}

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    println(triangle(a, b, c))  // Вывод: Разносторонний
}