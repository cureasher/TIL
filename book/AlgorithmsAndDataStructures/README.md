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
## (4) bruteForceRemoveDuplicate
### 1) 문제
- 중복 값을 가진 배열
- 정렬 되어 있음
- 중복 요소 중 하나만 남겨라
- 중복 안 된 배열의 길이 반환
### 2) 제한사항
- 정수 배열 입력
- 결과 값은 정수, 배열의 길이보다 작거나 같음
- 입력으로 주어진 배열이 0일 수 있음
- 추가 배열 할당 없음
### 3) 풀이
1. 브루트포스
- 배열에 첫번째 값 저장
- 배열의 저장한 값 제외하고 순회
    - 두번째 배열부터 n-1까지 순회
    - 저장한 배열 값과 중복 값이 있으면 다음 요소로 넘어감
    - 저장한 값과 다를 경우 저장한 값을 다른 값으로 업데이트
    - count 값 1증가
    - count 값을 증가시키 전 인덱스가 증가된 값들을 배열에 저장
    - 시간복잡도: O(n), 공간복잡도: O(1)
### 4) 실습
```python
from typing import List
def bruteForceRemoveDuplicate(numbers: List[int]) -> int:
        if len(numbers) <= 0:
            return 0
        numberArray = numbers[0]
        count = 1

        for index in range(1, len(numbers)):
            if numberArray != numbers[index]:
                numberArray = numbers[index]
                numbers[count] = numberArray
                count += 1
        return count
```
### 5) 결과
- 함수 실행
```python
    bruteForceRemoveDuplicate([])
    bruteForceRemoveDuplicate([1,2,3,4])
    bruteForceRemoveDuplicate([0,0,1,1,2,2,3,3,4,4])
```
- 결과
    - 0, 4, 5
## (5) NumberArraySerachInsert
### 1) 문제
- 주어진 배열에서 목표값 찾기
    - 목표값이 있는 경우 인덱스 반환
    - 목표값이 없는 경우 들어가야 하는 인덱스 반환
### 2) 제한사항
- 정수형 배열
- 졍렬된 상태
- 데이터 음수, 0, 양수
- 크기는 클 수 있음
### 3) 풀이
1. 브루트포스
    - 배열의 요소를 인덱스 0부터 순회
    - 목표값과 같거나 크면 순회 종료
    - 졸됴된 시점의 인덱스 반환
    - 시간복잡도: O(n), 공간복잡도: O(1)
2. 해시테이블
    - 배열을 이진탐색으로 접근
    - 결과값이 있는 경우 인덱스 반환
    - 찾지 못할 경우 최종 접근한 낮은 인덱스 반환
    - 시간복잡도: O(logN), 공간복잡도: O(1)
3. 풀이법
    - 목표값과 동일하거나 커지는 시점의 값 반환
    - 순차 탐색은 최악의 경우 모든 요소를 방문해야함
        - 이진탐색은 빠르게 처리할 수 있음
### 4) 실습
```python
def bruteforce_search_insert(numbers: List[int], search: int)-> int:
    index = 0

    while index < len(numbers):
        if search <= numbers[index]:
            break
        index += 1
    return index
```
```python
def hashtable_serach_insert(numbers: List[int], search: int) -> int:
    low = 0
    high = len(numbers) - 1

    while low <= high:
        mid = int((low + high) / 2)

        if search == numbers[mid]:
            return mid
        if search > numbers[mid]:
            low = mid + 1
        else:
            high = mid - 1
    return low
```
### 5) 결과
- 함수 실행
```python
    bruteforce_search_insert([1,3,5,6], 0)
    hashtable_serach_insert([1,3,5,6], 50)
```
- 결과
    - 0, 4

## (6) SortArrayMerge1
### 1) 문제
- 정렬된 배열
- 정렬 유지하면서 배열 합치기
### 2) 제한사항
- 배열은 정렬 된 상태
- 배열운 2개
- 각 n개와 m개의 요소가 있음
- 배열의 크기는 n + m
### 3) 풀이
1. 정렬
- 두번째 배열의 요소를 첫번째 배열의 확보된 공간에 삽입
- sorted() 함수로 정렬
- 시간복잡도: O(NlogN), 공간복잡도: O(N)
2. 비교 및 삽입
- 첫번째 배열
- 두번째 배열
- 저장할 배열
- 첫번째 요소와 두번째 요소 비교
- 비교하여 큰 값을 저장핧 배열에 추가
    - 저장할 배열 길이 1 감소
