package array

fun solution(businessCardSizes: Array<IntArray>): Int {
    var maxWidth = 0
    var maxHeight = 0
    for (rectangle in businessCardSizes) {
        rectangle.sort()
        if (rectangle.isNotEmpty()) {
            maxWidth = rectangle.first().coerceAtLeast(maxWidth)
            maxHeight = rectangle.last().coerceAtLeast(maxHeight)
        }
    }

    return maxWidth * maxHeight
}

fun main() {
    println(solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))))
    println(solution(arrayOf(intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15))))
    println(solution(arrayOf(intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11))))
}