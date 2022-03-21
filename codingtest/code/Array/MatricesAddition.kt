package array

import java.util.*

fun solution(firstArray: Array<IntArray>, secondArray: Array<IntArray>): Array<IntArray> {
    return Array<IntArray>(firstArray.size) { firstNumber ->
        IntArray(firstArray[0].size) { secondNumber ->
            firstArray[firstNumber][secondNumber] + secondArray[firstNumber][secondNumber]
        }
    }
}

fun main() {
    println(Arrays.deepToString(solution(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)), arrayOf(intArrayOf(3, 4), intArrayOf(5, 6)))))
    println(Arrays.deepToString(solution(arrayOf(intArrayOf(1), intArrayOf(2)), arrayOf(intArrayOf(3), intArrayOf(4)))))
}