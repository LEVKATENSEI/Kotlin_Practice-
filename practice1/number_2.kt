//Вывести на экран число с точностью до сотых.
fun main() {
    var a = readln().toFloat()
    print("${String.format("%.2f", a)} - число с точностью до сотых")
}