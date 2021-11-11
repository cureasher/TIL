## 19-동적 라우팅-OSPF
### 1) 정의
- 링크 스테이트 라우팅 알고리즘을 사용하는 IGP용 라우팅 프로토콜
- RIPv1의 단점을 보완
- 계층적 구조로 여러개의 Area로 나뉨
### 2) OSPF 메시지
- Hello, DBD, LSR, LSU, LSAck의 5가지로 구성
### 3) OSPF 테이블
- 네이버, DB, 라우팅 테이블로 구성
### 4) 네이버 테이블의 라우터 상태변화
- Down -> Init -> 2way -> Exstart -> Exchange -> Loading -> full 상태로 표현
### 5) 링크 종류
- Point to Point
- Transient
- Stub
- Virtual
### 6) DR과 BDR
- 중복되는 LSA 교환 방지
- LSA(Link State Advertisment)
    - 라우팅 기초 정보가 담겨진 패킷
    - 링크 상태, 인접 관게 형성, 요약 정보
    - 네트워크/링크의 경로 비용 포함한 패킷