# ex-200
## 001. Hello Kotlin
   1. 메인함수 
        - `메인`(main)함수로 시작
   2. 기본 출력 함수
        - `println()`을 사용해 문자 출력
   3. Unit
        - `반환`하지 않음.

## 002. Expression
   1. 표현식
        - 수학 연산(덧셈, 뺄셈)
        - 연산자 왼쪽부터 계산
        
## 003. Variable
   1. 변수: 값을 저장하는 공간
      - var: 일반 변수 선언에 사용
      - val: 불변 변수
        > 선언된 변수는 값을 저장하면 나중에 값을 수정할 수 없다
   2. 표기법
      - 코틀린은 Carmel Case를 주로 사용
      - `Carmel Case`: 낙타 표기법
        > 첫글자 소문자로 시작, 단어 바뀔 때 첫 글자를 대문자로 표기
        ```kotlin
            anyVariableName
        ```
      - `Pascal Case`: 파스칼 표기법
        > 첫글자 대문자로 시작, 단어의 첫글자를 대문자로 표기
        ```kotlin
           AnyVariableName
        ```
      - `Snake Case`: 뱀 표기법
        > 소문자로 쓰고 단어를 쓰고 단어마다 _(언더바)로 구분해 표기
        ```kotlin
           any_variable_name
        ```
   3. 키워드
      - 코틀린 문법 상 정해 놓은 단어를 키워드로 구분
      - 키워드를 변수명으로 사용하면 안 됨
      - ex) fun, var, val, Int, String ...

## 004. LiteralDataType
   1. `리터럴` 타입
      - 리터럴 : 숫자 값 자체
      - 리터럴의 타입 `생략 가능`
      - 생략하더라도 자동으로 정수면 `정수 타입 적용`
          ```kotlin
              val variable = 10 + 12 - 5
          ```
          ```kotlin
              val variable : Int = 10 + 12 - 5
          ```
        
## 005. ArithmeticOperator
   1.  산술연산자
        - `가감승제`를 수행하는 연산자
        - 사칙연산 법칙을 따름
        
        기호   | 결과   
        :---: | :----: 
        \+     | 더하기
        \-     | 빼기
        \*     | 곱하기
        \/     | 몫
        \%     | 나머지

   2. 타입 변환
       - 정수형을 실수로 변환
         > toDouble()
       - 정수와 소수 계산시 정수에서 실수를 빼도 소수점 소실 됨
         > 피연산자 하나를 실수형으로 선언해주면 소수점 보존됨.
         
## 006. DecrementOperator
   1. 증감연산자
        - 전위 증가 연산자 : ++a
        - 후위 증가 연산자 : a++
        - 전위 감소 연산자 : --a
        - 후위 감소 연산자 : a--
            - 전위는 연산자 사용하기 전에 증가나 감소 진행 
            - 후위는 연산자 사용한 후에 증가나 감소 진행
            
## 007. Bitwise Operator
   1. 비트 연산자
        - 코틀린의 비트 연산자는 기호가 아닌 문자 사용
        - 비트 연산
          > 숫자를 2진수로 변환하여 계산

          > 각 자릿수 별로 비트 연산
              
              [풀이]      
              1111(15)
              0111(7)
              and 연산 : 0111(7)
              
              0101(5)
              0010(2)
              or 연사 : 0111(7)
  
            형태   | 비트연산
            :---: | :----
            and   | 비트가 서로 true일때 만 true
            or    | 비트가 하나라도 true이면 true
            xor   | 비트가 서로 다를 때만 true
            inv() | 비트 단위 반적
            shl   | 왼쪽 쉬프트
            shr   | 오른쪽 쉬프트
            ushr  | 부호 유지한 오른쪽 쉬프트

## 008. IntegerAndRealDataType
   1. 정수타입(용량)
   
        타입이름 | 용량 | 저장 가능 범위
        :---: | ---   |  ---
        Byte  | 1Byte | -128~127
        Short | 2Byte | -32768~32767
        Int   | 4Byte | -2147483648<br>~2147483647
        Long  | 8Byte | -9223372036854775808<br>~9223372036854775807
   2. 실수타입(용량)
        - 부동소수점 방식

        타입이름 | 용량 | 저장 가능 범위
        :---:  | --- |  ---
        Float  | 4Byte | 1.410-45<br>~3.40282351038
        Double | 8Byte| 4.910-324<br>~1.797693134862315710308
   3. 정수리터럴
        - 16진수 : `0X`로 시작
        - 2진수 : `0b`로 시작
        - 8진수 : 지원하지 않음
        
## 009. TrapOfRealNumber
   1. 실수 타입의 함정
        - 0.1f 3번 더하면 0.3이 나옴
        - 0.1f를 10번 더하면 1이 될걸로 예상할 수 있지만 엉뚱한 결과 출력 됨
        - 엉뚱한 값이 나올 수 있음.
        - 0.1f에 10을 곱하면 1.0이 나옴
        - 실수는 항상 대략적인 값만 얻을 수 있음.
        
## 010. CharType
   1. 문자타입
        - 문자를 저장할 수 있는 타입
        - 문자 한개만 저장할 수 있음
        - Char 타입의 크기는 2바이트
        - 문자 1개를 작은따옴표로 감쌈('A')
        - 문자코드 `유니코드` 사용
   2. 유니코드 범위
        - 0~65535
        - 16진수 (0~FFFF)
        
## 011. StringExample
   1. 문자열
        - 문자를 일렬로 나열한 것
        - String : 문자열을 저장할 수 있는 타입
        - 큰따옴표로 문자열을 감쌈
        - 문자열에 + 문자열을 쓰게 되면 문자열의 오른쪽에 문자열을 덧붙임
        - \n 줄바꿈 특수문자
        - []를 사용해 index로 문자 접근 가능

## 012. ExpressionString
   1. 문자열 표현식
        - 문자열 안에 표현식 값 집어넣기
        - 큰따옴표 안에 $뒤에 변수 이름 적으면 변수값으로 대체됨
        - 문법적 설탕 : 사람이 읽고 쓰기 좋게 추가적으로 제공하는 문법

## 013. TypeAlias
   1. 타입 별명
        - 형태
          > typealias 별명 = 타입      
        - 타입 이름이 길때 줄이는 용도로 사용
        
## 014. Comment
   1. 주석
        - 형태
            - 한줄 전체 주석 : `//`
            - 구간 주석 : `/* */`
        - 소스코드에 달아 놓는 메모
        - 코드를 `설명`하는 역할
        - 코드 임시 `비활성화`

## 015. AssignmentOperator
   1. 배정 연산자(`=`)
        - 변수에 값을 저장할 때 사용하는 연산자
        - 배정연산자와 일반연산자(`줄여 쓸 수 있음`)
           > a=a+3 -> a+=3

## 016. Statement
   1. 문장
        - 독립적으로 실행할 수 있는 코드 조각
   2. 문장 구분
        - 변수 선언
        - 변수에 값 대입
        - 출력문
   3. 여러 문장을 한줄로 연결(세미콜론(;)을 사용해 문장 연결)
        ```kotlin
              val num : Int
              num = 15
              println(num + 7 + 3)
              
              val num : Int; num = 15; println(num + 7 + 3)
        ```

## 017. ComparisonOperator
   1. 비교 연산자
        - 두 피연산자를 비교하는 연산자
        - 결과타입 : Boolean 타입 참(true)과 거짓(false)
        - 객체 참조값 비교 : ===, !==

            기호   | 사용 예   | 뜻
            :---: |  :---:  | ---
            ==    |  a == b | 같으면 true, 다르면 false
            !=    |  a != b | a와 b가 다르면 true, 같으면 false
            \>    |  a \> b | a가b보다 크면 true, 그렇지 않으면 false
            <     |  a < b  | a가b보다 작으면 true, 그렇지 않으면 false
            \>=   | a \>= b | a가b보다 크거나 같으면 true, 그렇지 않으면 false
            <=    |  a <= b | a가b보다 작거나 같으면 true, 그렇지 않으면 false

## 018. LogicalOperator
   1. 논리연산자
        - 참과 거짓으로만 계산을 수행하는 연산자

            기호   | 사용 예   | 뜻
            :---: |  :---:  | ---
            &&    | a && b  | a와 b가 모두  true 일때 true 하나라도 false있으면 false
            !     | !a      | a가 true면 결과값은 false, a가 false면 결과값은 true             
           \|\| | a \|\| b | a와 b중 하나라도 true면 true 둘다 false 여야 false
           ```kotlin
               val a2 = 10
               var isTrue = 5 < a < 15 // 잘못된 코드
               val isTrue = 5 < a &&  a < 15 // 동작하는 코드
          ```
          
          `오류`
          > The integer literal does not conform to the expected type Boolean(정수 리터럴이 예상되는 타입은 Boolean 을 따르지 않는다.)
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   > 
## 019. ExIf
   1. 조건문(if)
        - `조건문` Boolean 타입 표현식
        - 블록 : { }
            - 여러개의 문장 담을 때 사용
        - 조건이 참일때만 if문 안의 문장 실행
        - if문에 속한 문장이 하나일때 중괄호 생략 가능
            ```kotlin
                if( a > b) {
                    println(a)
                }
                // 중괄호 생략
                if( a > b)
                    println(a)
            ```               
            
