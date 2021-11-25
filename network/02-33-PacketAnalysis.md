## 33-패킷 분석
### 1) 개요
- 네트워크 패킷 분석 도구
    - Wireshark, Tcpdump가 주로 쓰임
    - 네트워크 구성, 확인 및 장애 관리에 필요
- 레이아웃과 도구 바를 커스텀하게 변경 가능
    - 시간 포맷 및 L2~L4의 name resolve가 가능
- 필터는 IP, Port, Mac 대상으로 연산자 형태로 설정
- 통계 기능으로 L2~L4의 상관관계 & 단말 기준 별 용량, 세션 플로우 및 I/O & RTT 값 확인 가능
- 패킷 분석은 상황을 자세히 파악하고 범위를 narrow하여 구간별 패킷덤프를 통해서 통신 절차 확인
### 2) 분석 사례
1. 기본 설정 확인
2. Ping, Traceroute, Telnet 등으로 IP/Port 정상 여부 확인
    - narrow
3. 구간 별 패킷 덤프 및 이상 유무 확인
4. 프로토콜 통신 절차 이해
    - ARP, DHCP, DNS, HTTP, SSL, BGP, OSPF
5. 와이어샤크 기능으로 분석 진행
    - 컬럼 추가, 컨버세이션, 엔드포인트, TCP Stream, I/O, RTT, Expert Info
6. 실시간 덤프가 어려운 경우
    - 포트미러 또는 TAP 연결