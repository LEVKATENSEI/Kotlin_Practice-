//Дано трехзначное число. Найти: а) число единиц в нем; б) число
//десятков в нем; в) сумму его цифр; г) произведение его цифр
fun main() {
    var num: Int
    do {
        print("трёхзначное число: ")
        num = readln().toInt()
    } while (num !in 100..999)
    println("\n\n\tваше число - $num\n\tA)${num % 10 % 10}\t\t\tB)${num / 10}\n\tC)${num / 10 / 10 + num / 10 % 10 + num % 10 % 10}\t\tD)${(num / 10 / 10) * (num / 10 % 10) * (num % 10 % 10)}")
}