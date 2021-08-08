package code.third

fun decorate(task:()-> Unit){
    println("===작업시작===")
    task()
    println("===작업끝===")
}

fun main(args: Array<String>) {
    decorate {
        val number1 = 10; val number2 = 5
        println("$number1 + $number2 = ${number1+number2}")
    }

    decorate {
        println("Function call"); println("tasks")
    }
}