//Если целое число m делится нацело на целое число n, то вывести на
//экран частное от деления, в противном случае вывести сообщение "m
//на n нацело не делится".
fun main() {
    var m = readln().toInt();
    var n = readln().toInt()
    if (m % n == 0) print("${m / n} - частное")
    else print("нацело не делится")
}