## 020. ExIfElse
   1. If-else
        - else :if문의 조건이 false일때 실행하는 문장
        - if부터 else까지 하나의 문장으로 인식함

## 021. GradeIfElse
   1. if와 else문의 중첩
        - if문 안에 또 다른 is-else문을 넣을수 있음.
        - else 문에 if를 붙여서 축약 가능
        
## 022. IfExpression
   1. if 표현식
        - if와 else문이 모두 갖춰져 있으면 if-else 부분 전체가 표현식이 됨
        - 결과 값이 변수에 저장 됨
        - if 블록과 else 블록은 표현식 타입이 일치해야 함
        - 비어있거나 마지막 문장이 표현식이 아니면 Unit 타입이 된다. 의미 없는 값이 저장됨
        - 코드에서 10은 출력문이 없지만 표현식으로 값이 저장되어 출력 됨
        
## 023. GradeWhen
   1. when문
        - 조건에 따라 문장 실행 여부를 결정하는 키워드
        - 쉼표를 이용해 비교할 값 여러개 지정 가능
        - 조건이 맞으면 문장을 실행하고 빠져 나옴.
        
## 024. GradeWhenExpression
   1. when 표현식
        - 표현식으로 출력문 없이 값 전달 가능
        - when문 문장 안에 조건이 맞으면 결과값 나오게 사용 가능
        
## 025. OneToTenWhile
   1. while문
        - 특정 문장을 반복할 때 사용하는 키워드
        - 조건이 참일 동안 문장 수행
        - 조건이 계속 참일 경우 무한루프에 빠지게

## 026. OneExecutedDoWhile
   1. do-while문
        - 한번은 무조건 실행
        - 문장 마지막에 조건을 검사
        
## 027. OddPrintContinue
   1. continue
        - 반복문의 일부 문장을 무시하고 건너 뜀

## 028. OneToFiveBreak
   1. break
        - 반복문 실행 중 반복문을 빠져나오는 용도
        - 가장 가까운 반복문을 빠져 나갈 수 있음
        
## 029. TenAndFiveLabel
   1. label
        - 중첩된 반복문에서 한번에 나올 때 사용
        - 원하는 결과값을 얻으려면 빠져나와야 하나 계속 증가하므로 오답이 나올 수 있음
        - label을 사용하지 않으면 결과값은 x=21, y=21 나옴

## 030. AddFunction
   1. 함수(function)
        - 명령어를 담는 상자
        - `fun` 키워드
        - 함수 속의 문장이 순차적으로 실행
        - 함수의 반환값과 숫자를 더할 수 있음
    2. 함수 간단히 쓰기
        ```kotlin
              fun DoubleFunction(): Dobule
              {
                  return 3.0 + 7
              }         
              // 문장이 하나일 경우 중괄호와 타입 생략하고 한줄 축약 가
              fun DoubleFunction() = 3.0 +7
      
        ```

## 031. FahrenheitChange
   1. 매개변수와 인수
        -  매개변수
            - 함수를 호출한 곳으로부터 값을 전달받을 때 사용
            - 선언할 때 var, val 키워드 붙이지 않음
            - val로 선언되므로 값 수정 불가
        - 인수
            - 매개변수에 저장되는 표현식
        - 매개변수의 타입과 인수의 타입은 일치야 함

## 032. CelsiusChange
   1. `Unit` 타입
        - 반환 값을 가지지 않는 클래스
        - 생략하면 자동으로 Unit 적용 됨
        

## 033. DefaultArgument
   1. `디폴트 인수`
        - 함수 만들때 매개변수 없으면 입력안하고 호출 가능
        - `함수호출` 인수를 입력해야 됨
        - 매개변수에 디폴트 값 지정 
        - 선언과 동시에 디폴트 값으로 초기화 하면 인수를 지정하지 않아도 됨
        - 매개변수 이름을 직접 지정하면 `인수 위치 변경` 가능
        - 매개변수 입력시 `타입도 같이 지정`해야 함.(지정안할 경우 에러 발생)
        - 오류
            > Mixing named and positioned arguments is not allowed(이름이 지정된 인수와 일반인수 같이 사용 할 수 없음)
        
## 034. VariableArgumentSum
   1. 가변인수
        - `N개의 인수` 받는 함수
        - `vararg` 키워드 사용
        - 일반인수와 같이 사용 가능
        - 아무 인수 지정하지 않을 수 있음(인수 없을 경우 0이 됨)
        - 일반인수와 같이 사용시 일반인수가 오른쪽에 있으면 매개변수 이름 붙여야 함
        - 일반인수와 함께 쓸때 일반인수 먼저 적고 N개의 인수 적으면 호출 가능 
        
## 035. FunctionOverloading
   1. `함수 오버로딩`
        - 이름이 같은 함수를 여러개 선언하는 것
        - 함수이름이 같아도 매개변수가 타입 다르면 사용가능
        - println 함수에 윈도우 `ctrl`, 맥 `command` 버튼 누르고 클릭시 Console.kt에서 오버로딩 메서드 확인 가능
        
## 036. LocalAndGlobalVariable
   1. `지역변수`
        - 블록 안에서 선언된 변수
   2. `전역변수`
        - 함수 밖에서 선언한 변수 
   3. `스코프`
        - 변수가 인식될 수 있는 범위

## 037. OverlapVariable
   1. 중복되는 변수 사용
        - 한 블록 안에선 변수 이름 중복 안됨
        - 지역변수와 전역변수 이름은 중복 가능
        - 가장 가까운 스코프의 변수 인식
        
## 038. OtherFunctionLocalVariable
   1. 다른 함수의 지역변수 사용
        - 다른 함수에 있으면 스코프가 다르므로 중복 가능

## 039. LocalFunction
   1. 지역함수
        - 함수 속에 함수가 있는 것
        - 블록 안에 선언된 함수
        
## 040. MemoryStackArea
   1. 메모리의 스택 영역
        - `스택` : 변수가 생성될 때 생성된 순서대로 쌓임
        - 매개변수들이 생성되고 사라짐 
        - 변수 선언 
        - 앱솔루트 함수 호출
        - 앱솔루트 매개변수 쌓임
        - 메인함수가 끝나면 모든 지역변수가 스택 영역에서 사라     
        - 스택 영역
            - main 함수 시작
            - args 변수 생성
            - first 변수 생성
            - absolute 함수 시작
            - second 변수 생성
            - 조건 확인 후 실행
            - second 변수가 종료
            - absolute 함수 종료
            - result 변수 생성되며 저장된 값 출력
            - main 함수 종료되며 스택 영역에서 모든 지역변수 사라짐
            
## 041-1. MathFunction
   1. 수학함수
        - 최대값
        - 최소값
        - 절대값

## 041-2. MathFunctionUse
   1. 수학함수 사용
        - 같은 폴더에 있는 함수 사용
        
## 042. package 생성
   1. 패키지
        - 소스파일 관리하는 폴더
        
## 043. AnotherPackageUse
   1. 다른 패키지 사용
        - 패키지명 적고 함수 접근 및 사용 가능
        
## 044. ImportUse
   1. 패키지 접근없이 사용가능
        - `import`로 패키지 경로 추가후 패키지 이름없이 접근 가능
        - 패키지 import 후 as 붙이고 이름 변경 가능
        
## 045. PersonObject
   1. `객체`
        - 서로 연관 있는 변수를 묶어놓은 데이터
        - 객체는 각자 고유한 `속성`과 `동작`을 갖고 있음.
   2. example
        - 가방 : 용량, 색상
        - 사람 : 이름, 나이, 말하기(동작)

## 046. HeapAreaAnimal
   1. Heap 영역 : 스택과는 다른 메모리 영역,객체가 만들어지는 공간
        - person 변수가 스택에 생성
        - object 부분이 실행되며 힙영역에 객체 생성
        
   2. 참조변수(Reference Variable) : 객체의 좌표를 저장하는 변수
        - animal 변수 
   3. 참조 값 : 객체의 좌푯값 

