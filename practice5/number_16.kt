//Сигма (сумма квадратов): Найдите сумму квадратов всех чисел от 1 до
//N
fun main(){
    println("N:")
    val n = readln().toInt(); var sum:Double = 0.0
    for (a in 1..n) sum += (Math.pow(a.toDouble(), 2.0))
    println("сумма квадратов от 1 до $n = ${sum.toInt()}")
}