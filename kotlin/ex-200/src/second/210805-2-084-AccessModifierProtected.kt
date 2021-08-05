package code.second

open class SuperClass(protected val number: Int)

class SubClass(number: Int): SuperClass(number){
    fun printNumber(){
        println("서브클래스는 슈퍼클래스 접근 가능: ${number}")
    }
}


fun main(args: Array<String>) {
    val print = SubClass(36)
    println("print.number 클래스 외부이므로 접근 불가")
    print.printNumber()
}