- 첫번째 요소와 두번째 요소가 0보다 작아지면 비교 종료
- 두번째 요소가 0보다 큰 경우
    - 첫번째 배열을 가리키고 있는 저장한 배열 길이 감소
    - 첫번째 배열에 삽입
- 시간복잡도: O(N+M), 공간복잡도: O(1)
### 4) 실습
```python
from typing import List
def align_merge(number_one_array: List[int], m : int, number_two_array: List[int], n: int) -> List:
    for index, value in enumerate(number_two_array):
        number_one_array[m + index] = value
    number_one_array[:] = sorted(number_one_array)
    return number_one_array
```
```python
from typing import List
def compare_insert_merge(number_one_array: List[int], m : int, number_two_array: List[int], n: int) -> List:
    first = m - 1
    second = n - 1
    save = m + n - 1

    while first >= 0 and second >= 0:
        if number_one_array[first] < number_two_array[second]:
            number_one_array[save] = number_two_array[second]
            second -= 1
        else :
            number_one_array[save] = number_one_array[first]
            first -= 1
        save -= 1
    while second >= 0:
        number_one_array[save] = number_two_array[second]
        save -= 1
        second -= 1
    return number_one_array
```
### 5) 결과
- 함수 실행
    - align_merge([1,2,3], 3, [], 0)
    - compare_insert_merge([1,2,3], 3, [], 0)
    - align_merge([1,2,3,0,0,0], 3, [4,5,6], 3)
    - compare_insert_merge([1,2,3,0,0,0], 3, [4,5,6], 3)
    - align_merge([1,2,3,0,0,0], 3, [1,2,3], 3)
    - compare_insert_merge([1,2,3,0,0,0], 3, [1,2,3], 3)
- 결과
    - [1, 2, 3]
    - [1, 2, 3]
    - [1, 2, 3, 4, 5, 6]
    - [1, 2, 3, 4, 5, 6]
    - [1, 1, 2, 2, 3, 3]
    - [1, 1, 2, 2, 3, 3]

## (7) SortArrayMerge2
### 1) 문제
- 추가 배열 할당 없음
- 첫번째 배열은 작은 수부터 채움
- 두번째 배열은 나머지 수로 정렬
### 2) 제한사항
- 배열은 정렬 된 상태
- 배열은 2개
### 3) 풀이
1. 브루트포스
- 첫번째 배열 순회
- 첫번째 배열과 두번째 배열 크기 비교
- 첫번째 배열의 요소가 큰경우
    - 두번째 배열요소와 첫번째 요소 교체
    - 변경된 첫번째 요소는 다른 요소와 비교하며 정렬
- 시간복잡도: O(mn), 공간복잡도: O(1)
### 4) 실습
```python
from typing import List
def bruteforce_merge(first_number_array: List[int], first: int, second_number_array: List[int], second: int) -> None:
        for index, first_number_item in enumerate(first_number_array):
            if first_number_item > second_number_array[0]:
                first_number_array[index] = second_number_array[0]
                second_number_array[0] = first_number_item

                for save, item in enumerate(second_number_array[1:], start = 1):
                    if first_number_item <= item:
                        second_number_array[save - 1] = first_number_item
                        break
                    second_number_array[save - 1] = second_number_array[save]
        print(first_number_array)
        print(sorted(second_number_array))
```
### 5) 결과
- 함수 실행
bruteforce_merge([1,3,5,7], 4, [0,2,6,8,9], 5)
bruteforce_merge([2, 8, 10], 3, [5], 3)
bruteforce_merge([10,12], 2, [5,18,20], 3)
- 결과
[0, 1, 2, 3]
[5, 6, 7, 8, 9]
[2, 5, 8]
[10]
[5, 10]
[12, 18, 20]

## (8) PascalTriangle
### 1) 문제
- 파스칼 삼각형
    - 수학의 이항 계수를 삼각형의 형태로 숫자 배열한 구성
