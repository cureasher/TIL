package array

fun minNumberRemove(numberList: IntArray): IntArray = if (numberList.size == 1) arrayOf(-1).toIntArray()
else numberList.filter { number -> number != numberList.min() }.toIntArray()

fun main() {
    println(minNumberRemove(intArrayOf(4,3,2,1)).toList())
    println(minNumberRemove(intArrayOf(10)).toList())
}