# 코딩테스트 정리
## 1. 문자열 조작
### 1) [유효한 팰린드롬](../code/StringControll/ValidPalindrome.kt)
- 접근방법
    - 대소문자 구분안하므로 문자열 소문자나 대문자로 변환
    - 영문자와 숫자만을 대상으로 확인
    - 구현시 자바와의 차이점
        - 자바는 replaceAll을 써야하지만 kotlin은 `toRegex()`를 쓰고 `replace`로 문자열 처리함.
### 2) [문자열 뒤집기](../code/StringControll/ReverseString.kt)
- 접근방법
    - 문자 배열 입력 받기
    - 리턴 없이 내부 리스트 조작
    - `reversed()`함수로 문자열 뒤집음
### 3) [가장 흔한 단어](../code/StringControll/MostCommonWord.kt)
- 접근방법
    - 문자열을 소문자로 변환
    - 정규식으로 문자 외에는 " "으로 치환
        - ([^\\w])단어 문자가 아닌 모든 문자
    - " "으로 쪼갬(split)
    - banned 아닌 것만 찾아라
    - 값이 제일 많은것을 출력
### 4) [로그 파일 재정렬](../code/StringControll/ReorderLogFiles.kt)
- 접근방법
    - 첫번째 공백으로 로그 식별자 구분(map 함수로 필요한 로그 분리)
    - partition함수를 통해 문자로그와 숫자로그 구분
    - sortedWith함수에서 compareBy를 통해 문자로그 비교 후 식별자 비교
    - 정렬된 문자로그와 숫자로그를 합친 값 출력
### 5) [그룹 애너그램](../code/StringControll/GroupAnagrams.kt)
- 접근방법
    - groupBy 함수로 문자열의 Key, Value로 그룹을 묶음
    - toCharArray()를 사용해 문자 배열 만듦
    - 문자 배열을 정렬해서 결과값을 리스트로 출력