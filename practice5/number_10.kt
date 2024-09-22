//Сумма цифр числа: Напишите программу, которая находит сумму цифр
//введенного числа.
fun main() {
    println("число:")
    val input = readLine()

    if (input != null && input.all {it.isDigit()}) {
        val sum = input.map {it.toString().toInt()}.sum()
        println("Сумма цифр числа: $sum")
    } else {
        println("корректное целое число.")
    }
}