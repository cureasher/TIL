package code.third

class InstanceExtend private constructor(){
    companion object{
        fun create():InstanceExtend{
            countCreated += 1
            return InstanceExtend()
        }
        var countCreated = 0
            private set
    }
}

fun InstanceExtend.Companion.create2() = InstanceExtend

fun main(args: Array<String>) {
    InstanceExtend.create()
    InstanceExtend.create2()
    println("인스턴스 확장 카운터: ${InstanceExtend.countCreated}")
}