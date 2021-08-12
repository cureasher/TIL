package code.third

interface Plusable{
    operator fun plus(other: Int): Int
}

class ClassDelegator: Plusable{
    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}
// Plusable 인터페이스를 다른 클래스에서 구현
class DelegateTest : Plusable by ClassDelegator()

fun main(args: Array<String>) {
    println(DelegateTest() + 10)
}
