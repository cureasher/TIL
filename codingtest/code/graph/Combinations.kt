package graph

fun combine(endNumber: Int, combineCount: Int): List<List<Int>> {
    val combinationsList: MutableList<List<Int>> = mutableListOf()
    fun combinations(startNumber: Int, combinationCount: Int, combination: List<Int>) {
        (startNumber..endNumber).forEach {number ->
            if(combinationCount == 1) combinationsList.add(combination + number)
            else combinations(number + 1, combinationCount - 1, combination + number)
        }
    }
    if(combineCount > 0) combinations(1, combineCount, emptyList())
    return combinationsList
}

fun main() {
    println(combine(4,2))
}