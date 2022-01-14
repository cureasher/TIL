## (4) 계단 오르기
### 1) 문제
- 입력으로 주어지는 계단은 1번에 1개, 2개 올라 도달할 수 있는 방법의 가짓수를 찾는 문제

### 2) 실습
```python
def climbStairs(n: int) -> int:
    def climb(n, i):
        if n == i:
           return 1
        if n < i:
           return 0
            
        return climb(n, i + 1) + climb(n, i + 2)
        
    return climb(n, 0)
```