## 047. PersonClass
   1. class
        - 객체를 찍어내기 위한 설계도
   2. Java와 Kotlin의 차이
        - Java
            - public 클래스를 선언하면 클래스 이름이 파일이름과 같아야 함.
            - 파일 하나당 한개만 존재할 수 있음
            - 객체를 생성할 때 new 키워드 필요
        - Kotlin
            - 클래스 이름이 파일이름과 같지 않아도 됨
            - 한 파일 내에 여러개의 public 클래스 선언 가능
            - new 키워드 없이 생성자 이름만으로 객체 생성 가능
   3. 인스턴스(Instance)
        - 클래스로부터 생성된 객체
        - 클래스라는 틀로부터 구체적으로 만들어 짐

## 048. ProductHeap
   1. Heap 영역 참조 활용
        - 메인함수 생성
        - 객체 생성되며 변수 선언이 이루어짐(args, product)
        - createProduct 함수 생성
        - apple 변수 생성
        - 힙 영역에 값 apple 변수에 참조
        - 참조변수가 가리키는 객체 프로퍼티에 값을 넣음
        - 참조값 반환하며 함수 종료
        - 힙영역엔 참조값이 저장되어 있음
        - 스택은 지워지지만 힙에는 남아 있음
        - 힙 영역에 생성한 변수는 블록을 빠져나와도 지워지지 않음
        - 객체를 여러 참조 변수에서 공유 형태로 사용 가능(메모리 절약 됨)

## 049. HelloWorldHeap
   1. 문자열 연산시 주의
        - 문자열은 `힙영역에서 생성됨`
        - String 변수는 문자열의 참조값을 저장하기 위한 공간맞 갖고 있음
        - 문자열끼리 '+' 연산시 새로운 문자열이 덧붙는게 아님
        - 힙 영역에 기존 문자열은 남고 함쳐진 문자열 새로 생성
        - 남은 문자열에 다시 접근할 방법 없음(해결법 : `가비지 컬렉션`)
        - 접근할수 없는 메모리가 계속 쌓이면 문제가 됨
        
## 050. GarbageCollection
   1. `가비지 컬렉션`
        - 미아 객체 : 참조변수로 힙영역에 생성되었다가 참조가 끊기게 되면 생기는 객체
        - 미아 객체가 힙에 많이 쌓이면 적당한 시점에 자동으로 가비지 컬렉션 수행함.
        - 미아가 된 객체는 메모리 공간이 부족해지면 가비지 컬렉션 기능에 의해 소멸
   2. `프리징 현상`
        - 가비지 컬렉션이 일어날때 미아객체를 탐색해야하므로 순간적으로 프로그램이 멈추는 현상 일어날 수 있음
        
## 051. TripleEquals
   1. 참조변수
        - `===` : 두 참조 변수가 같은 객체를 가리키는지 조사하는 연산자로 같으면 true, 다르면 false
        - `!==` : 두 참조 변수가 다른 객체를 가리키면 true, 아닌 경우 false
        - `==` : 자바의 equals메서드 호출한것과 같음
        

## 052. Building
   1. `멤버함수`
        - 클래스에 내장된 함수
        - 객체의 동작 역할
   2. `멤버`
        - 프로퍼티, 멤범함수를 간단하게 멤버라고 부름
        
## 053. ThisDuplication
   1. this 사용
        - 클래스 프로퍼티와 멤버함수의 변수가 같을 경우 구별하기 위해 사용
        - `this` 키워드 : 클래스의 프로퍼티 인식
        - 프로퍼티 이름이 중복되지 않을 경우 그냥 호출 가능 
        
## 054. Constructor
   1. `constructor`
        - 생성자
          > 클래스 생성시 자동으로 생성되는 함수          
        - 객체를 초기화 할 수 있음    
        - constructor 키워드 생략 가능
        - 생성자를 정의하지 않으면 매개변수 없는 기본 생성자 자동 생성
   2. `initializer`
        - 초기화
          > 객체의 프로퍼티 값 생
        - 생성자의 매개변수는 init 블록 내부에서 사용
        - 프로퍼티를 선언과 동시에 초기화 안해도 됨
   
## 055. Initializer
   1. init 블록
         - 순서대로 실행 됨
         - 여러개로 나누어 쓸 수 있
 
## 056. PropertyInConstructor
   1. 생성자 프로퍼티
        - 클래스 생성시 매개변수를 바로 초기화
        - 클래스 내용 없는 경우 중괄호 생략 가능
        
## 057. SecondaryConstructor
   1. Constructor
        - `주생성자`: 클래스 이름 옆에오는 생성자(생략 가능)
        - `보조생성자`: 클래스 내부에 오는 생성자, 여러개 올 수 있음
        - this: 클래스에 포함된 또 다른 생성자 호출는 문법
        
## 058. PropertyGetterSetter
   1. `getter`
        - 저장된 값을 읽으려할 때 호출되는 함수
        - 생략해도 디폴트 getter가 있음     
   2. `setter`
        - 값을 저장하려고 할때 호출되는 함수  
        - 생략해도 디폴트 setter가 있음     
   3. `val` 프로퍼티
        - getter만 존재함
        - 초기값이 주어지면 더이상 값을 변경할 수 없음
   
## 059. OperatorOverloading
   1. 연산자 오버로딩
        - 숫자 타입끼리는 연산자 사용 가능
        - 클래스 끼리 연산하려면 오버로딩 필요

## 060. AccessOperator
   1. `접근연산자`('[]')
        - 문자열 다룰 때 사용
        - 객체의 일부 값 출력 가능
        - 객체 값 입력 방법
        ```kotlin
              // 입력방법1
              birthday[0] = "Java"
              // 입력방법2
              birthday.set(0, "Java")
        ```
      
## 061. InvokeOperator
   1. `호출연산자`('()')
        -  : 함수를 호출 할 때 사용하는 연산자
        - invoke : 오버로딩 멤버함수
        - 인수 개수 자유
        - 인수 생략 가능
        
## 062. InOperator 
   1. `in` 연산자
        - 어떤 값이 객체에 포함되어 있는지 조사하는 연산자
        - `in` : 포함하면 true, 포함안하면 false
        - `!in` : 포함안하면 true, 포함하면 false
        - 반환값은 Boolean 형으로 true, false가 출력됨
        - operator fun `contains` 멤버 함수로 오버로딩 가능

## 063. InfixNotation 
   1. 중위표기법
        - 피연산자 연산자 피연산자의 순서로 표현식을 구성하는 방식
        - 매개변수가 하나면 함수호출 중위표기 사용 가능
        - 함수 선언문 앞에 `infix` 붙여야 함
        - `from`멤버함수 : 중위 표기법 호출
        ```kotlin
              val minus = Minus(3, 6) from Minus(1, 1)
              val minus = Minus(3, 6).from(Minus(1, 1)) // 결과동일함
        ```  

## 064. Inheritance
   1. 상속
        - 기존에 존재하는 클래스를 확장해 새로운 클래스 정의하는 기법
        - 기본적으로 상속은 막음
        - 상속을 사용하려면 클래스 앞에 `open` 키워드 붙여야함
        - `슈퍼크래스` : 상속의 대상이 되는 클래스
        - `서브클래스` : 상속하여 확장된 클래스
        - 상속하면 슈퍼클래스의 프로퍼티와 멤버 함수 사용 가능
        - 상속의 깊이는 `제한 없음`
        - 상속은 `하나의 클래스`만 할 수 있음
          
## 065. Upcasting
   1. `캐스팅`(형변환)
        - 특정 타입을 다른 타입으로 변환하는 것
        - 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리킬 수 있음
        - 상속의 용도
            - 클래스 확장보다는 유사한 객체를 하나의 타입으로 받을 수 있게 하기 위해 사용
            - 단순히 클래스 확장이 목표라면 확장함수나 확장 프로퍼티 이용 추천
       - 슈퍼클래스는 항상 슈퍼클래스 자체나 서브클래스 인스턴스만 가리킴
       - error: Unresolved reference: date
       
## 066. FruitOverriding
   1. `오버라이딩`
        - 슈퍼클래스와 서브클래스의 멤버함수가 동일하면 동작을 덮어쓰는 것
        - 오버라이딩 허용하려면 함수 앞에 `open` 키워드 필요
        - 오버라이딩 사용시 함수 앞에 `override` 키워드 필요
        - `super` 키워드 : 슈퍼클래스 이름을 나타냄
        - `final` 키워드 : 더이상 오버라이딩 할수 없게 됨
            > 오버라이딩 하려고 하면 에러 발생 'func' in 'Fruit' is final and cannot be overridden

## 067. OverridingProperty
   1. 프로퍼티 오버라이딩
        - 프로퍼티 앞에 `open` 키워드 필요
        - 사용시 함수 앞에 `override` 키워드 필요
        - 슈퍼클래스에서 val 선언한 프로퍼티를 var로 오버라이딩 가능
        
