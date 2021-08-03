package code.second

class ThisUse{
    var number = 15

    fun printNumber(number: Int){
        println(number) // 입력 받은 변수 사용
        println(this.number) // 클래스 프로퍼티 사용
    }
}

fun main(args: Array<String>) {
    val thisuse = ThisUse()
    thisuse.printNumber(53)
}