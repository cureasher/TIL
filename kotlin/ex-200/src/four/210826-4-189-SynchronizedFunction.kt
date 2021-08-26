package code.four

import kotlin.concurrent.thread
private var obj: Int = 0

private fun objPlus(){
    for (i in 1..1000)
        synchronized(obj) {
            obj++
        }
}

fun main(args: Array<String>) {
    thread { objPlus() }
    Thread.sleep(100)
    objPlus()
    println(obj)
}