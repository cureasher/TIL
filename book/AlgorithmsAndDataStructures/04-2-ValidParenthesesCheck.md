## (3) 유효한 괄호 검증
- 스택을 사용해야 하는 것을 인지하면 쉬움
### 1) 문제
- 입력으로 주어진 문자열에서 3가지 괄호의 열고 닫는지 확인
- 열고 닫는 것이 정상적인지 확인하는 문제
- 쌍이 맞으면 `true`, 맞지 않으면 `false`
### 2) 제한사항
- 문자열 입력
- 괄호 종류 '(',')','{','}','[',']'
- 비어 있는 문자열은 유효함
### 3) 풀이
- Brute-force
- Stack 생성
- 문자열 순회
- 여는 괄호는 스택에 담음
- 닫는 괄호는 스택에 최근에 문자를 꺼낸 쌍이 맞는지 확인
- 맞지않으면 false, 맞으면 True
- 시간 복잡도 : O(n), 공간 복잡도 : O(n)

### 4) 실습
```python
def isValidParentheses(parentheses: str) -> bool:
    parentheses_stack = []

    paren_map = {
        ')': '(',
        '}': '{',
        ']': '['
    }

    for text in parentheses:
        if text not in paren_map.keys():
            parentheses_stack.append(text)
        else:
            pair = parentheses_stack.pop() if parentheses_stack else ''

            if paren_map[text] != pair:
                return False

    return len(parentheses_stack) == 0
```
### 5) 결과
1. 입력 괄호 문자열
     "()",
     "()[]{}",
     "(]",
     "([)]",
     "{[]}",
     "(",
     "]",
     "((){})"
2. 결과
    True,
    True,
    False,
    False,
    True,
    False,
    False,
    True