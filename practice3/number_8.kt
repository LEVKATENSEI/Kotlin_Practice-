//Известны два расстояния: одно в километрах, другое — в футах ( 1 фут
//0,305 м ). Какое из расстояний меньше?
import kotlin.math.max
import kotlin.math.min
fun main(){
    var kms = readln().toDouble(); var foot = readln().toDouble()
    if(kms < (foot * 0.000305)) println("$kms - меньшее")
    else if((foot * 0.000305) < kms) println("$foot - меньшее")
}