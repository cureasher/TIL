package code.second

class Size(width: Int, height: Int){
    val width = width
    val height: Int

    init {
        this.height = height
        println("첫번째 초기화")
        println("width: "+this.width)
        println("height: "+this.height+"\n")
    }

    val area: Int
    init {
        area = width * height
        println("두번째 초기화")
        println("width * height: "+ area+"\n")
    }
}
fun main(args: Array<String>) {
    val size = Size(10,50)
    println("area 프로퍼티 호출: "+size.area)
}
