### 3) 연결리스트 맨앞 요소 삽입
```python
    def litst_push_front(self, data: Any):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        temp = self.head
        self.head = new_node
        new_node.next = temp
```
- 실행코드
```python
linked_list = LinkedList()
linked_list.list_push_tail(1)
linked_list.list_push_tail(2)
linked_list.list_push_tail(3)
linked_list.litst_push_front(10)
linked_list.list_result()
// 결과 10 11 13 15
```