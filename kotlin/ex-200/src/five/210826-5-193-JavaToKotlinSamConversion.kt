package code.five

fun main(args: Array<String>) {
    val runnable : Runnable = Runnable { println("SAM") }
    runnable.run()

}