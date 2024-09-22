//Определить время приготовления по типу пищи
fun timeToCook(food:String): String{
    return when{
        food == "картошка" -> "25 мин"
        food == "рис" -> "10 мин"
        food == "курица" -> "60 мин"
        food == "говядина" -> "50 мин"
        food == "гречка" -> "20 мин"
        food == "дошик" -> "3 мин"
        else -> "Неверно введено все!"
    }
}
fun main(){

    println("""
             1       2     3        4        5      6
        [картошка, рис, курица, говядина, гречка, дошик]
    """.trimIndent())
    print("\nномер пищи, которую будете готовить: ")
    var num:Int
    do {
        num = readln().toInt()
    }while (num > 6 || num < 1)
    val food:Array<String> = arrayOf("картофель", "рис", "курица", "говядина", "свинина", "дошик")
    println("\n\nвремя готовки для ${food[num-1]}: ${timeToCook(food[num-1])}")
}
