package code.second

class Building{
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
    val building = Building()
    building.name = "오피스텔"
    building.date = "2021-08-02"
    building.area = 120 * 8

    building.print()
}