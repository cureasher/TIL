package linkedlist

fun isPalindrome(head: ListNode?): Boolean {
    val map = mutableMapOf<Int, Int>()

    var index = 0
    var currentNode = head
    while (currentNode != null) {
        map[index] = currentNode?.`val`
        currentNode = currentNode?.next
        index++
    }

    var currentPointer = 0
    var nextPointer = index-1
    while (currentPointer < nextPointer) {
        val num1 = map[currentPointer]
        val num2 = map[nextPointer]

        if (num1 != num2) return false

        currentPointer++
        nextPointer--
    }

    return true
}

class ListNode(var `val`: Int){
    var next: ListNode? = null
}

fun main() {
    var listNodeOne = ListNode(1)
    var listNodeTwo = ListNode(2)
    var listNodeThree = ListNode(2)
    var listNodeFour = ListNode(1)
    listNodeOne.next = listNodeTwo
    listNodeTwo.next = listNodeThree
    listNodeThree.next = listNodeFour

    println(isPalindrome(listNodeOne))
}