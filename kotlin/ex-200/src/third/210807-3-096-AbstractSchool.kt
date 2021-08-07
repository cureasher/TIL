package code.third

abstract class School{
    abstract fun getSalary():Int
}

class Student(private val tuition:Int) : School(){
    // 학생 등록금을 납부하므로 salary 음수 처리
    override fun getSalary() =- tuition
}

class Professor(private val classCount: Int):School(){
    // classcount 진행하는 수업
    override fun getSalary() = classCount * 200
}
class Employee(private val initial: Int, private val years: Int):School(){
    override fun getSalary() = initial * (1.0 + years/10.0).toInt()
}

fun getFinance(vararg school: School):Int{
    var i = 0
    var finance = 0
    while( i < school.size){
        finance -= school[i].getSalary()
        i++
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(330), Student(330), Professor(1),Professor(2), Employee(1300, 2))
    println("학교 재정: $finance 만원")
}