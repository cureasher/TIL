package array

fun solution(numberArray: IntArray, divisor: Int): IntArray {
    return numberArray.filter { element -> element % divisor == 0 }.sorted().toMutableList().also { divisibleList ->
        if (divisibleList.isEmpty()) divisibleList.add(-1)
    }.toIntArray()
}

fun main() {
    println(solution(intArrayOf(5,9,7,10), 5).toList())
    println(solution(intArrayOf(2,36,1,3), 1).toList())
    println(solution(intArrayOf(3,2,6), 10).toList())
}