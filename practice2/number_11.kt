//Вычислить значение логического выражения при следующих
//значениях логических величин X, Y и Z: X = Ложь, Y = Ложь, Z =
//Истина: а) X или Y и не Z; г) X и не Y или Z; б) не X и не Y; д) X и (не
//Y или Z); в) не (X и Z) или Y; е) X или (не (Y или Z)).
fun main() {
    val x:Boolean = false; val y:Boolean = false; val z:Boolean = true
    print("X = $x  Y = $y  Z = $z\n")
    print("А) ${(x or y and !z)}   ")
    print("Г) ${x and !y or z}   ")
    print("Б) ${!x and !y}   ")
    print("Д) ${(x and(!y or z))}   ")
    print("В) ${!(x and z) or y}   ")
    print("Е) ${(x or (!(y or z)))}   ")
}