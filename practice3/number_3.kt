//Из двух чисел с разной четностью вывести на экран нечетное число.
fun main(){
    var a = readln().toInt(); var b = readln().toInt()
    if(a % 2 == 0) println("$a - четное")
    else if(b % 2 == 0) println("$b - четное")
}