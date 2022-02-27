package array

fun solution(numbers: IntArray): IntArray {
    val numberList = numbers.toList()
    return numberList.withIndex().flatMap {
        firstNumber -> numberList.withIndex().map {
        secondNumber -> firstNumber to secondNumber} }
            .filter { sameNumber -> sameNumber.first.index != sameNumber.second.index }
            .map { otherNumber -> otherNumber.first.value + otherNumber.second.value }
            .toSortedSet()
            .toIntArray()
}

fun main() {
    println(solution(intArrayOf(2,1,3,4,1)).toList())
}