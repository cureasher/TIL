package deque

import linkedlist.ListNode
import java.lang.StringBuilder
import java.util.*

fun mergeKLists(lists: Array<ListNode?>) : ListNode?{
    val minHeap = PriorityQueue<Int>()

    lists.forEach { headNode ->
        var node = headNode
        while (node != null){
            minHeap.add(node.`val`)
            node = node.next
        }
    }

    var head = if (minHeap.isNotEmpty()) ListNode(minHeap.poll()) else null
    var tail = head
    while (minHeap.isNotEmpty()) {
        tail?.next = ListNode(minHeap.poll())
        tail = tail?.next
    }

    return head
}

fun main() {
    var listNodeFirst = ListNode(1)
    listNodeFirst.next = ListNode(4)
    listNodeFirst.next!!.next = ListNode(5)

    var listNodeSecond = ListNode(1)
    listNodeSecond.next = ListNode(3)
    listNodeSecond.next!!.next = ListNode(4)

    var listNodeThird = ListNode(2)
    listNodeThird.next = ListNode(6)
    var mergeList = mergeKLists(arrayOf(listNodeFirst, listNodeSecond, listNodeThird))
    var list = nodeToList(mergeList)
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