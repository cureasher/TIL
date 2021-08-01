package code

fun main(args: Array<String>) {
    // 메인 함수 안에 선언된 함수
    fun sumPrint(number1: Int, number2: Int){
        println(number1 * number2 + number1 - number2)
    }
    sumPrint(73, 1)
    sumPrint(4, 6)
}