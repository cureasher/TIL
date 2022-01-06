## (5) 순환검출(Cycle Detection)
### 1) 문제
연결리스트가 Cycle을 가지는지 판단하는 프로그램
### 2) 풀이
1. 해시테이블
    - 노드 순회
    - 각 노드가 중복되는지 확인
    - 노드가 있는 경우 true
    - 없는 경우 set에 추가
2. Two Pointer
    - head를 slow, fast포인터가 가리킴
    - slow는 한칸 이동
    - fast는 두칸 이동
    - slow와 fast를 비교해 값이 같으면 연결리스트는 순환
    - 값이 다르면 순한이 없는 것