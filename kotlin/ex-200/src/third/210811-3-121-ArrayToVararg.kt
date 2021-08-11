package code.third

fun printAll(vararg tokens: String){
    for (token in tokens)
        print("$token")

}
fun main(args: Array<String>) {
    val numbers: Array<String> = arrayOf("Whats ","your ","name?")
    printAll(*numbers)
}