package string

fun solution(wartermelonLength: Int): String {
    return String(CharArray(wartermelonLength) { charLength -> if (charLength % 2 == 0) '수' else '박' })
}

fun main() {
    println(solution(4))
}