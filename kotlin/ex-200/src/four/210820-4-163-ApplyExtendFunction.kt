package code.four

class PersonApply {
    var name: String =""
    var age: Int = 0

    override fun toString() = "$name $age"
}

fun main(args: Array<String>) {
    println(PersonApply().apply {
        this.name = "Asher"
        this.age = 31
    })
}