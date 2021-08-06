package code.third

const val hello = "Hello"+"Foo!"

object Foo {
    const val introduce = "I am TeddyBear"
}

fun main(args: Array<String>) {
    println(hello)
    println(Foo.introduce)
}