## 068. Polymorphism
   1. `다형성`
        - 오버라이딩된 멤버함수 호출 : `실제 가리키는` 객체 멤버 함수 호출
        - third 변수가 First 클래스 타입이지만 Second 함수 호출
         
## 069. ObjectExtends
   1. 클래스 상속하는 객체
        - 클래스 없이 object 표현식으로 상속 가능
        - 표현 : object: 슈퍼클래스 이름(생성자 인수)
        
## 070. Anyclass
   1. `Any` 클래스
        - 모든 코틀린 클래스는 Any클래스가 상속
        - 클래스를 상속하지 않아도 자동으로 Any 클래스 상속
   2. Any 클래스 멤버함수
        - `equals()` : 연산자를 오버로딩하는 함수
        - `hasCode()` : 객체 고유의 해시코드를 반환하는 함수
        - `String()` : 객체 내용을 String 타입으로 변환하는 함수

## 071. NumberFormatException
   1. 예외
        - 프로그램 실행 중 예상치 못하게 발생한 상황
        - 예외 발생시 프로그램은 기본적으로 오류 메시지 보여주고 종료됨
        
## 072. ExceptionHandling
   1. 예외처리
        - 예외 발생시 강제 종료를 막을 수 있음.
        - `try` : 예외 발생 가능성 있는 부분
        - `catch` : 예외가 발생할 경우 대신 실행할 코드
        - `finally` : 예외 발생 여부와 상관없이 무조건 실행되는 블록(생략 가능)
        - 여러 종류의 예외 처리하려면 catch 블록 여러번 사용
        
## 073. ThrowException
   1. 예외 던지기
        - 예외를 고의로 발생시키는 것
        - 예외가 던져지면 자신을 호출한 함수에 예외 처리의 책임을 전가시킴
        - 예외 던지는 방법
        ```kotlin
              throw Exception("0으로 나눌 수 없습니다.")
        ```
        - `throw` 키워드 필수가 아니고 옵션

## 074. NothingType
   1. Nothing 타입
        - 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수타입
        - throw Exception() 표현식 Nothing 타입을 갖음
        - 어떠한 타입과도 호환
        - throw를 표현식으로 쓸 수 있기 위한 장치
        
## 075. NullableAndNull
   1. `Nullable`
        - null 값을 지정할 수 있는 변수
   2. `null`
        - 참조 변수가 어떠한 객체가 없음을 나타냄
        - Byte, Short, Int, Long, Float, Double, Char, Boolean 타입 뒤에 ?를 붙이면 그 변수는 참조변수가 됨
        - 코틀린은 Nullabe타입 아니면 null을 지정 못함

## 076. SafeCallOperator
   1. 안전한 호출 연산자(?)
        - Nullable한 참조 변수의 프로퍼티와 멤버 함수에 접근하려면 ?연산자 사용
        - null 값에 안전한 연산자
                
## 077. NotNull
   1. Not-null 단정 연산자(!!)
        - Nullable 타입을 Not-null타입으로 강제 캐스팅
        - null이 있으면 KotlinNullPointerException 예외 발생
        
## 078. ElvisOperator
   1. 엘비스 연산자 (?:)
        - 왼쪽의 피연산자가
            - null이 아니면 그 값을 그대로 사용
            - null이면 우측의 피연산자로 대체됨
        
## 079. SmartCasting
   1. 스마트 캐스팅
        - 특정 조건을 만족하는 경우, 컴파일러는 변수 타입을 다른 타입으로 자동 캐스팅 함 

## 080. isOperator
   1. is 연산자
        - 참조 변수가 실제로 가리키는 객체의 타입 알수 있음
        - java의 instanceof와 비슷
        
## 081. AsOperatorDownCasting
   1. 다운캐스팅
        - 업캐스팅과 반대로 슈퍼클래스 타입을 서브 클래스 타입으로 받는 것
        - as 연산자 : 왼쪽 피연산자를 오른쪽 피연산자로 캐스팅
        - 캐스팅 실패시 `ClassCastException` 발생
        - 예외를 막으려면 as? 연산자 대신 사용
        
## 082. AccessModifier
   1. 접근지정자(가시성지정자) 
        - 코틀린에서 선언 가능한 요소 중 일부 요소에는 접근 권한이라는 것 지정할수 있음
   2. 종류
        - public: 모든 곳에서 접근 가능(생략시 기본 public)
        - internal: 같은 모듈안에서 접근 
        - protected: 클래스 내부와 서브클래스 안에서만 접근 가능
        - private: 프로퍼티와 멤버함수일 경우 해당 클래스 안에서만 접근 가능
             
## 083. Private
   1. private 접근 지정자
        - 같은 파일 내에서만 접근 가능
        - 외부에서 접근시 오류 발생
        - set을 private 지정시 외부에서 값 지정 못함
        
## 084. Protected
   1. protecd 접근 지정자
        - 클래스 내부에서 사용 가능
        - 슈퍼클래스를 상속하면 서브클래스에서 접근 가능
        - 외부에선 접근 불가
        
## 085. Overriding
   1. 오버라이딩
        - protected인 프로퍼티나 멤버 함수의 접근 지정자 public 변경 가능
        - 오버라이딩 가능하게 open 키워드 필요
        - private 프로퍼티, 멤버함수 
            - 접근 불가하므로 오버라이딩 못함
            - open 키워드 지정 못함
            
## 086. StringExtensionFunction
   1. 확장함수
        - 클래스 밖에서 멤버 함수를 추가하는 것
        - 상속없이 클래스 외부에서 멤버 함수 추가 가능
        - 함수이름 앞에 함수를 주입할 클래스를 붙여주면 됨
        - 이미 존재하는 멤버함수와 동일할 경우
            - 오류는 나지 않지만 확장함수가 가려짐
            - 함수 호출시 멤버 함수만 항상 호출 됨 
            
## 087. StringExtensionProperty
   1. 확장프로퍼티
        - 확장함수와 비슷함
        - 함수이름 앞에 함수를 주입할 클래스 : 리시버 타입
        - 함수와 다른점은 프로퍼티이기에 소괄호를 쓰지 않음
        
## 088. ObjectDeclaration
   1. 객체 선언
        - 클래스 선언 형태와 비슷
        - 공유할 수 있는 하나뿐인 객체 필요할 때가 있음
        - 객체는 open 키워드를 붙일 수 없음
   2. 객체 접근 방법
   ```kotlin
        Person.name = "Singleton"
        var person:Person = Person
        println(person.name)
   ```
        
## 089. CompanionObject
   1. `동반자 객체`
        - 클래스 안에 포함되는 `이름 없는 객체`
        - 모든 인스턴스가 공유하는 객체 만들고 싶을때 사용
        - static가 코틀린엔 없지만 같은 효과내려면 동반자 객체 사용
        
## 090. InlineHelloWorld
   1. `inline` 함수
        - 함수 호출문이 함수 속에 들어 있는 문장으로 대체 됨
        - 실행 흐름 점프하지 않고 함수 호출문을 몸체로 대체 함
        - 재귀호출 불가능, 함수 몸체코드가 무한히 늘어날 수 있음

## 091. FooConst
   1. `const`
        - inline함수와 비슷하게 val 변수 앞에 붙이면 접근하는 코드를 변수에 저장된 값으로 대체 시킴
        - `전역변수`, `오브젝트의 프로퍼티` 사용 가능
        - 프로그램 어디서나 접근 가능한 변수
        - 리터럴로 이루어진 표현식만 저장 가능
        
## 092. LateInit
   1. `LateInit`
        - 클래스 안에서 바로 초기화 하지 않음
        - lateinit var 프로퍼티만 붙일 수 있음
        - 나중엔 값 채워줘야 예외 발생하지 않음
        - 값 지정안하고 접근시 
            > UninitializedPropertyAccessException 에러 발생
   2. 초기화
        - 클래스의 프로퍼티는 선언과 동시에 초기화
        - init 블록안에 반드시 초기화

## 093. Nullable
   1. `Nullable`
        - 참조변수에 null이 지정되어 있어도 확장 함수 응용시 함수 호출이 가능하게 함
        - 리시버 타입 `?`(가 Nullable 리시버)
        
## 094. CompanionExtend
   1. `동반자 객체 확장 함수`
        - 동반자 객체는 클래스 이름만 접근 가능
        - 확장함수 선언시 객체 아닌 클래스에 자체 멤버 함수추가되므로 Companion 식별자 필요

