package code.third

import kotlin.reflect.KProperty

class GetSetTest{
    var number: Int by OnlyPositive()
}

class OnlyPositive{
    private var realValue: Int = 0

    operator fun getValue(thisRef: Any?, property: KProperty<*>):Int{
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        realValue = if (value > 0) value else 0
    }
}

fun main(args: Array<String>) {
    val getSetTest = GetSetTest()

    getSetTest.number = -50
    println("음수의 결과는: ${getSetTest.number}")

    getSetTest.number = 100
    println("양수의 결과는: ${getSetTest.number}")
}