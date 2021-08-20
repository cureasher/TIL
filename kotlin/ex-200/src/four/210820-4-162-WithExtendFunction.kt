package code.four

fun main(args: Array<String>) {
    val firstNumber = 3
    val secondNumber = 7
    with (firstNumber * secondNumber - secondNumber * secondNumber){
        println(this)
        println(-this)
    }
}