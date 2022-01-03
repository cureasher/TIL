### 4) 연결리스트 노드 삭제
```python
def remove(self, data: Any):
            current = self.head
            previous = None

            if current is not None:
                if current.data == data:
                    self.head = current.next
                    current = None
                    return

            while (current is not None):
                if current.data == data:
                    break
                previous = current
                current = current.next

            if current == None:
                return

            previous.next = current.next

            current = None
```
- 실행코드
```python
linked_list.list_remove(11)
linked_list.list_remove(13)
linked_list.list_result()
// 결과 10 15
```