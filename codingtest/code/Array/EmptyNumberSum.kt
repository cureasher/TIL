package array

fun emptyNumberSum(numbers: IntArray): Int = 45 - numbers.sum()

fun main() {
    println(emptyNumberSum(intArrayOf(1,2,3,4,6,7,8,0)))
    println(emptyNumberSum(intArrayOf(5,8,4,0,6,7,9)))
}