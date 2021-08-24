package code.four

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    exit(-1)
    println("종료되어 출력되지 않습니다.")
}

fun exit(num: Int){
    if (num < 0){
        exitProcess(0)
    }
}