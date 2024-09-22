//Сумма ряда: Напишите программу, которая находит сумму ряда 1, 1/2,
//1/3, ..., 1/N.
fun main() {
    println("значение N:")
    val n = readLine()!!.toInt()
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println("cумма ряда для N = $n: $sum")
}