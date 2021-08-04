package code.second

class Stadium{
    var name = ""
    var date = ""
    var area = 0
    fun print(){
        println("이름: ${this.name}")
        println("건축일자: ${this.date}")
        println("면적: ${this.area}m²")
    }
}

fun main(args: Array<String>) {
    var stadium: Stadium? = null

    stadium?.print()
    stadium?.name ="건물"

    stadium = Stadium()
    stadium?.name = "서울월드컵경기장"
    stadium?.date = "2001년 11월 10일"
    stadium?.area = 21_6712
    stadium.print()
}