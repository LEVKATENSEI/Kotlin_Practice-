//Определить день недели по номеру
fun getDayOfWeek(dayNumber: Int, arr: Array<String>): String {
    return when (dayNumber % 7) {
        in 0..6 -> arr[dayNumber % 7]
        else -> "неверный день"
    }
}

fun main() {
    val dayNumber = readln().toInt()
    var days = arrayOf("воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота")
    println(getDayOfWeek(dayNumber, days))
}