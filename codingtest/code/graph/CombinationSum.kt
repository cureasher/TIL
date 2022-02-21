package graph

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val combineSumList = ArrayList<List<Int>>()

    fun dfs(start: Int, candidatesSum: Int, pathList: ArrayList<Int>) {
        if (candidatesSum == target) {
            combineSumList.add(pathList.toList())
            return
        }

        (start until candidates.size).forEach { number ->
            if (candidatesSum + candidates[number] > target) return@forEach
            pathList.add(candidates[number])
            dfs(number, candidatesSum + candidates[number], pathList)
            pathList.removeAt(pathList.size - 1)
        }
    }

    dfs(0, 0, arrayListOf())
    return combineSumList
}

fun main() {
    println(combinationSum(intArrayOf(2,3,6,7), 7))
}