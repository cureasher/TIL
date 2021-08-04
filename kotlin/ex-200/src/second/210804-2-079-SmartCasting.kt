package code.second

fun main(args: Array<String>) {
    val nullnumber: Int? = null
    val number = 10

    checkNull((nullnumber))
    checkNull(number)

}
fun checkNull(nullcheck: Any?){
    if(nullcheck == null){
        println("null이 들어왔습니다.")
        return
    }
    println(nullcheck.toString())
}