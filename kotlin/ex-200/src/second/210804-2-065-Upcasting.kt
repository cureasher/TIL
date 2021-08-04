package code.second

open class Man(val name: String, val age: Int)

class Pupil(name: String, age: Int, val date: Int) : Man(name, age)

fun main(args: Array<String>) {
    val man: Man = Pupil("cureasher", 31, 20210804)

    println("${man.name}, ${man.age}")
    println("서브클래스의 프로퍼티는 불러올 수 없음")
}
