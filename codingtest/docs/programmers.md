# 코딩테스트 정리
## 1. 배열
### 1) [음양 더하기](../code/Array/NegativeAndPostiveNumbers.kt)
- 접근방법
    - 대소문자 구분안하므로 문자열 소문자나 대문자로 변환
    - foldIndexd()함수 사용 -> 인덱스, 합계결과, 숫자를 변수로 사용
    - signs가 true이면 그냥 더해주고 false일 경우 빼주게 코드 작성
### 2) [K번째 수](../code/Array/KNumber.kt)
- 접근방법
    - 정수형 배열을 slice함수로 범위를 지정(명령형 어레이 범위 만큼)
    - slice함수로 자른 리스트를 오름차순 정렬
    - 명령에서 찾는 숫자의 위치 값 반환
    - 반환값을 IntArray 타입으로 변환한 값 출력
### 3) [두개 뽑아서 더하기](../code/Array/TwoNumberSelectSum.kt)
- 접근방법
    - 두개의 반복문으로 풀이
    - withIndex() 함수 -> 리스트를 인덱스별 값으로 변경
    - filter() 함수 -> map으로 바꾸면서 첫번째 값과 두번째 값이 같은지 필터링
    - map 함수로 인덱스가 다른 숫자끼리 값을 더함
    - toSortedSet() 중복된 값 제거하며 오름차순 정렬
### 4) [나누어 떨어지는 숫자 배열](../code/Array/DivisibleNumber.kt)
- 접근방법
    - 슷자 배열을 나눌 숫자로 나누어진 값만 추출
    - 정렬해서 결과리스트 출력
    - 리스트로 변환해 리스트가 비어있는 경우 리스트에 -1 요소 추가
### 5) [제일 작은수 제거하기](../code/Array/MinNumberRemove.kt)
- 접근방법
    - 배열의 길이에 대한 if문으로 푸는 문제
    - 배열의 길이가 1이면 -1출력 1이 아닌 경우 배열에서 가장 작은 수를 제거
    - filter()함수로 최소값과 다른 값만 빼내고 리스트 출력
## 2. 수학
### 1) [약수의 개수와 덧셈](../code/math/MeasureCountAddition.kt)
- 접근방법
    - filter()함수를 통해 약수의 개수를 확인
    - 약수(2로 나누어떨어지는 수)
    - 약수의 개수가 짝수이면 양수, 홀수이면 음수로 숫자 변경
    - map으로 약수 범위의 값들 합계 구함 
### 2) [두 정수 사이의 합](../code/math/TwoRangeSum.kt)
- 접근방법
    - min으로 최소값, max로 최대값 가져옴
    - range함수 -> 최소값부터, 최대값까지 반복하며 합계 반환
### 3) [약수의 합](../code/math/MeasureSum.kt)
- 접근방법
    - 1부터 더하고자 하는 약수 값의 범위로 만듦
    - 필터를 통해 나머지가 0인값은 약수
    - 필터를 통해 나온 약수들의 합을 반환
## 3. 문자열
### 1) [문자열 내 마음대로 정렬하기](../code/StringControll/StringChooseSort.kt)
- 접근방법
    - String타입 배열을 정렬 할때 글자의 위치를 조정
    - 글자의 위치가 같으면 다음 글자를 비교 정렬함
    - sorted() 오름차순 정렬
    - sortedBy() 조건부 오름차순 정렬
### 2) [문자열 내림차순으로 배치하기](../code/StringControll/StringDescending.kt)
- 접근방법
    - toCharArray() : 문자열을 문자 배열로 변환
    - sortedArrayDescending)() : 배열 내림차순
    - 소문자와 대문자 중 소문자가 더 큰 값
    - 내림차순 결과값 반환
### 3) [문자열 다루기 기본](../code/StringControll/StringHandleBasic.kt)
- 접근방법
    - 문자열의 길이가 4이거나 6인지 확인
    - 문자열을 정수로 바꾸며 바꿀 수 없는 것은 null로 변환
    - 문자열이 모두 정수인 경우 True, 아니면 false 반환
### 4) [서울에서 김서방 찾기](../code/StringControll/SeoulKimFind.kt)
- 접근방법
    - 문자열 배열에 Kim이 있는지 찾는 문제
    - indexOf() 문자열 배열에 Kim 인덱스 번호 출력
### 5) [수박수박수박수박수박수?](../code/StringControll/WarterMelonPattern.kt)
- 접근방법
    - CharArray를 수박의 개수를 확인하고 수박의 길이가 짝수이면 짝수만큼 반환하고 홀수인 경우 홀수 반환
### 6) [문자열을 정수로 바꾸기](../code/StringControll/StringToInt.kt)
- 접근방법
    - 문자열을 입력받고 정수로 변환하는 문제
    - toInt()함수로 문자열을 정수로 변환
### 7) [시저암호](../code/StringControll/CaesarCipher.kt)
- 접근방법
    - '..'범위를 통해 알파벳 소문자, 대문자를 설정
    - 문자열을 char로 변환
    - 함수를 통해 문장에 알파벳이 있으면 shift 계산식 수행
    - 26을 나누어 나머지 값을 알파벳에 shift 값을 더 해줌
    - 그 외는 그대로 출력