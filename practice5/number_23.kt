//Сложение и умножение: Напишите программу, которая запрашивает у
//пользователя две цифры и повторяет сложение или умножение, до тех
//пор, пока пользователь не введет "стоп".
fun main() {
    println("'стоп' для завершения программы.")
    Thread.sleep(1000)
    while (true) {
        println("первая цифра:")
        val firstNumberInput = readLine()
        if (firstNumberInput == "стоп") break
        println("вторая цифра:")
        val secondNumberInput = readLine()
        if (secondNumberInput == "стоп") break
        val firstNumber = firstNumberInput?.toDoubleOrNull()
        val secondNumber = secondNumberInput?.toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            val sum = firstNumber + secondNumber
            val product = firstNumber * secondNumber

            println("сумма: $sum")
            println("произведение: $product")
        } else {
            println("введите допустимые числа.")
        }
    }
    println("программа завершена.")
}