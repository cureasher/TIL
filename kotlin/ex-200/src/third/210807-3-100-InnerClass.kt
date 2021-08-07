package code.third

class OuterClass(private val value: Int){
    fun print(){
        println(this.value)
    }
    inner class Inner(private val innerValue: Int){
        fun print(){
            this@OuterClass.print()
            println(this.innerValue + this@OuterClass.value)
        }
    }
}

fun main(args: Array<String>) {
    val instance: OuterClass = OuterClass(610)
    val innerInstance: OuterClass.Inner = instance.Inner(40)
    innerInstance.print()
}