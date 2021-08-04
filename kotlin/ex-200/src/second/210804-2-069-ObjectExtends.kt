package code.second

open class Cat(val name: String, val age: Int){
    open fun print(){
        println("이름: ${name}")
        println("나이: ${age}")
    }
}

fun main(args: Array<String>) {
    val custom: Cat = object : Cat("야옹이", 7){
        override fun print() {
            super.print() // 슈퍼클래스 함수 사용
            println("It's a obejct")
        }
    }
    custom.print()
}