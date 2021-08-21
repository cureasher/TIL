package code.four

fun main(args: Array<String>) {
    val firstNumber = 78423343545.toBigInteger()
    val secondNumber = 25372465331.toBigInteger()

    println("더하기: ${firstNumber + secondNumber}")
    println("빼기: ${firstNumber - secondNumber}")
    println("나머지: ${firstNumber.rem(secondNumber)}")
    println("몫: ${firstNumber.div(secondNumber)}")
    println("곱하기: ${firstNumber.times(secondNumber)}")



}