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