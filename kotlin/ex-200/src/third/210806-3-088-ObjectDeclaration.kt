package code.third

object Person
{
    var name: String = ""
    var age: Int = 0
    fun print(){
        println(name)
        println(age)
    }
}
fun main(args: Array<String>) {
    Person.name = "Singleton"
    Person.age = 45
    Person.print()

    val person:Person = Person
    println(person.name)
}