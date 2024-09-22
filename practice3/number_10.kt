//Определить, является ли число a делителем числа b?
fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    if (b % a == 0) println("число $a является делителем $b")
    println(b % a)
}
