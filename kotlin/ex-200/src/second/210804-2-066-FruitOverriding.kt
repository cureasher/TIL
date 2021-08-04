package code.second

open class Goods{
    open fun goodsItem() = println("과일")
}
class Fruit : Goods(){
    override fun goodsItem(){
        super.goodsItem() // 슈퍼클래스 함수 실행
        println("바나나")
    }
}

fun main(args: Array<String>) {
    Fruit().goodsItem()
}