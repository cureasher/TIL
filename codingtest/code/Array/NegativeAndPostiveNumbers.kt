package array

fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.foldIndexed(0) { index, sum, number -> sum + if (signs[index]) number else -number }

fun main() {
    println(solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
    println(solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true)))
}