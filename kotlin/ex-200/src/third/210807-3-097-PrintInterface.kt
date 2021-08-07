package code.third

interface Printable{
    fun print():Unit
}

class Print: Printable{
    override fun print() {
        println("Print Use")
    }
}
// Printable 타입 인수 받는 print 함수
fun print(anything: Printable){
    anything.print()
}

fun main(args: Array<String>) {
    print(Print())
}