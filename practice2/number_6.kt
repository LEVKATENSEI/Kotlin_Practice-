// Вычислить значение логического выражения при следующих
//значениях логических величин А, В и С: А = Истина, В = Ложь, С =
//Ложь: а) А или В; б) А и В; в) В или С.
fun main() {
    val a:Boolean = true; val b:Boolean = false; val c:Boolean = false
    print("A = $a  B = $b  C = $c\n")
    print("Z) ${a or b}   ")
    print("X) ${a and b}   ")
    print("C) ${b or c}   ")
}