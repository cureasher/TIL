package code.third

class First<out T>
class Second<in T>

fun main(args: Array<String>) {
    val firstSub = First<Int>()
    val firstSuper: First<Any> = firstSub
    println("정수 타입을 Any타입으로 업캐스팅")

    val secondSuper = Second<Any>()
    val secondSub: Second<Int> = secondSuper
    println("Any타입을 Int 타입으로 다운캐스팅")

    val allType: First<*> = firstSub
    println("<*>: 모든 타입 받을 수 있음")
}