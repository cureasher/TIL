package code.third

fun String?.isString(){
    if(this == null)
        println("문자열이 null입니다.")
}

fun main(args: Array<String>) {
    val empty:String? = null
    empty.isString()
}