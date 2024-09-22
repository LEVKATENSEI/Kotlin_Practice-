//Вычислить значение логического выражения при следующих
//значениях логических величин А, В и С: А = Истина, В = Ложь, С =
//Ложь: а) не А и В; б) А или не В; в) А и В или С.
fun main() {
    val a:Boolean = true; val b:Boolean = false; val c:Boolean = false
    print("A = $a  B = $b  C = $c\n")
    print("X) ${!a and b}   ")
    print("Y) ${a or !b}   ")
    print("Z) ${a and b or c}    ")
}