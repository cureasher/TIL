package code.four

class PersonAlso {
    var name: String = ""
    var age: Int = 0

    override fun toString() = "$name $age"
}

fun main(args: Array<String>) {
    println(PersonAlso().also { personAlso: PersonAlso ->
        personAlso.name = "Asher"
        personAlso.age = 31
    })
}