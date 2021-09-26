# 1장 배열
## (1) 배열의 이해
- 연속적인 메모리 공간에 저장된 아이템의 집합을 표현하는 자료구조
## (2) 파이썬에서 배열(리스트) 사용법
### 1) 리스트(List)
- 여러 타입을 하나의 자료구조로 담을 수 있음
1. 리스트 초기화 생성방법
```python
py_list_empty = []
py_list = [1,2,3,4,5]
py_list_zeros_1[ for 0 in i in range(10)]
py_list_zeros_2 = [0] * 10
```
2. 리스트 요소 추가 및 삭제
- 추가 메서드
    - append(), extend(), insert()
- 삭제 메서드
    - remove(), clear()
3. 리스트의 요소 접근
- 인덱스
    - 0부터 시작
    - 마지막 요소 -1로 접근
- 슬라이싱
    - ::-1 모든 요소 역으로 접근
    - [3:8] 인덱스 3에서 8까지
### 2) Array 모듈
- 초기화하는 시점에 정해진 하나의 타입만 담을 수 있음
1. Array 모듈을 통한 초기화
- import를 추가해 사용 가능
- 초기화에서 배열 타입을 결정해줘야 함
2. Array 모듈을 통한 삽입 삭제
- 삽입
    - insert()
- 삭제
    - remove()
3. range
    - start, end, step
    - 리스트, 튜플 순회할 때 사용
4. Array 모듈을 통한 배열 접근 및 값 업데이트
- array()
    - 배열로 변환
- index()
    - 배열의 인덱스 출력
- 값 업데이트
배열이름[인덱스] = 값 넣기
## (3) A + B
### 1) 문제
- 정수형 배열 2개 숫자로 목푯값 인덱스 구하기
- 더한 값이 특정 목푯값 만들때 선택한 2개의 정수가 있는 배열의 인덱스 반환
- 요소의 값 중복해서 사용 할수 없음
- 반드시 하나의 정답 존재
### 2) 제한사항
1. 정수형 배열
2. 두수의 합이 정수형을 초과할 수 있는가?
    - 문제에 언급이 없음
3. 두 수의 합 값이 배열 내에 무조건 존재하는가?
    - 무조건 정확히 하나의 해결책 존재
4. 중복된 요소의 값을 2번 이상 사용하여 결괏값을 만들어서는 안됨
### 3) 풀이
1. 브루트포스
    - 배열의 모든 요소의 조합을 찾는다
        - 루프는 i = 0 ~ n, j = i + 1 ~ n으로 2중 루프 구성
        - 첫번째 루프(n번), 두번째 루프(n - 1) 기준
        - n * (n - 1)로 계산
    - 해당 조합으로 목푯값과 비교
        - 해당 루프를 종료하고 각 값을 가진 인덱스를 반환
    - 시간 복잡도 O(n²), 공간복잡도 O(1)
2. 해시테이블
    - 해시 테이블 구성
        - 키 값으로는 배열의 요소, 값으로는 요소의 인덱스 구성
    - 각 요소를 순회
        - 목푯값 - 현재 요소 = 다른 요소
        - 해시 테이블에서 다른 요소의 값을 찾는다
        - 만약 다른 요소가 해시 테이블에 있다면, 현재 요소의 인덱스와 해시 테이블의 값을 반환
        - 다른 요소가 없다면, 현재 요소를 해시 테이블의 키값으로 넣고 인덱스를 해시 테이블 값 항목으로 추가
        - 시간 복잡도 O(n), 공간복잡도 O(n)
3. 풀이법
    - 문제에 중복이 나올 경우 해시 테이블 검토하길 추천
### 4) 실습
```python
def two_number_sum_brute(numbers: List[int], target: int) -> List[int]:
    for first_index in range(0, len(numbers)):
        for second_index in range(first_index + 1, len(numbers)):
            if(numbers[first_index] + numbers[second_index]) is target:
                return [first_index, second_index]
    return [-1, -1]
```
```python
from typing import List
def two_number_sum_hash(numbers: List[int], target: int) -> List[int]:
        hashtable_numbers = {}

        for index in range(0, len(numbers)):
            value = target - numbers[index]

            if hashtable_numbers.get(value) is not None and hashtable_numbers[value] != index:
                return sorted([index, hashtable_numbers[value]])

            hashtable_numbers[numbers[index]] = index
        return [-1, -1]        
```
### 5) 결과
- 함수 실행
```python
    two_number_sum_brute([2,7,8,11], 9)
    two_number_sum_hash([2,5,8,7], 9)
```
- 결과
    - [0, 1]