- 처음 두줄은 1이 들어감
- 숫자 새로만들어 질때
    - 윗줄의 왼쪽, 오른쪽 수를 더해서 만듦
- 2차원 배열로 들어간 형태
    - [[1], [1,1], [1,2,1]...]
### 2) 제한사항
- 양의 정수 입력
- 2차원 배열이나 리스트로 반환
### 3) 풀이
1. 브루트포스
- 기반리스트 생성
- 첫번째 리스트 요소는 1
- 행만큼 순회
- 행의 맨 처음값과 끝갑은 1
- 이전 행의 값을 참조해 사용
- 시간복잡도: O(n²), 공간복잡도: O(1)
2. 풀이법
### 4) 실습
```python
    from typing import List
    def generate(number_rows: int) -> List[List[int]]:
        pascal_triangle = []

        if number_rows <= 0:
            return pascal_triangle

        pascal_triangle.append([1])

        for front in range(1, number_rows):
            pascal_prev_len = len(pascal_triangle[front - 1])
            curr_list = []

            for end in range(pascal_prev_len + 1):
                number = 1
                if end != 0 and end != pascal_prev_len:
                    number = pascal_triangle[front-1][end-1] 
                    + pascal_triangle[front-1][end]
                curr_list.append(number)
            pascal_triangle.append(curr_list)
        return pascal_triangle
```
### 5) 결과
- 함수 실행
    - generate(0)
    - generate(1)
    - generate(3)
    - generate(5)
