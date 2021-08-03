package code.second

class Car(val name: String="Tucsan", val type: String="SUV")

fun main(args: Array<String>) {
    val car = Car()
    println("이름: "+car.name)
    println("종류: "+car.type)
}