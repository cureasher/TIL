package code.second

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
        val text = "abcd"
        val number = text.toInt()
        println(number)
    } catch (e: NumberFormatException){
        println("문자열을 숫자로 변경하지 못함")
    } finally {
        println("프로그램 종료")
    }
}