package code.second

open class Hello(protected open val text: String){
    protected open fun hello(){
        println("Hello")
    }
}

class World(text: String) : Hello(text){
    public override val text: String
        get() = super.text

    public override fun hello() {
        super.hello()
    }
}

fun main(args: Array<String>) {
    val world = World("World")
    val hello: Hello = world
    println("hello.text 접근 불가 에러 발생")
    println("hello.hello() 접근 불가 에러 발생")
    world.hello()
    println(world.text)

}