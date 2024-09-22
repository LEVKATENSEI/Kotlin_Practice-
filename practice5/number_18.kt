//Задача на лестницу: Напишите программу, которая выводит лестницу
//из символа "#" высотой N, где N задает пользователь.
fun main(){
    println("N:")
    var n = readlnOrNull()?.toInt()
    for (a in 1..n!!) println("#".repeat(a))
}