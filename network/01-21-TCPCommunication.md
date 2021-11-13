## 21-TCP 통신
### 1) TCP 통신 과정
- 3 way hanshake
    - 초기연결
    - TCP는 두 호스트가 통신하기 전 연결을 위한 관계 수립
- 4 way handshake
    - 정상적인 연결 종료
- TCP 타이머
    - Retransmission, Persistence, Time waited, Keepalive
### 2) 흐름 제어(Flow Control )
- 송신과 수신측의 데이터 처리 속도 차이 해결
### 3) 혼잡 제어(Congestion Control)
- 수신측으로 유입되는 트래픽의 양이 정해진 대역폭을 넘어가지 않게 제어