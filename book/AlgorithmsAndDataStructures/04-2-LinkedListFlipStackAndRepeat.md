### 3) 실습
```python
def reverseListStack(head: Node) -> Node:
    if head == None:
        return head

    stack = []

    current = head

    while current.next != None:
        stack.append(current)
        current = current.next
    # 역전 후에 첫 노드를 임시 저장하고 반환해야 한다.
    first = current

    while stack:
        current.next = stack.pop()
        current = current.next

    current.next = None

    return first
```
```python
def reverseListRepeat(head: Node) -> Node:
    previous = None
    current = head

    while (current != None):
        next_temp = current.next

        current.next = previous
        previous = current
        current = next_temp
    return previous
```
### 4) 결과
- 함수 실행
    - linked_list = LinkedList()
    - linked_list.list_push_tail(11)
    - linked_list.list_push_tail(12)
    - linked_list.list_push_tail(13)
    - linked_list.litst_push_front(14)
    - node = linked_list.list_result()

    - reverseListRepeat(node)

    - linked_list = LinkedList()
    - linked_list.list_push_tail(11)
    - linked_list.list_push_tail(12)
    - linked_list.list_push_tail(13)
    - linked_list.litst_push_front(14)
    - node = linked_list.list_result()

    - reverseListStack(node)
- 결과
    - IPv4
    - IPv6
    - Neither