### 3) 실습
```python
def hasCycleHashTable(head: Node) -> bool:
    current = head
    node_set = set()

    while current != None:
        if current in node_set:
            return True

        node_set.add(current)
        current = current.next

    return False
```

```python
def hasCycleTwoPoint(head: Node) -> bool:
    onepoint = head
    twopoint = head

    while twopoint != None and twopoint.next != None:
        onepoint = onepoint.next
        twopoint = twopoint.next.next

        if onepoint == twopoint:
            return True

    return False
```
### 4) 결과
[3,2,0,-4]
1
[1,2]
0
[1]
-1

코드 결과 : True, True, False