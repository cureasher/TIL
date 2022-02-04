package linkedlist

fun reverseBetween(head: ListNode?, findStart: Int, findEnd: Int): ListNode? {
    val root = ListNode(-1)
    root.next = head

    var previous = root
    var current = root.next

    repeat(findStart-1){
        previous = current!!
        current = current?.next
    }

    val connect = previous
    val tail = current

    for (i in findStart..findEnd){
        val temp = current?.next
        current?.next = previous
        previous = current!!
        current = temp
    }
    connect.next = previous
    tail?.next = current

    return root.next
}
fun main() {
    var linkedList = ListNode(1)
    linkedList.next = ListNode(2)
    linkedList?.next?.next = ListNode(3)
    linkedList?.next?.next?.next = ListNode(4)
    linkedList?.next?.next?.next?.next = ListNode(5)

    joinToString(nodeToList(reverseBetween(linkedList,2,4)))
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