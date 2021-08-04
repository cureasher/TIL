package code.second

class CityHall{
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
    var cityhall: CityHall? = CityHall()
    cityhall!!.name = "서울시청"
    println(cityhall!!.name)

    cityhall = null
    cityhall!!.print() // null이기에 예외 발생
}