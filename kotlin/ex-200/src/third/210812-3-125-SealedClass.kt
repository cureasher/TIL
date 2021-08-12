package code.third

sealed class WhenOuter{
    class One: WhenOuter()
    class Two: WhenOuter()
    class Three: WhenOuter()
}

fun main(args: Array<String>) {
    val instance: WhenOuter = WhenOuter.Three()

    val whenOuter: String = when(instance){
        is WhenOuter.One -> "첫번째"
        is WhenOuter.Two -> "두번째"
        is WhenOuter.Three -> "세번째"
    }

    println(whenOuter)
}