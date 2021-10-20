# (2) 파이썬에서 문자열 사용법
## 1) 문자열 생성
- 큰 따옴표, 작은 따옴표로 묶인 문자열을 변수에 삽입
## 2) 문자열 변수 접근
- hello = "python"
- hello[0]
- p
- 슬라이스 연산
- hello[2:]
- thon
## 3) 문자열 메서드
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
## 4) 문자열 포맷
- f-string 포맷
    - 중괄호 안에서 함수 호출, 연산 가능
    - 문자열 선언할 때 f가 따옴표 앞에 위치
    - 사용법
        ```python
        in_greeting = "say Hello"
        out_greeting = "say Goob Buy"
        print(f"James: {in_greeting}\nMerry: {out_greeting}")
        ```
- %-포맷
    - %연산 지원
    - %연산으로 변수의 값 표현
    - C언어의 printf와 비슷함
    - 변수의 타입을 알아야 함
    - 사용법
        ```python
        in_greeting = "say Hello"
        out_greeting = "say Goob Buy"
        print("James: %s\nMerry: %s"%(in_greeting, out_greeting))
        ```
- str.format()
    - str 클래스의 format 메서드 이용
    - 변수의 타입을 고려하지 않아도 변수를 잘 출력해 줌
    - 사용법
        ```python
        in_greeting = "say Hello"
        out_greeting = "say Goob Buy"
        print("James: {}\nMerry: {}".format(in_greeting, out_greeting))
        ```
- pritn 결과
    - James: say Hello
    - Merry: say Goob Buy