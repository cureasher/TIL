## (2) 연결리스트 연산
- 각 노드를 생성하고 다음 노드에 연결
- 노드의 next 멤버 변수 통해 다음 노드 연결
- head
    - 처음 가리키는 포인터
    - 배열의 0 인덱스 접근하는 것 유사
### 1) 연결리스트 순회
- 노드 클래스 만듦
- 데이터를 가진 노드 3개 생성
- 11의 노드 12값 가지는 노드 연결
- head를 가리키는 temp변수 생성
- temp.next로 연결 리스트 순회
- 연결리스트 순회 코드
```python
from typing import Any
class Node:
    def __init__(self, data: Any):
        self.data = data
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None
                
    def list_result(self):
        temp = self.head
        
        while(temp):
            print(temp.data, end =" ")
            temp = temp.next
        print()
```
- 실행 코드
```python
node_one = Node(11)
linked_list = LinkedList()
linked_list.head = node_one

node_two = Node(12)
node_three = Node(13)
node_one.next = node_two
node_two.next = node_three

linked_list.list_result()
// 결과 11 12 13
```