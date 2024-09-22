//Определить какое из трех введенных пользователем чисел
//максимальное и вывести его на экран.
import kotlin.math.max
fun main(){
    val a = readln().toInt(); val c = readln().toInt(); val b = readln().toInt()
    var m:Int = max(a, b)
    m = max(m, c)
    println("$m - максимальное число")

}