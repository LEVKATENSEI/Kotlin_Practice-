//Сумма четных и нечетных чисел: Пользователь вводит N, программа
//считает сумму четных и нечетных чисел от 1 до N.
fun main(){
    println("N: ")
    val n = readln().toInt()
    var sumChet:Int = 0; var sumNechet:Int = 0
    for (a in 1..n){
        if (a % 2 == 0) sumChet += a
        else sumNechet += a
    }
    println("сумма четных = $sumChet\nсумма нечетных = $sumNechet")
}