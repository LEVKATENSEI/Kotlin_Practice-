//Вывести на экран число e (основание натурального логарифма) с
//точностью до десятых.
import kotlin.math.exp
fun main() {
    print("${String.format("%.1f", exp(1.0))} - число с точностью до десятых")
}