## 06-물리계층 장비와 케이블
### 1) 물리계층 장비
1. 허브와 리피터
    - 허브 : 전기신호를 증폭하여 포트에 연결된 pc끼리 통신
    - 리피터 : 신호의 세기를 증폭하여 좀 더 먼거리 까지 통신
2. 허브의 동작방식
    - 브로드캐스팅 : 1 -> All
    - 유니캐스팅 : 1 -> 1
    - 멀티캐스팅 : 1 -> n
3. CSMA/CD
- 송신노드 : 데이터전송, 다음채널 에서 데이터 충돌 감지, 충돌 발생시에는 모든 노드에게 충돌 발생을 통지하고 재전송

- Carrier Sense : 데이터를 보내기 전 다른 노드에서 데이터 보내는 중인지 확인
- Multiple Access : 데이터를 보내는 곳이 없다면 전송 시작
- Collision Detection : 동 시간대 데이터를 보놀때 충돌 일어나고 정지, 그 이후 특정 시간 지나면 첫번째 단계로 반복
- Half Duplex: 반이중 전송방식
### 2) 케이블과 커넥터
- 동축(Coaxial), TP(Twisted Pair), 광(Fiber)
### 3) 단위와 성능
- 데이터단위 : bit & Byte
- Kilo, Meg, Giga, Tera 표현

- Bandwidth : 대역폭, 주어진 시간대 네트워크 이동할 수 있는 정보양
- Throughput 처리량, 단위 시간당 데이터 전송 처리양
- CPS: 초당 커넥션 연결수
- CC : 최대 수용가능한 커넥션
- TPS : 초당 트랜잭션 연결수, L7, 주로 HTTP 성능