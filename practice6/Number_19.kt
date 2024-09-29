fun main() {
    var arr1 = arrayOf(3, 1, 2, 4, 0)
    var arr2 = arrayOf(5, 9, 7, 6, 8)
    var arr3 = arrayOf(*arr1, *arr2)
    println(
        """
                (Не отсортированные) 
        Первый чунга: ${arr1.joinToString(", ")}
        Второй чунга: ${arr2.joinToString(", ")}
        Третий чунга: ${arr3.joinToString(", ")}
    """.trimIndent()
    )
    println()
    arr1.sort(); arr2.sort();arr3.sort()
    println(
        """
                (Отсортированные)
        Первый чунга: ${arr1.joinToString(", ")}
        Второй чунга: ${arr2.joinToString(", ")}
        Третий чунга: ${arr3.joinToString(", ")}
    """.trimIndent()
    )
    println()
}