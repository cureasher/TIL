package code.second

class House(val name: String ="",
            val date: String= "",
            var area: Int =0){
    override fun toString() =
            "이름: ${this.name}\n"+
             "건축일자: ${this.date}\n"+
             "면적: ${this.area}m²"
}

fun main(args: Array<String>) {
    val house = House("아파트","2021-08-04", area = 100)
    printObject(house)
}

fun printObject(any: Any){
    println(any.toString())
}