//Угадай число
import kotlin.random.Random
fun main() {
    val rand = Random.nextInt(1, 101) // Загадали число от 1 до 100
    var guess: Int?
    var attempts = 0

    println("угадайте число от 1 до 100!")

    do {
        println("ваше число:")
        guess = readLine()?.toInt() // Считываем ввод и пробуем преобразовать в Int
        attempts++

        when {
            guess == null -> println("целое число!!!")
            guess < rand -> println("маленькое число. снова.")
            guess > rand -> println("большое число. Попробуйте снова.")
            else -> {
                Thread.sleep(1_500)
                println("\n\nвы угадали число $rand за $attempts попыток")
            }
        }
    } while (guess != rand)
}