## 095. InheritExtension
   1. 확장함수 상속
        - 확장함수 리시버 타입이 상속 관계일 경우 부모 함수 호출
        - 멤버함수는 참조변수가 실제로 가리키는 객체 타입을 따름
        - 참조 변수 타입을 그대로 따름
        
## 096. AbstractClass
   1. `추상클래스`        
        - `abstract` 키워드 사용
        - 클래스 선언 맨 앞에 키워드 붙임
        - 자체로 open 키워드 붙어 있음
        - 일부 멤버의 내용이 비어있는 불완전한 클래스 객체 생성 못함
        - 추상 프로퍼티 : 추상 멤버 함수처럼 프로퍼티 선언문 맨 앞에 abstract키워드 필요
        - 추상클래스를 상속하는 일반클래스는 반드시 멤버함수 오버라이딩 필요
        
## 097. PrintInterface
   1. `인터페이스`
        - `interface` 키워드 사용
        - 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하는 장치
        - 멤버함수, 추상 멤버 함수, 추상 프로퍼티 가질 수 있음
        - 일반 프로퍼티와 생성자는 못 갖음
        - 코틀린의 인터페이스의 멤버함수는 기본구현 가질 수 있음
        - 멤버함수는 내용이 비어있으면 자동으로 abstract가 붙음
        - 생성자가 없으므로 상속할때 이름 옆에 ()를 쓰지 않음
        
## 098. DiamondProblem
   1. `다이아몬드 문제`
        - 인터페이스 `여러개 상속`할 떄 문제 발생할 수 있음
        - 상속을 여러개 받을때 어떤걸 호출할지 애매
        - 코틀린은 어떤걸 호출할지 정할 수 있음
        
## 099. NestedClass
   1. `중첩 클래스`
        - 클래스 안에 또 다른 클래스 선언 가능
        - 타입은 바깥 클래스.중첩 클래스 형태로 만들어짐
        - 생성자 호출시 중첩된 클래스가 출력
        - Outer 클래스와 Nested 클래스는 별개의 클래스(멤버함수 공유 안함)
        
## 100. InnerClass
   1. `내부 클래스`
        - 인스턴스가 바깥 클래스에 완전히 소속됨
        - OuterClass.Inner로 인스턴스에 접근
        - this@OuterClass 키워드 : 바깥 클래스 인스턴스에 접근

## 101. DataClass
   1. `데이터 클래스`
        - `data` 키워드
        - 클래스 앞에 data를 붙임
        - 데이터에 특화된 클래스
        - 적어도 하나의 프로퍼티를 가져야 함
        - 생성자 매개변수에 var, val 같이 써야 함
        - equals, hashCode, toString 멤버함수가 자동으로 오버라이딩 됨
        - abstract, open, sealed, inner 키워드 사용 못함
        
## 102. DestructuringObject
   1. `객체 분해하기`
        - 사용되지 않는 변수는 언더스코어(_)를 쓰면 무시 가능
        - 데이터클래스의 필요한 부분만 추출 가능

## 103. FunctionLiteralLambda
   1. `함수리터럴`
        - 함수를 나타내는 리터럴
   2. `함수타입`
        - 함수를 저장할 수 있는 타입
   3. `람다식`
        - { 매개변수 -> 반환값 }형태

## 104. AnonymousFunction
   1. `익명함수`
        - 함수리터럴을 표현하는 또 다른 방식
        - inline 키워드 사용 못함
        - return으로 반환 값 지정 가능
        - 람다식보다 버그 일으킬 확률이 적음

## 105. ItIdentifier
   1. `it 식별자`
        - 람다식에서 매개변수 하나일 경우 생략 가능
        - 매개변수를 생략하면 it이 매개변수를 대체 함
        
## 106. FunctionReference
   1. `함수참조`
        - 함수 타입의 변수는 이미 선언된 함수나 객체 멤버 함수를 가리킴
        - `Object`, `class`, `fun` 함수 참조
        
## 107. HigherOrderFunction
   1. `고차함수`
        - 인수로 함수를 받거나 함수를 반환하는 함수
        - 함수 호출시 소괄호 써줘야하지만 함수 타입은 소괄호 생략 가능
        
## 108. SituationRememberClosure
   1. `클로저`
        - 함수가 만들어 질때 주변 상을 기억하는 함수

## 109. FunctionLiteralWithReceiver
   1. `리시버 적용된 함수 리터럴`
        - 익명함수 형태로 함수 리터럴 작성 가능
        - `this` 키워드 사용 가능

## 110. GenericDate
   1. `제네릭`
        - 인수를 전달하듯이 함수에 타입을 전달할 수 있음
        - <식별자> 형태로 함수에 타입 적용

## 111. GenericTwoSquared
   1. `제네릭 여러 타입 선언`
        - 타입 매개변수를 여러개 선언 가능
        - <타입1, 타입2> 형식으로 선언
        
## 112. ReifiedTypeParameter
   1. `구체화된 타입 매개변수`
        - 타입 매개변수는 is 연산자의 피연산자로 사용 못함
        - is 연산자 사용하려면 타입 매개변수 앞에 `reified` 선언 필요
        - reified를 붙이려면 `inline`으로 선언해야 함
        
## 113. GenericToClassAndInterface
   1. 클래스와 인터페이스에서 제네릭 사용
        - 클래스나 인터페이스에 타입 인수로 받으려면 선언시 이름 옆에 <식별자> 필요
        - 모든 타입은 Any 클래스를 상속하므로 toString 멤버함수 가지고 있
        
## 114. InheritFromGeneric
   1. 상속을 적용한 제네릭 클래스
        - 제네릭 클래스, 인터페이스는 상속할 때 타입 인수 전달 필요

## 115. GenericSpecificType
   1. 특정 타입을 상속 구현
        - 타입 매개변수로 특정타입을 상속 구현
        - 구현한 인터페이스의 멤버함수 호출 가능
        
## 116. GenericInOut
   1. 타입 업캐스팅
        - Int -> Any
        - `out` 키워드 필요 
   2. 타입 다운캐스팅 
        - Any -> Int
        - `in` 키워드 필요
   3. 모든 타입 캐스팅
        - `*` 키워드 사용
        - 어떤 타입이든 대입 가능
        
## 117. RangeExpression
   1. 연산자 `범위 표현식`
        - `..` : 범위 연산자
   2. 정수 범위
        - 1..10
        - 1.rangeTo(10)
   3. 문자 범위
        - A..Z
        - A.ragneTo('Z')
        
## 118. OneToThreeIterator
   1. `반복자`
        - 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스
        - Iterator: 코틀린의 기본적인 인터페이스
        - 함수
            - next() : 다음 원소가 있으면 반환 후 출력
            - hasNext() : 다음 원소가 있는지 true, falsef로 반환 함
            
## 119. OneToTenForIterator
   1. `for` 
        - 반복문
        - 타입 생략 가능
        - 형태
            for (변수 이름: 타입, in 표현식)

## 120. TenToFortyArray
   1. 배열
        - `array`
            - 변수 선언시 타입 적어줘야 함ㅎㅎ
            - arrayOf()에는 <Int> 생략 가능
            - 괄호 안에 () 값 입력
        - 프로퍼티
            - `size`: 배열의 원소개수
            - `get`: [] 연산자로 접근
            - `iterator()`: 배열을 for문 쓸수 있게 해줌
            
## 121. ArrayToVararg
   1. 배열 가변 인수 출력
        - `가변인수 출력 함수`
            - `vararg`: 가변인자 받을 때 사용하는 키워드 
            - 배열 앞 * 사용시 가변인수 활용 가능

## 122. EnumClass
   1. `열거 클래스`
        - 정해진 집합 내의 값을 표현하는 용도
        - 선언문 앞에 `enum` 키워드 사용
        - `열거 상수` : 열거 클래스에 들어가는 식별자
        
## 123. EnumClassMember
   1. 열거클래스 멤버함수 선언
        - 일반 클래스처럼 매개변수에 프로퍼티 선언
        - 마지막 열거 상수에는 끝에 세미콜론(;)을 붙여야 함
        - 열거 클래스의 프로퍼티, 멤버함수
            - 열거 상수 나열문보다 뒤에 와야 함
        
## 124. EnumClassFunctionProperty
   1. 열거클래스 활용
        - 기본 함수와 프로퍼티
            - name: String
            - ordinal: Int
            - valueOf(value: String)
            - values()

## 125. SealedClass
   1. `sealed` 클래스
        - 자신의 중첩 클래스에만 상속을 허용하는 클래스
        - 1.1 버전 이후 sealed 클래스와 같은 파일에 있는 경우도 상속 가능

## 126. DelegatedProperty
   1. 위임된 프로퍼티
        - `Getter/Setter` 구현을 다른 객체에 맡길수 있음
        - `by` 뒤에 클래스로 위임 클래스에서 Getter/Setter 구현
        
