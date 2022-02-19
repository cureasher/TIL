package graph

fun permute(otherInteger: IntArray, temporaryList: List<Int> = listOf(), OtherList: List<Int> = otherInteger.toList()
): List<List<Int>> = when (OtherList.size) {
    1 -> listOf(temporaryList + OtherList)
    else -> OtherList.flatMap { number -> permute(otherInteger, temporaryList + number, OtherList - number) }
}


fun main() {
    println(permute(intArrayOf(1,2,3)))
}