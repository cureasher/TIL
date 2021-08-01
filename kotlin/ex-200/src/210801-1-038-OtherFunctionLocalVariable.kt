package code

fun main(args: Array<String>) {
    val localVariable = "main"
    println(localVariable)

    otherFunction()
    anotherFunction()
}

fun otherFunction(){
    val localVariable = "otherFunction"
    println(localVariable)
}

fun anotherFunction(){
    val localVariable =  "anotherFunction"
    println(localVariable)
}