## 127. ClassDelegation
   1. 클래스 위임
        - 인터페이스 구현을 다른 클래스에 맡길 수 있음
        - 인터페이스 구현하면서 뒤에 `by` 객체 지정해 인터페이스 구현을 위임

## 128. DataFairClass
   1. Pair클래스
        - 두개의 변수를 하나로 묶을 수 있음
        - `제네릭`을 이용해 두가지 타입의 값을 보관함
        
## 129. PairToExtendsFunction
   1. `to` 확장 함수
        - 두 값을 Pair로 묶을 수 있음
        - `infix`로 선언 되어 있어 연사자처럼 사용 가능
        
## 130. TripleVariableClass
   1. 세 변수를 하나로 묶는 클래스
        - 제네릭으로 세 가지 타입을 보관
        - 사용하지 않은 값은 `_`로 무시
        
## 131. ComparableInterface
   1. `Comparable Interface`
        - 인터페이스를 이용해 클래스 인스턴스끼리 비교하는 기능
        - 매개변수 T를 받고 연산자 멤버 함수 `comparTo`함수 사용
        
## 132. ClosedRange
   1. 닫힌 구간 표현하는 인터페이스(`CloseRange`)
        - 타입 매개변수로 Comparable<T> 구현 타입만 받음
        - `start`: 최소값
        - `endInclusive`: 최대값
        - `contains`: in연산자 지원
        - `isEmpty`: 비어있는지 확인
        
## 133. IterableInterface
   1. Iterable 인터페이스
        - 클래스가 반복자 지원하도 만들어줌
        - 종류 
            - IntProgression
            - LongProgression
            - CharProgression
## 134. ProgressionAndBuiltInFunction
   1. `프로그래션 관련 함수`
        - 코틀린에 내장된 Progression 타입
        - Progression step은 항상 양수
        - 0, 음수는 예외 발생(IllegalArgumentException)
        - `downTo`: 역순으로 진행하는 Progression
        - `reversed()` : Progression 뒤집는 역할
        - `step` : Progression 진행할 스탭수
        - `until`: 시작, 끝으로 진행하는 함수(1 감소해서 나옴)

## 135. CollectionListSetMap
   1. `listOf`
        - List 객체
        - 순서가 있는 목록을 표현하는 자료구조
        - 동적 배열, 연결리스트
   2. `setOf` 
        - Set 객체
        - 집합을 표현하는 자료구조됨
        - 원소 중복 허용안함
        - 순서가 없음
   3. `mapOf` 
        - 연관배열을 표현하는 자료구조
        - 키와 값을 1:1 대응 시켜 저장
        - 중복 안됨
   
## 136. CollectionInterfacePropertyMember
   1. Collection 인터페이스
        - 추상 프로퍼티
            - size
                > 컬렉션 원소의 개수를 갖는 프로퍼티
        - 멤버함수
            - isEmpty()
                > 비어있는지 여부를 반환함
            - contains()
                > 원소가 컬렉션에 포함되어 있는지 여부 반환 
            - containsAll()
                > 원소들이 컬렉션에 모두 포함되어 있는지 여부 반환

## 137. ListInterfaceAndMember
   1. List 인터페이스
        - 추상 멤버함수
            - `get()`
                > List의 index 번째 원소 반환
            - `indexOf()`
                > List의 몇번째 인덱스에 위치해있는지 반환 
            - `lastIndexOf()`
                > 마지막으로 일치하는 원소의 인덱스 반환
            - `listIterator()`
                > List에 특화된 Iterator를 반환
            - `subList()`
                > 구간의 원소를 뽑아 새로운 List를 만들어 반환

## 138. ListIterator
   1. ListIterator
        - `hasPrevious()`
            > 이전 원소가 존재하는지 여부 반환
        - `previous()`
            > 이전 원소를 반환하고 ListIterator 커서를 뒤로 한칸 옮김
        - `nextIndex()`
            > 다음 원소의 인덱스를 반환. 커서를 옮기진 않음
        - `previousIndex()`
            > 이전 원소의 인덱스를 반환. 커서를 옮기진 않음 

## 139. MapInterface
   1. Map
        - `Entry`
            - 키와 값 한쌍을 표현하는 중첩 인터페이스
        - `size`
            - Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티
        - `keys`
            - Map의 키들만 갖는 프로퍼티(중복안됨. Set타입)
        - `values`
            - Map의 값들만 갖는 프로퍼티(값은 중복 가능, Collection타입)
        - `entries`
            - Map에 들어있는 모든 키와 값 쌍을 갖는 프로퍼티
        - `isEmpty`
            - Map이 비어있는지 여부 반환
        - `containsKey`
            - Map에 key에 해당하는 키가 들어있는지 여부 반환
        - `containsValue`
            - Map에 value에 해당하는 값이 들어있는 여부 반환
        - `get`
            - key에 해당하는 값을 반환하는 연산자, key에 해당하는 값 없으면 null 반환
        - `getOrDefault`
            - key에 해당하는 값을 반환하되 없으면 defaultValue 대신 반환

## 140. MutableCollection
   1. `MutableCollection`
        - 컬렉션에 값을 추가하거나 삭제할 수 있음
        - 컬렉션을 반드시 수정해야할 상황이 아니면 Mutable이 아닌 일반 Collection 쓸것을 권장 
        
   2. MutableCollection 인터페이스
        - Collections, MutableIterator 인터페이스 상속 
        - 멤버
            - `add()`
                > 컬렉션에 elements 원소 추
            - `addAll()`
                > elements 컬렉션의 모든 원소를 컬렉션에 추가
            - `remove()`
                > 컬렉션의 element와 일치하는 원소 하나 제거 
            - `removeAll()`
                > 컬렉션의 element와 일치하는 모든 원소 제거 
            - `retainAll()`
                > elements 컬렉션의 원소와 일치하는 원소만 남기고 남은 원소 제거
            - `clear()`
                > 컬렉션 모든 원소 삭제           

## 141. MutableIterator
   1. MutableIterator 인터페이스 
        - 멤버
            - `remove()`
                > 커서가 가리키고 있는 원소 삭제  

## 142. MutableListInterface
   1. MutableList 인터페이스
        - 멤버
            - `add()`
                > index 위치에 element 추가
            - `addAll()`
                > index 위치에 elements 컬렉션에 있는 모든 원소 추가 
            - `set()`
                > index 위치의 원소를 element로 교체
            - `removeAt()`
                > index번째 원소를 삭제

## 143. MutableListIterator
   1. MutableListIterator
        - 멤버
            - `set()`
                > 커서가 가리키는 위치의 원소를 element로 교체
            - `add()`
                > 커서가 가리키는 위치 element 추가

## 144. MutableSetInterface
   1. `MutableSet`
        - 수정이 가능한 `Set`
        - `set.add()`
            - 이미 존재하는 경우 추가되지 않고 `false` 반환
        - `set.addAll()`
            - 2개 element를 추가할 경우 추가된 원소가 1개라도 있으면 `true` 반환
        - set은 원소의 `순서를 가지지 않음`

## 145. MutableMapInterface
   1. `MutableMap`
        - 수정이 가능한 `Map`
        - 멤버
            - `put()`
                - MutableMap에 키와 값 한쌍을 추가하고 null반환
                - key와 동일한 key가 있는 경우 값만 교체하고 이전 값 반환
            - `remove()`
                - key와 연결된 값 삭제
                - 연관된 경우 삭제된 값 반환
                - 연관된 값 없는 경우 null 반환
            - `putAll()`
                - from에 있는 모든 키와 값 쌍을 추가
                - 키가 존재하는 경우 값만 변경
            - `clear()`
                - 모든 키와 값 쌍 삭제
                
## 146. SequenceInterface
   1. `Sequence`
        - List처럼 일련의 데이터를 표현하는 인터페이스
        - 각 데이터를 게으르게 계산, 잠재적으로 무한대의 데이터를 다룰 수 있음
        - 크기가 정해져 있지 않음
        - `size`, `length` 프로퍼티 없음
        - itrator 연산 가능
        
## 147. CollectionMap
   1. `CollectionMap`
        - `map`
            - 타입의 변환 함수를 인수로 받음(ex-Int-> Char))
        - `mapIndexd`
            - 변환 함수에 index 매개변수 추가한 것
        - `IntRange`
            - 선언과 동시에 초기화
        - `mapNotNull`
            - 변환 함수가 null인경우 결과에서 제외

