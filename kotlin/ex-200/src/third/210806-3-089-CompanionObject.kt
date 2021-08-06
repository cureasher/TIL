package code.third

class InstanceCount private constructor(){
    companion object{
        fun create():InstanceCount{
            countCreated += 1
            return InstanceCount()
        }
        var countCreated = 0
            private set
    }
}

fun main(args: Array<String>) {
    val a = InstanceCount.create()
    val b = InstanceCount.create()
    println("인스턴스 카운트 수: ${InstanceCount.countCreated}")
}