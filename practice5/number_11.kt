//Анаграммы: Программа проверяет, являются ли две введенные строки
//анаграммами.
fun main() {
    println("первую строку:")
    val str1:String = readLine().toString()
    println("вторую строку:")
    val str2:String = readLine().toString()

    if (anagrams(str1, str2)) {
        println("строки являются анаграммами.")
    } else {
        println("строки не являются анаграммами.")
    }
}

fun anagrams(str1: String, str2: String): Boolean {
    val normalizedStr1 = str1.replace(" ", "").toLowerCase().toCharArray().sorted()
    val normalizedStr2 = str2.replace(" ", "").toLowerCase().toCharArray().sorted()
    return normalizedStr1 == normalizedStr2
}