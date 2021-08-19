package code.four

fun main(args: Array<String>) {
    val pairList: List<Int> = Pair(10,20).toList()

    println(pairList)
    val tripleList: List<Double> = Triple(3.1, 6.25, 8.15).toList()
    println(tripleList)


}