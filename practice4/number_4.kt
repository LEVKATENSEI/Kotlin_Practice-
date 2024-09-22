//Определение времени суток
import java.time.LocalTime
fun getTimeOfDay(hour: Int, min:Int): String {
    return when {
        (hour in 6..11 && min in 0..59) -> "утро"
        (hour in 11..17 && min in 0..59) -> "день"
        (hour in 18..23 && min in 0..59) -> "вечер"
        (hour in 0..5 && min in 0..59) -> "ночь"
        else -> "некорректно введены данные"
    }
}

fun main() {
    println("час:")
    var hour = readln().toInt()
    if (hour == 24) println("ночь")
    else{
        println("кол-во минут:")
        var min = readln().toInt()
        println("время суток: ${getTimeOfDay(hour, min)}")
    }
}