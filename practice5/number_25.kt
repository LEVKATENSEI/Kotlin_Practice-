//Кубы чисел: Выведите кубы чисел от 1 до 10.
fun main(){
    for (a in 1..10){
        print("$a ^ 3 = ${Math.pow(a.toDouble(), 3.0)} \t")
        if(a % 3 == 0) print("\n")
    }
}