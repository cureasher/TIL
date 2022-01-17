# 코딩테스트 정리
## 1. 문자열 조작
### 1) [유효한 팰린드롬](../code/StringControll/ValidPalindrome.kt)
- 접근방법
    - 대소문자 구분안하므로 문자열 소문자나 대문자로 변환
    - 영문자와 숫자만을 대상으로 확인
    - 구현시 자바와의 차이점
        - 자바는 replaceAll을 써야하지만 kotlin은 toRegex()를 쓰고 replace로 문자열 처리함.
