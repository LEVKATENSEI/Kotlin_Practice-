//Генерация случайных чисел: Сгенерируйте и выведите 10 случайных
//чисел от 1 до 100.
import kotlin.random.Random
fun main(){
    for (a in 1..10) println(Random.nextInt() % 1000)
}