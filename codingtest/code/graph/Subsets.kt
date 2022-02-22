package graph

fun subsets(numbersList: IntArray): List<List<Int>> {
    val allSubsetList = mutableListOf(emptyList<Int>())
    numbersList.forEach { headNumber ->
        val newAddList = allSubsetList.map { nextNumber -> nextNumber + headNumber }
        allSubsetList.addAll(newAddList)
    }
    return allSubsetList
}

fun main() {
    println(subsets(intArrayOf(1,2,3)))
}