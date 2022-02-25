# 코딩테스트 정리
## 1. 문자열 조작
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