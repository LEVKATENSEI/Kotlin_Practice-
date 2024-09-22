// Даны два различных вещественных числа. Определить: а) какое из них
//больше; б) какое из них меньше.
import kotlin.math.max
import kotlin.math.min
fun main(){
    var a = readln().toFloat(); var b = readln().toFloat()
    print("${min(a, b)} - меньшее, ${max(a, b)} - большее")
}