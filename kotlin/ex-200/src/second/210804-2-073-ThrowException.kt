package code.second

import java.lang.Exception

fun main(args: Array<String>) {
    try {
        zeroExcpetionFunc()
    } catch (e: Exception){
        println(e.message)
    }
}

fun zeroExcpetionFunc(){
    val firstnum = 10
    val secondnum = 0
    divide(firstnum, secondnum)
}

fun divide(firstnum: Int, secondnum: Int): Int{
    if (secondnum == 0)
        throw Exception("0으로 나눌 수 없습니다.")
    return firstnum/secondnum
}