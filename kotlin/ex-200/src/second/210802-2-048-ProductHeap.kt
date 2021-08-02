package code.second

class Product{
    var name =""
    var price = 0
}

fun main(args: Array<String>) {
    val product: Product = createProduct()
    printProduct(product)
    priceAddProduct(product)
    printProduct(product)
}

fun createProduct(): Product{
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000

    return apple
}

fun priceAddProduct(product: Product) {
    product.price += 500
}

fun printProduct(product: Product){
    println("이름: ${product.name}")
    println("가격: ${product.price}")
}