//Конвертация в двоичную систему: Напишите программу, которая
//конвертирует целое число в двоичную систему.
fun main() {
    println("целое число:")
    val number = readLine()!!.toInt()
    val dv = Integer.toBinaryString(number)
    println("двоичное представление числа $number: $dv")
}