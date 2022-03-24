package math

fun solution(firstIntArray: IntArray, secondIntArray: IntArray) :Int {
    return firstIntArray.zip(secondIntArray).map{pair -> pair.first * pair.second }.sum()
}

fun main() {
    println(solution(intArrayOf(1,2,3,4), intArrayOf(-3,-1,0,2)))
    println(solution(intArrayOf(-1,0,1), intArrayOf(1,0,-1)))
}