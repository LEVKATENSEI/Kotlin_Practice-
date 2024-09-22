//Разработайте программу, которая возведет число в определенную
//степень.
import kotlin.math.pow
fun main() {
    print("число: ")
    var a = readln().toDouble()
    print("степень: ")
    var b = readln().toInt()
    print("\n\n $a ^ $b = ${a.pow(b)}")
}