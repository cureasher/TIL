# (3) Palindrome
## 1) 문제
- 문자열이 회문인지 확인
- 결과값 boolean
## 2) 제한사항
- 대소문자 구분 안함
- 비어있는 문자열은 회문
## 3) 풀이
1. Slicing
    - 파이썬 내장함수
    - 문자열 뒤집은 값을 변수 선언
    - 알파벳과 숫자만 필터 소문자로 변경한 값 변수에 저장
    - 문자열과 뒤집은 문자열 비교후 결과 반환
    - 시간복잡도: O(n), 공간복잡도: O(n)
2. TwoPoint
    - 알파벳과 숫자만 남기고 공백, 특수문자 제거
    - 소문자로 변환
    - start에서 시작, end에서 시작
    - start가 end보다 작을때까지 반복
    - start와 end 값 비교후 다르면 false
    - 확인 후 같으면 true
    - 비교후 결과값 반환
    - 시간복잡도: O(n), 공간복잡도: O(1)
## 4) 실습
```python
def isSlicingPalindrome(words: str) -> bool:
    words = "".join(list(filter(str.isalnum, words))).lower()

    return words == words[::-1]
```
```python
def isTwoPointPalindrome(words: str) -> bool:
    start= 0
    end = len(words) - 1

    words = words.lower()

    while start < end:
        while start < end:
            if words[start].isalnum():
                break
            start += 1

        while start < end:
            if words[end].isalnum():
                break
            end -= 1

        if words[start] != words[end]:
            return False

        start += 1
        end -= 1

    return True
```
## 5) 결과
- 함수 실행
    - isTwoPointPalindrome("Rotator")
    - isSlicingPalindrome("Rotator")
    - isTwoPointPalindrome("Level")
    - isSlicingPalindrome("Level")
- 결과
    - True