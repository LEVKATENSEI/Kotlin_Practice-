//Определение порядка: Программа принимает N чисел и выводит их в
//порядке возрастания.
fun main() {
    println("количество чисел (N):")
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    println("введите $n чисел, разделяя их пробелами:")
    val input = readLine()!!
    numbers.addAll(input.split(" ").map { it.toInt() })
    numbers.sort()

    // Выводим отсортированные числа
    println("числа в порядке возрастания:")
    println(numbers.joinToString(", "))
}