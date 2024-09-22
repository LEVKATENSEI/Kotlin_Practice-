//Наибольший общий делитель (НОД): Напишите программу, которая
//находит НОД двух введенных чисел с использованием алгоритма
//Евклида.
fun algorithm(a: Int, b: Int): Int {
    var x = a ;var y = b
    while (y != 0) {val temp = y; y = x % y; x = temp}
    return x
}

fun main() {
    println("первое число:")
    val firstNum = readLine()?.toInt()
    println("второе число:")
    val secondNum = readLine()?.toInt()
    if (firstNum != null && secondNum != null) {
        val result = algorithm(firstNum, secondNum)
        println("наибольший общий делитель чисел $firstNum и $secondNum равен: $result")
    } else {
        println("введите корректные целые числа.")
    }
}