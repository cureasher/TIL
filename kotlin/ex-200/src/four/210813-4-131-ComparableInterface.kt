package code.four

interface Comparable<in T>{
    operator fun compareTo(other: T): Int
}


class Rectangle(val width: Int, val height: Int): Comparable<Rectangle>{
    val area = width * height
    override fun compareTo(other: Rectangle) =
        when{
            this.area > other.area -> 1
            this.area < other.area -> -1
            else -> 0
        }
}

fun main(args: Array<String>) {
    val firstRectangle = Rectangle(3,5)
    val secondRectangle = Rectangle(7,3)
    val thirdRectangle = Rectangle(2,9)

    println("firstRectangle >= thirdRectangle: ${firstRectangle >= thirdRectangle}")
    println("firstRectangle < secondRectangle: ${firstRectangle < secondRectangle}")
    println("secondRectangle > thirdRectangle: ${secondRectangle > thirdRectangle}")
}
