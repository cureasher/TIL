package code.third

enum class ToolMode(val number: Int){
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERAZER(3);

    fun printNumber(){
        println("함수실행: $number")
    }
}

fun main(args: Array<String>) {
    var toolMode: ToolMode = ToolMode.ERAZER

    println("호출: ${toolMode.number}")
    toolMode.printNumber()
}