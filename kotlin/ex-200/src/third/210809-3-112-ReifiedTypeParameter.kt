package code.third

inline fun <reified T> typeCheck(){
    val number = 0
    if (number is T){
        println("T는 Int 타입입니다.")
    }
}

fun main(args: Array<String>) {
    typeCheck<Int>()
}