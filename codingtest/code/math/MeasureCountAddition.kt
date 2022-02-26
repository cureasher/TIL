package math

fun solution(left: Int, right: Int): Int {
    val measureRange = left..right
    return measureRange.map { measure -> if ((1..measure).filter { evenCount -> measure % evenCount == 0 }.size % 2 == 0) measure else -measure }.sum()
}

fun main() {
    println(solution(13,17))
    println(solution(24,27))
}