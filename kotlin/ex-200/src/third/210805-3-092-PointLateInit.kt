package code.third

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형 표현하는 클래스
class Rect{
    lateinit var firstPoint : Point
    lateinit var secondPoint: Point
    val width: Int get() = secondPoint.x - firstPoint.x
    val height: Int get() = secondPoint.y - firstPoint.y
    val area get() = width * height
}
fun main(args: Array<String>) {
    val rect = Rect()
    rect.firstPoint = Point(3,3)
    rect.secondPoint = Point(6,5)

    println("너비: ${rect.width}")
    println("높이: ${rect.height}")
    println("넓이: ${rect.area}")
}