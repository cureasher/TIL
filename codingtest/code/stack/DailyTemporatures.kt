package stack
import java.util.*

fun dailyTemperatures(temperatureList: IntArray): IntArray {
    val stack = ArrayDeque<Pair<Int, Int>>()

    temperatureList.forEachIndexed { index, temperatureRise ->
        temperatureList[index] = 0
        while (stack.isNotEmpty() && temperatureRise > stack.peek().second) {
            temperatureList[stack.peek().first] = index - stack.pop().first
        }
        stack.push(Pair(index, temperatureRise))
    }
    return temperatureList
}
fun main() {
    println(dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73)).toList())
}