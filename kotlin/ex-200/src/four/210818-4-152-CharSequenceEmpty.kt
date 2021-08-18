package code.four

fun main(args: Array<String>) {
    val emptyStr = ""
    val whiteSpace = " "
    val nullStr: String? = null

    println(emptyStr.isEmpty())
    println(whiteSpace.isEmpty())

    println(emptyStr.isBlank())
    println(whiteSpace.isBlank())

    println(nullStr.isNullOrEmpty())
    println(nullStr.isNullOrBlank())
}