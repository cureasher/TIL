package code.third

fun main(args: Array<String>) {
    val PrintFunction: (String) -> Unit = {
        println("it $it")
    }

    PrintFunction("identifier")
}