- 결과
    - []
    - [[1]]
    - [[1], [1, 1], [1, 2, 1]]
    - [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

## (9) ArrayManyElement
### 1) 문제
- 배열에서 숫자 값이 많은 것 찾기
### 2) 제한사항
- 정수형 배열
- 다수의 수는 반드시 1개이상 존재
- 배열은 요소가 1개이상 가짐
### 3) 풀이
1. 브루트포스
- 배열 순회
- 각 배열 요소를 모든요소와 비교
- 요소의 개수를 확인하며 개수 확인
- 시간복잡도: O(n²), 공간복잡도: O(1)
2. 해시테이블
- 해시 테이블 키 항목 배열 요소로 값 항목 지정
- 배열 순회
- 배열 요소를 해시 테이블에서 찾음
    -  값이 있으면 해시 테이블의 값에 1을 더함
    - 값이 없으면 해시 테이블의 키항목으로 추가
- 다수의 수 조건에 맞는 수 반환
- 시간복잡도: O(n), 공간복잡도: O(n)
3. 정렬
- 배열 정렬
- 가운데 수 반환
- 시간복잡도: O(nlogn), 공간복잡도: O(1)
3. 풀이법
### 4) 실습
```python
    def manyElementBruteforce(numbers: List[int]) -> int:
        main_count = int(len(numbers)/2)

        for first, item_first in enumerate(numbers):
            count = 0
            for second, item_second in enumerate(numbers[first:], start=first):
                if item_first == item_second:
                    count += 1
                if count > main_count:
                    return item_first
        return -1
```
```python
    def manyElementHashmap(numbers: List[int]) -> int:
        many_count = int(len(numbers)/2)

        hashmap = {}

        for number in numbers:
            if hashmap.get(number) != None:
                hashmap[number] = hashmap[number] + 1
            else:
                hashmap[number] = 1

            if hashmap[number] > many_count:
                return number
        return -1
```
```python
    def manyElementSort(numbers: List[int]) -> int:
        return sorted(numbers)[int(len(numbers)/2)]
```
### 5) 결과
- 함수 실행
    - manyElementHashmap([3,2,3,2,3])
    - manyElementBrutforce([3,2,3,2,3])
    - manyElementSort([3,2,3,2,3])
    - manyElementHashmap([2,2,1,1,1,1,1,2,2])
    - manyElementBrutforce([2,2,1,1,1,1,1,2,2])
    - manyElementSort([2,2,1,1,1,1,1,2,2])
    - manyElementHashmap([2,2,1,1,1,2,2])
    - manyElementBrutforce([2,2,1,1,1,2,2])
    - manyElementSort([2,2,1,1,1,2,2])
- 결과
    - 3
    - 1
    - 2

## (10) ArrayLotate
### 1) 문제
- 정수형 배열과 move가 주어짐
- move만큼 각요소를 이동 및 회전
### 2) 제한사항
- 정수형 배열
- 양의 정수 k값
### 3) 풀이
1. 임시배열
    - 임시 배열을 입력크기만큼 만듦
    - number 배열 순회
    - 임시 배열에 number 요소의 move만큼 이동 및 회전시킨 값에 넣음
    - 임시 배열의 요소를 number 배열의 같은 인덱스에 넣음
    - 시간복잡도: O(n), 공간복잡도: O(n)
2. 3번 뒤집기
    - 전체 숫자를 뒤집음
    - 처음부터 move까지 뒤집어 넣음
    - move부터 남은 길이만큼 뒤집어 넣음
    - 시간복잡도: O(n), 공간복잡도: O(1)
### 4) 실습
```python
    def rotate_temp(numbers: List[int], move: int) -> List:
        temp = [0] * len(numbers)

        for index, element in enumerate(numbers):
            temp[(index + move) % len(numbers)] = numbers[index]

        numbers[:] = temp
        return numbers
```
```python
    def revert_rotate_array(numbers: List[int], move: int) -> List:      
        move = move % len(numbers)
        numbers[:] = numbers[::-1]
        numbers[0:move] = numbers[0:move][::-1]
        numbers[move:len(numbers)] = numbers[move:len(numbers)][::-1]
        return numbers
```

### 5) 결과
- 함수 실행
    - rotate_temp([2,4,6,8,10], 2)
    - rotate_temp([1,2],3)
    - revert_rotate_array([2,4,6,8,10], 2)
    - revert_rotate_array([1,2],3)
- 결과
    - [8, 10, 2, 4, 6]
    - [2, 1]

## (11) MissingNumber
### 1) 문제
- 주어진 배열에서 누락된 숫자 찾기
### 2) 제한사항
- 정수형 배열(n크기)
- 0~n 사이의 숫자만 가짐
- 빠져있는 숫자는 하나
### 3) 풀이
1. xor
- xor 비트연산
- xor 결과 누적
- 시간복잡도: O(n), 공간복잡도: O(1)
2. 해시셋
- 배열을 해시셋에 넣음
- 해시셋에 없는 값 반환
- 시간복잡도: O(n), 공간복잡도: O(n)
### 4) 실습
```python
from typing import List
def missingNumber_xor(missing_number: List[int]) -> int:
    miss = len(missing_number)

    for index in range(len(missing_number)):
        miss = miss ^ index ^ missing_number[index]

    return miss
```
```python
from typing import List
def missingnumber_hashset(missing_number: List[int]) -> int:
    set_numbers = set(missing_number)

    for index in range(len(missing_number) + 1):
        if index not in set_numbers:
            return index

    return -1
```
### 5) 결과
- 함수 실행
    - missingNumber_hashset([5,4,2,0,1])
    - missingNumber_xor([5,4,2,0,1])
    - missingNumber_hashset([4,2,3,5,7,0,1])
    - missingNumber_xor([4,2,3,5,7,0,1])
- 결과
    - 3
    - 6

## (13) SubSetBruteForce
### 1) 문제
- 고유한 정수 집합 배열
- 가능한 모든 부분집합 반환
- 중복 허용 안함
### 2) 제한사항
- 2차원 정수형 배열
- 입력요소는 중복 허용 안함
### 3) 풀이
1. Brute-force
- index = 0
- subset 배열 선언
- 부분 배열을 결과 배열에 저장
- 0부터 배열길이만큼 순회
    - index 1씩 증가하며 재귀 형태
    - subset재귀 복귀후 마지막 요소 제거 후 순회
- 시간복잡도: O(n*2^n), 공간복잡도: O(n*2^n)
### 4) 실습
```python
from typing import List
def subsets_brute_force(numbers: List[int],
    result: List[List[int]], subset: List[int],
    index) -> List:
    if len(subset) > len(numbers):
        return

    result.append(subset.copy())

    for number in range(index, len(numbers)):
        subset.append(numbers[number])
        subsets_recursion(numbers, result, subset, number + 1)
        subset.pop()
    return result
```
### 5) 결과
- 함수 실행
    - subsets_brute_force([2,4,6],[],[],0)
    - subsets_brute_force([1],[],[],0)
- 결과
    - [[], [2], [2, 4], [2, 4, 6], [2, 6], [4], [4, 6], [6]]
    - [[], [1]]

## (14) WordFindBruteForce
### 1) 문제
- 2차원 배열
- 단어 문자열 만들 수 있는 유무
### 2) 제한사항
- m * n의 2차원 배열
- 인접한 배열만 이동 가능
### 3) 풀이
1. Brute-force
- look 배열의 요소 순회
- look[x][y]와 voca[0] 요소가 같으면 
- 인접한 문자 확인
- 좌표별 다음문자로 재귀 호출
- 시간복잡도: O(m+n*4^l), 공간복잡도: O(1)
### 4) 실습
```python
from typing import List
def WordFindBruteForce(look: List[List[str]], voca: str) -> bool:
    way = [[-1, 0], [1, 0], [0, -1], [0, 1]]

    def search_way(x: int, y: int, voca_find: str):
        if (x < 0 or x >= len(look)) or \
           (y < 0 or y >= len(look[0])):
            return False

        if look[x][y] != voca_find[0]:
            return False

        if len(voca_find) == 1:
            return True

        look[x][y] = '.'

        for first, second in way:
            if search_way(x + first, y + second,
                                voca_find[1:]):
                return True

        look[x][y] = voca_find[0]
        return False

    result = False
    for x in range(len(look)):
        for y in range(len(look[0])):
            if look[x][y] == voca[0] and \
               search_way(x, y, voca):
                result = True
                break
    return result
```
### 5) 결과
- 함수 실행
    - WordFindBruteForce([
         ["A","B","C","E"],
         ["F","G","H","I"],
         ["A","D","E","E"]
        ], "BGDE")
    - WordFindBruteForce([
         ["A","B","C","E"],
         ["F","G","H","I"],
         ["A","D","E","E"]
        ], "GDEF")
- 결과
    - True
    - False

# 2장 문자열
## (1) 문자열의 이해
- str내장객체 클레스
- 처음 생성된 이후 변경불가능한 불변 객체가 됨
- 연산으로 만들어진 새로운 문자열에 할당
## (2) 파이썬에서 문자열 사용법
### 1) 문자열 생성
- 큰 따옴표, 작은 따옴표로 묶인 문자열을 변수에 삽입
### 2) 문자열 변수 접근
- hello = "python"
- hello[0]
- p
- 슬라이스 연산
- hello[2:]
- thon
### 3) 문자열 메서드
- lower()
    - 소문자 변환
    - 'LowerTest'.lower()
    - lowertest
- upper()
    - 대문자 변환
    - 'upperTest'.upper()
    - UPPERTEST
- strip()
    - 문자열의 시작과 끝에 공백 제거
    - '  strip test  '.strip()
    - strip test
- isalpha()
    - 알파벳 확인
    - 'abcd'.isalpha()
    - True
- isdigit()
    - 숫자 확인
    - '1234'.isdigit()
    - True
- isspace()
    - 공백 확인
    - ' '.isspace()
    - True
- isalnum()
    - 공백이 없는 알파벳, 숫자
    - 'a1'.isalnum()
    - True
- startswith('python')
    - 문자열의 시작이 '문자열'로 시작하는지 확인
    - "python Algorithm Test".startswith('python')
    - True
- endswith('Test')
    - 문자열의 끝이 '문자열'로 끝나는지 확인
    - "python Algorithm Test".endswith('Test')
    - True
- find('str')
    - 문자열에서 처음 발견된 문자열의 인덱스 반환
    - 인덱스 0부터 시작
    - "python Algorithm Test".find('Algorithm')
    - 7
- replace('old', 'new')
    - 문자열 치환
    - "slow and slow".replace('slow', 'fast')
    - fast and fast
- split(구분문자)
    - 구분문자로 구분
    - "split test space".split(' ')
    - ['split', 'test', 'space']
- "".join(리스트)
    - join_test=['split', 'test', 'space']
    - ",".join(join_test)
    - split과 반대 역할