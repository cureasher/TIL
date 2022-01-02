### 2) 연결리스트 맨뒤 요소 삽입
```python
    def list_push_tail(self, data: Any):
        new_node = Node(data)
        
        if self.head is None:
            self.head = new_node
            return
    
        push_tail = self.head
        while (push_tail.next):
            push_tail = push_tail.next
            
        push_tail.next = new_node
```
- 실행코드
```python
linked_list = LinkedList()
linked_list.list_push_tail(1)
linked_list.list_push_tail(2)
linked_list.list_push_tail(3)
linked_list.list_result()
// 결과 1 2 3
```