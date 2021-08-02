package code.second

fun main(args: Array<String>) {
    var count = ""
    var itemNumber = 1

    while(itemNumber <= 100){
        count+= "${itemNumber}"
        itemNumber++
    }
    println(count)
}