package code.third

enum class Tool{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>) {
    val shapeMode: Tool = Tool.SHAPE
    println("열거 클래스 상수 이름: ${shapeMode.name}")
    println("열거 상수 순서: ${shapeMode.ordinal}")

    val modes: Array<Tool> = Tool.values()
    for (mode in modes){
        println(mode)
    }

    println(Mode.valueOf("PEN").ordinal)

}