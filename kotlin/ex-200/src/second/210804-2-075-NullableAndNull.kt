package code.second

// 210804-2-065-Upcasting class 재활용
import code.second.Man

fun main(args: Array<String>) {
    var man: Man? = Man("asher", 31)
    println("${man?.name}, ${man?.age}")
    man = null
    println(man)

    var num: Int? = null
    num = 10
    println(num)
}