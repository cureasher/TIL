### 6) 두수 더하기
## 1) 문제
- 2개의 연결 리스트의 숫자를 더해서 연결 리스트로 반환
- 문자열이 서로 같은 애너그램끼리 묶어라
## 2) 제한사항
- 연결 리스트는 양의 정수
- 1번째 노드는 가장 높은자리 숫자
- 두 리스트에 무조건 값은 있다
- 0외에는 0으로 시작하는 숫자는 없다
## 3) 풀이
1. 스택
    - 2개의 스택 생성
    - first_stack, second_stack을 각각 순회하며 노드 값을 스택에 넣음
    - 1의자리부터 스택의 값을 더함
    - 더한 값을 새로운 연결 리스트 노드에 연결함
2. 연결리스트 뒤집기
    - 연결리스트를 뒤집는다
    - 뒤집은 연결리스트를 순회한다
    - 순회하며 각 자리수를 더한다
    - 더할 때 새로운 노드를 생성하고 연결
## 4) 실습
```python
def addTwoNumbersStack(first_list: Node, second_list: Node) -> Node:
    first_stack = []
    second_stack = []

    current_list = first_list
    next_list = second_list

    head = None

    while current_list != None:
        first_stack.append(current_list.data)
        current_list = current_list.next

    while next_list != None:
        second_stack.append(next_list.data)
        next_list = next_list.next

    carry = 0
    while first_stack or second_stack:
        num1 = first_stack.pop() if first_stack else 0
        num2 = second_stack.pop() if second_stack else 0

        carry, num = divmod(num1 + num2 + carry, 10)

        node = Node(num)
        if head == None:
            head = node
        else:
            temp = head
            head = node
            node.next = temp

    if carry != 0:
        node = Node(carry)
        temp = head
        head = node
        node.next = temp

    return head
```
```python
def addTwoNumbersReverse(first_list: Node, second_list: Node) -> Node:
    def reverse(head):
        prev = None
        curr = head

        while curr != None:
            next_temp = curr.next
            curr.next = prev

            prev = curr
            curr = next_temp
        return prev

    reverse_first_list = reverse(first_list)
    reverse_second_list = reverse(second_list)

    res_head = None

    carry = 0
    while reverse_first_list != None or reverse_second_list != None:
        num1 = 0
        num2 = 0

        if reverse_first_list != None:
            num1 = reverse_first_list.data
            reverse_first_list = reverse_first_list.next
        if reverse_second_list != None:
            num2 = reverse_second_list.data
            reverse_second_list = reverse_second_list.next

        carry, num = divmod(num1 + num2 + carry, 10)

        node = Node(num)
        if res_head == None:
            res_head = node
        else:
            temp = res_head
            res_head = node
            node.next = temp

    if carry != 0:
        node = Node(carry)
        temp = res_head
        res_head = node
        node.next = temp

    return res_head
```

## 5) 결과
1. 입력
- [7, 2, 4, 3], [5, 6, 4]
- [7, 8, 2], [2, 1]

2. 결과
- [7, 8, 0, 7]
- [8, 0, 3]