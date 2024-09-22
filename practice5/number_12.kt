//Числовая последовательность: Пользователь вводит начальное число и
//шаг, программа генерирует числовую последовательность.
fun main() {
    // Запрашиваем у пользователя начальное число и шаг
    println("начальное число:")
    val start = readLine()?.toIntOrNull() ?: return println("некорректный ввод. Завершение программы.")

    println("шаг:")
    val step = readLine()?.toIntOrNull() ?: return println("некорректный ввод. Завершение программы.")

    for (a in start..start*10 step step) println(a)
}