## 148. CollectionFilter
   1. CollectionFilter
        - Collection에서 원하는 원소만 걸러내는 방법
        - 멤버
            - `filter`
                - 함수에 true인 값만 반환
            - `filterNot`
                - 함수가 false인 값만 반환
            - `filterNotNull`
                - null이 아닌 원소만 반환
            - `filterIndexed`
                - index 매개변수를 추가한 것 조건에 맞는 값 반환
            - `filterIsInstance`
                - 지정한 타입에 맞는 원소만 반환
                
## 149. CollectionSort
   1. CollectionSort
        - 내장된 확장 함수를 이용해 정렬할 수 있음
        - `sorted()`
            - 오름차순 정렬
        - `sortedDescending()`
            - 내림차순 정렬

## 150. CharSequence
   1. CharSequenceInterface
        - String, StringBuilder 등 문자열과 관련된 클래스들이 구현하는 기본적인 뼈대 인터페이스 
        - 멤버
            - `length()`
                - 문자열의 길이, 문자의 개수를 알 수 있음 
            - `get()`
                - 문자열의 문자 하나를 []연산자로 접근할 때 사용
            - `subSequence()`
                - 구간의 문자열을 뽑아 새 문자열을 반환
                
## 151. CharSequencePrefixSuffix
   1. CharSequence 확장함수 
        - 멤버
            - `startsWith()`
                - 문자열이 지정한 prefix로 시작하면 true, 아니면 false 반환
            - `endsWith()`
                - 문자열이 지정한 suffix로 끝나면 true, 아니면 false 반환 
            - `removePrefix()`
                - 문자열이 지정한 Prefix로 시작하는 문자열 잘라내고 반환 
            - `removeSuffix()`
                - 문자열이 지정한 Suffix로 끝나는 문자열 잘라내고 반환 
            - `removeSurriounding()`
                - prefix로 시작하고 suffix로 끝나는 문자열 반환

## 152. CharSequenceEmpty
   1. CharSequence 비어있는지 확인
        - 비어있는지 검사하는 확장 함수
            - `isEmpty()`
                - 문자열이 비어 있는 여부 반환
            - `isBlnank()`
                - 문자열이 비어 있거나 공백 문자로 이루어져 있는지 여부 반환
            - `isNullOrEmpty()`
                - 문자열이 null이거나 비어 있는지 여부 반환
            - `isNullOfBlank()`
                - 문자열이 null이거나 공백 문자로 이루어져 있는지 여부 반

## 153. CharSequenceProcess
   1. CharSequence 가공
        - 가공하는 확장 함수
            - `removeRange()`
                - 지정한 범위의 문자들을 제거한 문자열 반환
            - `padStart()`
                - 문자열 길이를 늘린뒤 앞부분의 빈 공간을 padChar로 채운 문자열 반환
            - `padEnd()`
                - 문자열 길이를 늘린뒤 뒷부분의 빈 공간을 padChar로 채운 문자열 반환
            - `trimStart()`
                - 문자열 앞부분의 공백문자를 없앤 문자열 반환
            - `trimEnd()`
                - 문자열 앞부분의 공백문자를 없앤 문자열 반환
            - `trim()`
                - 문자열 앞뒤의 공백문자를 없앤 문자열 반환
            - `slice()`, `subSequence()`
                - 문자열 범위를 잘라낸 뒤 반환
            - `reversed()`
                - 문자들을 거꾸로 뒤집은 문자열 반환
                
## 154. CharSequenceSplit
   1. CharSequenceSplit 함수
        - 문자열을 여러 조각으로 쪼개는 확장 함수
            - `lines()`
                - 개행문자 \\n을 기준으로 문자열을 쪼개 List<String> 타입으로 반환
            - `lineSequence()`
                - 개행문자 \\n을 기준으로 문자열을 쪼개 Sequence<String> 타입으로 반환
            - `split()`
                - 문자열 쪼갤 구분자(delimiters)로 최대 몇조각(limit) 쪼갤지 지정
                
## 155. StringClassMember
   1. String 클래스
        - String 클래스는 + 연산이 가능하다는 점 빼고는 CharSequence와 거의 기능이 동일함
            - `plus()`
                - String끼리 + 연산자 사용 가능
        - 비교 연산자
            - 연산 문자열의 길이로 비교
            - 길이가 같을 경우 첫 글자부터 `유니코드` 순서로 비교

## 156. AdageStringReplace
   1. StringReplace
        - 문자열 찾아바꾸기
        - 멤버
            - `replace()`
                - 문자열을 교체하는 함수
                - `ignoreCase`: 대소문자 무시 옵션 
            - `replaceFirst()`
                - oldValue 첫번째 문자열을 newValue로 교체 
            - `replaceRange()`
                - 지정한 범위 문자열을 `replacement`로 교체

## 157. StringBuilderClass
   1. StringBuilder
        - 문자열을 추가할 때 String처럼 문자열을 매번 생성하지 않고 기존 문자열에 덧붙이는 동작
        - 멤버
            - `append()`
                - StringBuilder 자기 자신을 반환, 연쇄적 호출 가능
            - `toString()`
                - StringBuilder에 완성된 최종 문자열 얻을 수 있음
                
## 158. RegexClass
   1. Regx
        - 코틀린 정규식 클래스
        - 멤버
            - `constructor()`
                - 정규식 패턴 담긴 문자열 받는 생성자
            - `matches()`
                - input이 정규식에 매칭되는지 여부 반환
            - `replace()`
                - input중 정규식에 매칭되는 부분 replacement로 치환

## 159. ToListExtendFunction
   1. `toList`
        - 여러가지 타입을 List 타입으로 변환하는 확장 함수
        - Pair, Triple, Iterable 외 수많은 타입을 리시버로 함
        
## 160. RunExtendFunction
   1. `run` 함수
        - 모든 타입에 적용할 수 있음
        - 중복되는 표현식을 하나로 묶을 수 있음
        - `this`
            - 값을 가리킴
            
## 161. LetExtendFunction
   1. `let` 함수
        - 중복되는 표현식을 하나로 묶을 수 있음
        - run과 매개변수 타입만 다르고 유사함

## 162. WithExtendFunction
   1. `with` 함수
        - run과 let에 비해 이해하고 쉬움
        - 중복되는 표현식을 하나로 묶을 수 있음
        - 매개변수 자리에 표현식을 바로 넣어 호출
        
## 163. ApplyExtendFunction
   1. `apply` 함수
        - 객체 생성과 객체 초기화 코드를 표현식 한개로 묶음
        - 리시버를 그대로 반환

## 164. AlsoExtendFunction
   1. `also` 함수
        - 객체 생성과 객체 초기화 코드를 표현식 한개로 묶음
        - apply와 매개변수 타입만 다르고 동일한 역할 수행

## 165. LazyFunction
   1. `lazy` 함수
        - 게으른 초기화
        - 프로퍼티의 값을 필요한 시점에 계산할 수 있음

## 166. BigIntegerClass
   1. `BigInteger`
        - Long의 표현 범위를 뛰어넘는 큰 정수를 다룰때 사용
        - 자바 표준 라이브러리에 속함
        - 멤버
            - `plus()` : 더하기
            - `minus()` : 빼기
            - `times()` : 곱하기
            - `div()` : 몫
            - `rem()` : 나머지
            
## 167. BigDecimalClass
   1. `BigDecimal`
        - Double의 표현 범위를 뛰어넘는 매우 작은 실수를 다룰때 사용
        - 자바 표준 라이브러리에 속함
        - 소수점 자리가 아무리 길어도 실수값을 정확하게 표현할 수 있음
        - 실수타입의 고질적인 오차 문제 해결
        
## 168. MaxMinFunction
   1. `max()`
        - 최대값 함수
        - 두 수의 최대값 반환
   2. `min()`
        - 최소값 함수
        - 두 수의 최소값 반환
        
## 169. CeilFloorRoundFunction
   1. `ceil()`
        - 실수값을 올림하는 함수
   2. `floor()`
        - 실수값을 내림하는 함수
   3. `round()`
        - 실수값을 반올림하는 함수
   4. `roundToInt()`
        - 실수값을 Int타입으로 반올림하는 함수
   5. `roundToLong()`
        - 실수값을 Long타입으로 반올림하는 함수

## 170. ABSFunction
   1. `abs()`
        - `절대값`을 구하는 함수

## 171. MathematicalConstant
   1. `kotlin.math`
        - 코틀린에 내장된 수학 패키지
        - 상수
            - `PI`
                - 원주율: 3.141592653589793
            - `E`
                - 자연상수 값: 2.718281828459045
                
## 172. HypotFunction
   1. `hypot` 함수
        - hypotenuse(빗변)의 약자
        - 빗변의 길이를 구하는데 사용
                
