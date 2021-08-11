package code.third

enum class Mode{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>) {
    val mode: Mode = Mode.PEN

    when (mode){
        Mode.SELECTION -> println("선택모드")
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("지우개 모드")
    }
}