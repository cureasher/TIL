package code.four

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val builder = StringBuilder()
        .append("2018 ")
        .append("Pyeongchang ")
        .append("Olympic")

    val stringResult = builder.toString()
    println(stringResult)
}