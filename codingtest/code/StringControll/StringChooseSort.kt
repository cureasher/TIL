package string

fun solution(strings: Array<String>, choose: Int): Array<String> {
    return strings.sorted().sortedBy { string -> string[choose] }.toTypedArray()
}

fun main() {
    println(solution(arrayOf("sun","bed","car"), 1).toList())
    println(solution(arrayOf("abce","abcd","cdx"), 2).toList())
}