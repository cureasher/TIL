package math2

fun solution(a: Int, b: Int): Long {
    var rangeSum = 0L
    (Math.min(a, b)..Math.max(a, b)).forEach { number -> rangeSum += number }
    return rangeSum
}

fun main() {
    println(solution(3, 5))
    println(solution(3,3))
    println(solution(5,3))
}