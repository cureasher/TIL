package code.second

fun main(args: Array<String>) {
    val rectangle = Rectangle(5, 7)
    println("rectangle.width private이므로 접근시 에러 발생")
    println("클래스 area 변수 접근 가능: "+rectangle.area)
}

class Rectangle(private val width: Int, private val heigiht : Int){
    val area: Int
        get() = width * heigiht
}