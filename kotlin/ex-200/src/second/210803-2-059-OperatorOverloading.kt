package code.second

class Point(var x: Int = 0, var y: Int = 0){
    operator fun plus(other: Point): Point{
        return Point(x + other.x, y + other.y)
    }
    operator fun minus(other: Point): Point{
        return Point(x - other.x, y - other.y)
    }
    operator fun times(number: Int): Point{
        return Point(x * number, y * number)
    }
    operator fun div(number: Int): Point{
        return Point(x / number, y / number)
    }
    fun print(){
        println("x: $x, y: $y")
    }
}

fun main(args: Array<String>) {
    val point1 = Point(3, 7)
    val point2 = Point(2, -6)

    val pointPlus = point1 + point2 // plus 함수 지우면 에러발생
    val pointMinus = point1 - point2 // minus 함수 지우면 에러발생
    val pointTimes = pointPlus * 6 // time 함수 지우면 에러발생
    val pointDiv = pointTimes / 3 // div 함수 지우면 에러발생

    pointPlus.print()
    pointMinus.print()
    pointTimes.print()
    pointDiv.print()
}