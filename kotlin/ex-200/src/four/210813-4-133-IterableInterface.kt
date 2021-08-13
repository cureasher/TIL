package code.four

fun main(args: Array<String>) {
    val intProg: IntProgression = 3..7
    println("intProg의 첫번째 값: ${intProg.first}")
    println("intProg의 마지막 값:${intProg.last}")
    println("intProg의 next(step) 값: ${intProg.step}")

    for (i in intProg){
        print("$i")
    }
}