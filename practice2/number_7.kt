//Вычислить значение логического выражения при следующих
//значениях логических величин X, Y и Z: X = Ложь, Y = Истина, Z =
//Ложь: а) X или Z; б) X и Y; в) X и Z
fun main() {
    val x:Boolean = false; val y:Boolean = true; val z:Boolean = false
    print("X = $x  Y = $y  Z = $z\n")
    print("A) ${x or z}   ")
    print("B) ${x and y}   ")
    print("C) ${x and z}   ")
}