import kotlin.random.Random
fun main() {
    var arr = Array<Int>(10, { Random.nextInt(0, 100) })
    println("${arr.joinToString(", ")}\n" +
            "${arr.max()} - макс\n" +
            "${arr.min()} - мин")
}