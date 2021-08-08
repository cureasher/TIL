package code.third

fun main(args: Array<String>) {
    val instantFunc: (String) -> Unit = fun(text: String): Unit{
        println("$text")
    }

    instantFunc("Anoymous\nFunction")
}