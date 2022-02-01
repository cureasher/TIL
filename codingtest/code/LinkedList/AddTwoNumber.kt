package linkedlist

fun addTwoNumbers(firstListNode: ListNode?, secondListNode: ListNode?, carry: Int = 0): ListNode? {
    if (firstListNode == null && secondListNode == null && carry == 0) return null
    val numberSum = (firstListNode?.`val` ?: 0) + (secondListNode?.`val` ?: 0) + carry
    return ListNode(numberSum % 10).apply { next = addTwoNumbers(firstListNode?.next, secondListNode?.next, numberSum / 10) }
}

fun main() {
    var firstNumberList : ListNode? = ListNode(2)
    firstNumberList?.next = ListNode(4)
    firstNumberList?.next?.next = ListNode(3)
    printList(firstNumberList)

    println()

    var secondNumberList : ListNode? = ListNode(5)
    secondNumberList?.next = ListNode(6)
    secondNumberList?.next?.next = ListNode(4)
    printList(secondNumberList)
    println()
    println("-----")

    printList(addTwoNumbers(firstNumberList,secondNumberList))


}

class ListNode(var `val`: Int){
    var next: ListNode? = null

    constructor(`val`:Int, next : ListNode?) : this(`val`) {
        this.`val` = `val`
        this.next = next
    }
}

fun printList(listNode: ListNode?){
    var listNode = listNode
    while (listNode != null){
        print(listNode!!.`val`)
        listNode = listNode.next
    }
}