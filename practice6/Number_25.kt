import kotlin.random.Random
fun main(){
    var arr = Array<Int>(25, { Random.nextInt(-50, 50)})
    println("Ваш чунга: ${arr.joinToString (", ")}\n\nКакой элемент вы хотите найти в чунге: ")
    var a = readln().toInt()
    println(tof(a, arr))
}

fun tof(a: Int, arr:Array<Int>): Boolean {
    return if (a in arr) true else false
}