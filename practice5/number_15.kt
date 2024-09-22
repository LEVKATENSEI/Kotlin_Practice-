//Проверка палиндрома: Пользователь вводит строку, и программа
//проверяет, является ли она палиндромом.
fun main(){
    println("строка, которую хотите проверить на палиндром: ")
    var a = readlnOrNull(); var b:String
    if (a != null) {
        if (a.isEmpty()) return println("Exit")
    }
    a = a?.replace(" ", "")
    b = a!!.reversed()
    if (a == b) println("палиндром")
    else println("не палиндром")
}