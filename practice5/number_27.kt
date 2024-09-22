//Печать числа "пирамида": Напишите программу, которая выводит
//"пирамиду" из чисел от 1 до N.
fun main(){
    println("N:")
    var n = readlnOrNull()?.toInt()
    for (a in 1..n!!) println("$a\t".repeat(a))
}