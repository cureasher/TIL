package code.third


interface Parents{ fun follow(): Unit }

interface Mother: Parents {
    override fun follow() = println("follow his morther")
}

interface Father: Parents{
    override fun follow() = println("follow his farther")
}
class Childs: Mother, Father{
    override fun follow() {
        println("A child decided to ")
        super<Mother>.follow()
        super<Father>.follow()
    }
}
fun main(args: Array<String>) {
    Childs().follow()
}