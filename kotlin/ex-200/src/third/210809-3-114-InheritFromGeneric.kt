package code.third

interface Plusalbe<T>{
    operator fun plus(other: T): T
}

class Rectangle(val width: Int, val height: Int): Plusalbe<Rectangle>{
    override fun plus(other: Rectangle) = Rectangle(width + other.width, height + other.height)
    override fun toString() = "width: $width, height: $height"
}

fun main(args: Array<String>) {
    val rectangle1 = Rectangle(10,5)
    val rectangle2 = Rectangle(3, 8)
    println("rectangle1: $rectangle1")
    println("rectangle2: $rectangle2")
    println("rectangle1+rectangle2: ${rectangle1+rectangle2}")
}