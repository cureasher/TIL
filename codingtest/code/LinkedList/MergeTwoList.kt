package linkedlist

fun mergeTwoLists(firstNode: ListNode?, secondNode: ListNode?) : ListNode? {
    if (firstNode == null && secondNode == null) return null
    if (firstNode == null) return secondNode
    if (secondNode == null) return firstNode

    if (firstNode.`val` < secondNode.`val`){
        firstNode.next = mergeTwoLists(firstNode.next, secondNode)
        return firstNode
    } else {
        secondNode.next = mergeTwoLists(secondNode.next, firstNode)
        return secondNode
    }
}

fun main() {
    var listNodeOne = ListNode(1)
    listNodeOne.next = ListNode(2)
    listNodeOne.next!!.next = ListNode(4)

    var listNodeTwo = ListNode(1)
    listNodeTwo.next = ListNode(3)
    listNodeTwo.next!!.next = ListNode(4)
    var mergeToList : ListNode? = mergeTwoLists(listNodeOne, listNodeTwo)
    printList(mergeToList)

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