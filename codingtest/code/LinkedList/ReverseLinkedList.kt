package linkedlist

fun reverseList(head: ListNode?): ListNode? {
    var previousNode: ListNode? = null
    var currentNode: ListNode? = head

    while (currentNode != null) {
        var nextNode = currentNode?.next
        currentNode.next = previousNode
        previousNode = currentNode
        currentNode = nextNode
    }
    return previousNode

}

fun main() {
    var listNode = ListNode(1)
    listNode.next = ListNode(2)
    listNode.next!!.next = ListNode(3)
    listNode.next!!.next!!.next = ListNode(4)
    listNode.next!!.next!!.next!!.next = ListNode(5)
    listNode.next!!.next!!.next!!.next!!.next = null


    var reverseListCheck = reverseList(listNode)
    printList(reverseListCheck)
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