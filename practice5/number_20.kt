//Простые числа в диапазоне: Выведите все простые числа в заданном
//пользователем диапазоне
import kotlin.math.sqrt
fun main() {
    println("нижняя граница диапазона:")
    val lower = readLine()!!.toInt()
    println("верхняя граница диапазона:")
    val upper = readLine()!!.toInt()
    println("простые числа в диапазоне от $lower до $upper:")
    for (number in lower..upper) {
        if (isPrime(number)) {
            println(number)
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}