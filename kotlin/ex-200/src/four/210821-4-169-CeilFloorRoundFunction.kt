package code.four

import kotlin.math.*

fun main(args: Array<String>) {
    println("3.2 올림: ${ceil(3.2)}")
    println("3.7 올림: ${ceil(3.7)}")
    println("3.2 내림: ${floor(3.2)}")
    println("3.7 내림: ${floor(3.2)}")
    println("3.2 반올림: ${round(3.2)}")
    println("3.7 반올림: ${round(3.7)}")
    println("15.83 반올림하고 Int타입으로 변환: ${15.83.roundToInt()}")
    println("37842.45 반올림하고 Long타입으로 변환: ${37842.45.roundToLong()}")
}