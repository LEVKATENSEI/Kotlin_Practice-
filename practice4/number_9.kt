//Определение длины строки
fun lenghtString(a:String): Int {
    return a.length
}
fun main(){
    println("строка: ")
    var str = readln()
    print("длина строки = ${lenghtString(str)}")

}
