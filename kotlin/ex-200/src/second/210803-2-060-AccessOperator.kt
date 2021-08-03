package code.second

class Birthday(var name: String, var birthday: String){
    operator fun get(position: Int): String{
        return when(position){
            0 -> name
            1 -> birthday
            else -> "알수없음"
        }
    }

    operator fun set(position: Int, value: String){
        when (position){
            0 -> name = value
            1 -> birthday = value
        }
    }
}

fun main(args: Array<String>) {
    val birthday = Birthday("Kotlin v1.0", "2016-2-15")
    println(birthday[0])
    println(birthday[1])
    println(birthday[-1])

    birthday[0] = "Java"
    println(birthday.name)
    birthday.set(0,"Programming")
    println(birthday.name)


}
