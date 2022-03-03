package string

fun solution(s: String): String = String(s.toCharArray().sortedArrayDescending())

fun main() {
    println(solution("Zbcdefg"))
}