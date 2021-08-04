package code.second

open class FirstCall {
    open var number = 10 // 프로퍼티 오버라이딩
        get()
        {
            println("FirstCall number Getter 호출")
            return field
        }
        set(value){
            println("FirstCall number Setter 호출")
            field = value
        }
}
class SecondCall: FirstCall(){
    override var number: Int
        get() {
            println("Second number Getter 호출")
            return super.number
        }
        set(value) {
            println("SecondCall number Setter 호출")
            super.number = value
        }
}

fun main(args: Array<String>) {
    val test = SecondCall()
    println("FirstCall number: "+test.number) // 슈퍼클래스 number
    test.number = 5 // Setter 호출
    println("SecondCall number: "+test.number) // 변경된 number
}