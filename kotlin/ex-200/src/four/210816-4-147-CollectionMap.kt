package code.four

fun main(args: Array<String>) {
    val firstList = listOf(65, 66, 67, 68, 69)

    println(firstList.map{ it.toChar()} )

    println(firstList.mapIndexed { index, element ->
        println("[$index]: $element")
        element.toChar()
    })

    val to100 = 1..100
    println(to100.mapNotNull {
        if(it % 3 == 0) it
            else null
    })
}