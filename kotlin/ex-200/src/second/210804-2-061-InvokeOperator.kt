package code.second

class Ware(val id: Int, val name: String){
    operator fun invoke(value: Int){
        println(value)
        println("id: $id\nname: $name")
    }
}
fun main(args: Array<String>) {
    val ware = Ware(762443, "코틀린 200제")
    ware(108)
}