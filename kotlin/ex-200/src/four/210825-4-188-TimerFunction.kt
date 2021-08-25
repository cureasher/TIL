package code.four

import java.util.Timer
import kotlin.concurrent.timer

fun main(args: Array<String>) {
    var i = 1
    val t: Timer = timer(initialDelay = 1500, period = 250){
        println(i)
        i++
    }

    Thread.sleep(2400)
    t.cancel()
}