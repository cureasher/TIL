package code.third

fun main(args: Array<String>) {
    val instantFunc: (String) -> Unit
    instantFunc = {text:String ->
        println("Hello $text")
    }

    instantFunc("Lamda")
    instantFunc.invoke("FunctionLiterall")
}