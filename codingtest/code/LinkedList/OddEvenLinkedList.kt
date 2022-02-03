package linkedlist

fun oddEvenList(head: ListNode?) : ListNode?{
    if (head == null) return null

    var odd = head
    var even = head.next
    var evenHead = even

    while (even != null && even.next != null){
        odd?.next = even.next
        odd = odd?.next
        even.next = odd?.next
        even = even.next
    }

    odd?.next = evenHead
    return head
}

fun main() {
    var listNode : ListNode? = ListNode(1)
    listNode?.next = ListNode(2)
    listNode?.next?.next = ListNode(3)
    listNode?.next?.next?.next = ListNode(4)
    listNode?.next?.next?.next?.next = ListNode(5)

    var list = nodeToList(oddEvenList(listNode))
    joinToString(list)
}

// 연결리스트를 ArrayList로 변경
fun nodeToList(node: ListNode?): ArrayList<Int> {
    var node = node
    var list: ArrayList<Int> = arrayListOf()
    while (node != null) {
        list.add(node.`val`)
        node = node?.next
    }
    return list
}

// 컬렉션에 구분자 넣는 함수
fun <T> joinToString(
        collection: Collection<T>,
        separator: String = "->",
        prefix: String = "",
        postfix: String = ""
): String {
    var result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    println(result)
    return result.toString()
}