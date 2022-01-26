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
### 6) [가장 긴 팰린드롬 부분 문자열](../code/StringControll/LongestPalindrome.kt)
- 접근방법
    - words.indices == 0 until words.length
    - bb일경우에도 팰린드롬이므로 아닌 경우 break로 나가게 조건문 설정
    - slice함수 : 슬라이싱으로 시작부터 끝까지 문자열 자르기
    - first는 1개씩 앞으로가고 last는 뒤로가는 형태로 확장
## 2. 배열
### 1) [두수의 합](../code/Array/TwoSum.kt)
- 접근방법
    - 정수형 배열 입력
    - 인덱스 있는 배열 선언 withIndex()함수 사용
    - 타겟에서 첫번째 값을 뺀 값을 타겟 체크 변수에 저장
    - containsKey()함수로 map에 타겟 체크 변수의 값이 있는지 확인
    - 타겟 체크 값이 있으면 출력
### 2) [빗물 트래핑](../code/Array/TrappingRainWater.kt)
- 접근방법
    - 왼쪽이 오른쪽보다 크면 진행
    - 오른쪽은 리스트의 사이즈의 1뺀 값
    - 투 포인터를 최대로 이동하는 형태
    - 왼쪽 최대값, 오른쪽 최대값 값을 구한다
    - 왼쪽 최대값과 오른쪽 최대간을 비교
    - 오른쪽 최대값이 크면 왼쪽 최대값에서 왼쪽 높이를 뺀다
    - 왼쪽 최대값이 크면 오른쪽 최대값에서 오른쪽 높이를 뺀다.
    - 반복문 나오면 저장된 용량 출력
### 3) [세 수의 합](../code/Array/ThreeSum.kt)
- 접근방법
    - 왼쪽과 오른쪽 투포인터로 확인
    - 3가지 수의 합이 0이면 
    - while문으로 왼쪽값과 오른쪽값이 작은 동안 비교하며 합을 비교
    - when문으로 sum이 0일때와 0보다 작을 때, 클때를 분기
### 4) [배열 파티션1](../code/Array/ArrayPairSum.kt)
- 접근방법
    - sorted() 함수로 정렬을 해준다.(sort()함수는 windowed함수 사용 못 함)
    - windowed 함수로 size가 2인 함수로 2개씩 map으로 묶음
    - 나눈 배열에서 Math.min 함수로 최소값을 구하고 sum함수로 합계를 출력