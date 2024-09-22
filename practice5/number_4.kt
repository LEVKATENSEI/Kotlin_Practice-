//Факториал числа: Напишите программу, которая вычисляет факториал
//введенного пользователем числа.
fun main() {
    val n = readln().toInt(); var sum = 1
    for (i in 1..n) sum *= i
    println(sum)
}