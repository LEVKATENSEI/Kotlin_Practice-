//Сумма чисел от 1 до N: Пользователь вводит число N, программа
//суммирует все числа от 1 до N и выводит результат.
fun main() {
    val n = readln().toInt(); var sum = 0
    for (i in 1..n) sum += i
    println(sum)
}