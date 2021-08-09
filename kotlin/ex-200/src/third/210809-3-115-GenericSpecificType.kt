package code.third

interface ValueContainer{
    fun getValue(): String
}

class FirstValue : ValueContainer{
    override fun getValue():String = "첫번째 컨테이너"
}

class SecondValue : ValueContainer{
    override fun getValue():String = "두번째 컨테이너"
}

fun <T: ValueContainer> T.printValue() = println(this.getValue())

fun main(args: Array<String>) {
    FirstValue().printValue()
    SecondValue().printValue()
}

