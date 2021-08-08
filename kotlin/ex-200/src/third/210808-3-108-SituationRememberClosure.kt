package code.third

fun rememberFunction(text: String):() -> Unit = { println(text)}
fun main(args: Array<String>) {
    val call: () -> Unit = rememberFunction("Closure Call")
    call()
}