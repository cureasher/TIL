package code.second

class Minus(var x: Int = 0, var y: Int = 0){
    infix fun from(base:Minus): Minus{
        return Minus(x - base.x, y - base.y)
    }
}

fun main(args: Array<String>) {
    val minus = Minus(3, 6) from Minus(1, 1)
    println("3-1 = "+minus.x)
    println("6-1 = "+minus.y)
}