## 173. ExponentialFunction
   1. 지수함수
        - `sqrt()`
            - squar root(제곱근)의 약자 루트x 반환
        - `pow()`
            - 리시버의 x 제곱을 반환하는 확장함
            - infix 선언되어 있지 않아 연산자처럼 사용 못함
        - `exp()`
            - e^x값 반환
        - `expm1()`
            - e^x -1 값 반환

## 174. LogarithmicFunction
   1. 로그함수
        - 로그 계산을 위한 함수
            - `log()`
                - log_base x
            - `log2()`
                - log_2 x
            - `log10()`
                - log_10 x
            - `in()`
                - log_e x
            - `in1p()`
                - log_e (x+1)
                
## 175. TrigonometricFunction
   1. 삼각함수
        - 삼각비 계산을 위한 함수
        - 함수
            - `sin()`
            - `cos()`
            - `tan()`
            - `asin()`
            - `acos()`
            - `atan()`
            - `sinh()`
            - `cosh()`
            - `tanh()`
            - `asinh()`
            - `acosh()`
            - `atanh()`
        
## 176. RealNumberToBinary
   1. `toBits()`, `toRawBits()`
        - 실수 값의 이진수 배열 형태를 알아낼 수 있음
        
## 177. BinaryToRealNumber
   1. `fromBits()`
        - 이진수 값을 실수값을 만들수 있음
        
## 178. NullableToString
   1. Nullable
        - `Any?.toString()`
            - null인 표현식도 호출가능해짐

## 179. NullStringPlus
   1. `String?.plus`
        - null 타입인 표현식에 `+` 연산자 사용 가능

## 180. VerifyRealNumber
   1. ValueVerify
        - 특수 값
            - Nan(Not a Number): 숫자가 아닌 값
            - Infinite : 무한
        - 함수
            - `isNan()`
                - 리시버에 들어 있는 값이 NaN이면 true, 아니면 false
            - `isInfinite()`
                - 리시버에 들어 있는 값이 Infinity이면 true, 아니면 false
            - `isFinite()`
                - 리시버에 들어 있는 값이 정상이면 true, 아니면 false
            
## 181. VerifyValue
   1. Argument 검증
        - `checkNotNull()`
            - 인수 값이 null이면 IllegalStateException 예외, null이 아니면 Non-null 타입으로 캐스팅하여 그대로 반환
        - `check()`
            - 인수 값이 false면 IllegalStateException 예외
        - `requireNotNull()`
            - 인수 값이 null면 IllegalArgumentException 예외, null이 아니면 Non-null 타입으로 캐스팅하여 그대로 반환
        - `require()`
            - 인수 값이 false면 IllegalArgumentException 예외
            
## 182. UsingVersion
   1. UsingVersion
        - `KotlinVersion.CURRENT`
            - 코틀린 버전을 가진 객체
        - `isAtLeast()`
            - 특정버전 이상인지 확인
            
## 183. ExitProcessFunction
   1. `exitProcess`
        - 프로그램을 종료하는 함수
        - kotlin.system 선언된 함수 : import 해줘야 함 
        - 반환 타입은 Nothing 
        - 0이 전달되면 정상 종료, 0이 아닌수 전달시 비정상 종료 

## 184. MeasureTimeMillis
   1. `measureTimeMillis()`
        - 함수 끝나기까지 경과한 시간을 밀리 초 단위로 반환
   2. `measureNanoTime()`
        - 함수 끝나기까지 경과한 시간을 나노 초 단위로 반환


## 185. FileInputOutput
   1. File
        - 자바 표준 라이브러리에 의존
        - JVM에 의존성이 생김
        - 멤버
            - `exists()`
                - 해당경로에 파일이 존재하는지 여부 반환
            - `readText()`
                - 파일에 남아 있는 데이터를 모두 텍스트 형태로 읽어들인 뒤 반환

## 186. FileTreeWalkClass
   1. `FileTreeWalk`
        - 쉽게 특정 디렉토리의 하위 파일 및 하위 디렉토리들을 순회할 수 있음
        - 파일 순회 방향을 나타내는 열거 클래
        - 멤버
            - `walk()`
                - FileTreeWalk 인스턴스를 얻는 확장함수
            - `maxDepth()`
                - 탐색할 하위 디렉토리의 최대 깊이
            - `onEnter()`
                - 새로운 디렉토리로 들어왔을 때 호출될 함수 지

## 187. ThreadFunction
   1. thread
        - JVM의 스레드를 생성
        - kotlin.concurrent 패키지 import 필요
        - sleep함수 : 자바에 내장된 함수, 지정한 밀리초만큼 대기
        - 매개변수
            - `start` : true를 넘기면 스레드 생성과 동시에 바로 실행
            - `isDaemon` : 데몬 스레드로 만들것인지 여부 지정
            - `contextClassLoader` : 스레드에서 사용할 클래스 로더 지정
            - `name` : 스레드의 이름 지정
            - `priority` : 스레드의 우선순위 지정(1~10사이으 ㅣ정수)
            - `block` : 스레드에서 실행할 함수 지정

## 188. TimerFunction
   1. timer
        - 일정한 주기마다 특정함수를 호출할 수 있음
        - 매개변수
            - `name` : 타이머 이름 지정
            - `daemon` : 데몬 스레드로 만들 것인지 여부 지정
            - `initialDelay` : 초기 지연 시간을 밀리 초 단위로 설정
            - `period` : 주기를 밀리초 단위로 설정 
            - `action` : 매 주기마다 실행할 함수 지정

## 189. SynchronizedFunction
   1. `synchronized`
        - 스레드 동기화 함수
        - lock: 동시 수정으로부터 보호할 객체
        - block: lock 객체를 점유하는 동안 실행할 함수
        
## 190. JavaToKotlinTypes
   1. 자바 참조 타입
        - java double타입 : kotlin Double 타입으로 변환 됨
        - StringBuffer의 append메서드
            - java.lang.String 타입 인수를 받지만 kotlin.String 타입으로 변환 됨
        - StringBuffer의 toString 메서드
            - java.lang.String 타입 값 반환하지만 코틀린에서 호출시 kotlin.String 타입으로 변환 됨

## 191. JavaToKotlinNullSafety
   1. Null 안전성
        - 타입 이름 뒤에 느낌표를 붙임
        - 자바의 참조 타입을 코틀린으러 불러올시 타입이름에 느낌표를 붙임
        - 자바의 참조타입은 null을 허용하기 때문
        
## 192. JavaToKotlinKeywordConflict
   1. 키워드 충돌
        - 자바의 식별자가 코틀린 키워드가 되어 있는 경우도 있음
        - 자바 System 클래스 in 정적 필드
            - 코틀린 in 키워드 존재함
            - 사용하려면 ``으로 감싸줘야함

## 193. JavaToKotlinSamConversion
   1. `SAM` 변환
        - Single Abstract Method
        - 단일 추상메서드
        - 메서드를 한개만 갖고 있는 인터페이스
        - 함수 리터럴을 특정 인터페이스로 변환하는 것
        - `Runnable`
        - `Comparable`

## 194. JavaToKotlinGetterSetter
   1. 자바 클래스 접근
        - 자바 get, set으로 시작하는 메서드
        - 코틀린에서 프로퍼티로 접근

## 195. JavaToKotlinOperatorOverloading
   1. 연산자 오버로딩
        - 자바 메서드 중 연산자를 오버로딩하는 메서드가 있으면 코틀린의 연산자로 접근 가능

## 196. JavaToKotlinClassReference
   1. 클래스 참조
        - 코틀린 클래스 인스터로부터 Class<T>타입의 값 얻는 방법
        - `printClassInfo` : 클래스 타입 정보
        - 코틀린 클래스 타입 정보 확인 가능
        
## 197. KotlinToJavaPackageLevel
   1. 패키지 레벨 변수
        - 패키지 레벨의 변수, 함수, 확장함수 선언
        - Getter와 Setter를 통해 접근
        - `extension()` : 코틀린 확장함수 사용
        - `@file:JvmName` : 클래스 이름 별명으로 사용
 
## 198. KotlinToJavaProperty
   1. 프로퍼티 접근
        - `getNum()` : 코틀린 Get프로퍼티 접근
        - `setNum()` : 코틀린 Set프로퍼티 접근
        
## 199. KotlinToJavaObject
   1. 선언된 객체
        - `object`
            - 자바에서 일반적인 클래스로 인식
            - INSTANCE라는 이름의 static 필드 자동으로 갖음
            - 코틀린 객체의 프로퍼티와 멤버 함수에 접근 가능
            - @JvmStatic : INSTANCE 필드 없이 접근 가능
            
## 200. KotlinToJavaCompanionObject
   1. 동반자 객체
        - `companion object`
            - 자바에서 Companion이라는 static 필드를 갖음
            