package code.second

fun main(args: Array<String>) {
    val person = object{
        val name: String = "cureahser"
        val age: Int = 31
    }
    println("name: "+ person.name)
    println("age: "+person.age)
}