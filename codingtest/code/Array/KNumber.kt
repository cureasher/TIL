package array

fun solution(numberArray: IntArray, sliceCommands: Array<IntArray>): IntArray {
    return sliceCommands.map { command ->
        numberArray.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
    }.toIntArray()
}

fun main() {
    println(solution(intArrayOf(1,5,2,6,3,7,4),
            arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))).toList())
}
