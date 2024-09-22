//Вычислить значение логического выражения при следующих
//значениях логических величин X, Y и Z: X = Истина, Y = Истина, Z =
//Ложь: а) не X и Y; б) X или не Y; в) X или Y и Z
fun main() {
    val x:Boolean = true; val y:Boolean = true; val z:Boolean = false
    print("X = $x  Y = $y  Z = $z\n")
    print("Z) ${!x and y}   ")
    print("X) ${x or !y}   ")
    print("C) ${x or y and z}   ")
}