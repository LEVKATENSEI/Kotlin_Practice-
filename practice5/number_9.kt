//Обратный порядок: Пользователь вводит строку, и программа выводит
//ее в обратном порядке.
fun main() {
    println("строку:")
    val inputString = readLine()

    if (inputString != null) {
        val reversedString = inputString.reversed()
        println("Строка в обратном порядке: $reversedString")
    } else {
        println("введите корректную строку.")
    }
}