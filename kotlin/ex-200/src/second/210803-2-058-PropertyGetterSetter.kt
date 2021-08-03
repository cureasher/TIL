package code.second

class Book{
    var price: Int = 0
        get() {
            return field
        }
        set(value) {
            field = if(value >= 0) value else 0
        }
}

fun main(args: Array<String>) {
    val book = Book()
    // 가격 입력 setter
    book.price = 10000
    println("가격 출력")
    // 가격 출력 getter
    println(book.price)
    book.price = 15000
    println("가격 변경 후 출력")
    println(book.price)

}