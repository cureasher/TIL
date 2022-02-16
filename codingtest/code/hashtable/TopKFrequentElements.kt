package hashtable

fun topKFrequent(numbers: IntArray, minCount: Int) = numbers
        .groupBy { it }
        .toList()
        .sortedByDescending { it.second.size }
        .take(minCount)
        .map { it.first }

fun main() {
    println(topKFrequent(intArrayOf(1,1,1,2,2,3), 2))
}