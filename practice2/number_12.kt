// Вычислить значение логического выражения при следующих
//значениях логических величин А, В и С: А = Истина, В = Ложь, С =
//Ложь: а) А или не (А и В) или С; б) не А или А и (В или С); в) (А или В
//и не С) и С.
fun main() {
    val a:Boolean = true; val b:Boolean = false; val c:Boolean = false
    print("A = $a  B = $b  C = $c\n")
    print("Z) ${a or !(a and b) or c}   ")
    print("X) ${!a or a and (b or c)}   ")
    print("C) ${(a or b and !c) and c}    ")
}