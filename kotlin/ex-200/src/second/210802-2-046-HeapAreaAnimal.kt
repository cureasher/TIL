package code.second

fun main(args: Array<String>) {
    val animal = object{
        val name: String ="댕댕이"
        val age: Int = 5
    }
    println("name: " +animal.name)
    println("age: "+animal.age)
}