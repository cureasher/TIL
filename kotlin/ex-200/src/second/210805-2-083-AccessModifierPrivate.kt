package code.second

private class Aclass(){
    private var num = 10
    private fun print()
            = println(num)

    public fun number(value: Int){
        num = value
        print()
    }
}

private class Bclass(age: Int){
    public var age = age
        private set

    val isYoung public get() = age < 30
}
fun main(args: Array<String>) {
    val aclass: Aclass = Aclass()
    println("aclass.num 변수는 private이므로 접근 불가")
    println("aclass.number(15) ${aclass.number(15)}")

    val bclass = Bclass(10)
    println(bclass.age)
    println("bclass.age private이므 접근 불가 외부에서 값 지 못함")
    println(bclass.isYoung)
}