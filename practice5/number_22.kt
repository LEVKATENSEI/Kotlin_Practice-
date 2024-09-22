//Угадай число: Напишите игру, в которой пользователь должен угадать
//случайное число от 1 до 100.
import kotlin.random.Random
fun main() {
    val rand = Random.nextInt(1, 101) // Загадали число от 1 до 100
    var guess: Int?
    var attempts = 0

    println("угадайте число от 1 до 100")

    do {
        println("ваше число:")
        guess = readLine()?.toInt() // Считываем ввод и пробуем преобразовать в Int
        attempts++

        when {
            guess == null -> println("нужно целое число")
            guess < rand -> println("маленькое число. Снова.")
            guess > rand -> println("большое число. Снова.")
            else -> {
                Thread.sleep(1_500)
                println("\n\nугадали число $rand за $attempts попыток!")
            }
        }
    } while (guess != rand)
}