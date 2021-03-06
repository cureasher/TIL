## 42-네트워크 보안장비 및 특성, 네트워크 망분리
### 1) 주요 네트워크 보안 장비
- F/W
    - 네트워크 구간을 신뢰할 수 있는 영역과 신뢰할 수 없는 영역으로 구분
    - 일반적으로 접근 금지 정책 권장
        - 외부에서 내부 네트워크로 접근 금지
        - 허용된 경우만 내부로 접근 허용
        - 보안성 향상
    - 기능
        - 내부에서 악의적 활동이나 승인 받은 서비스는 방어 불가능
    - 3가지 동작방식
        - 패킷 필터링 방식
            - 패킷의 헤더정보 검사
        - 상태기반검사
            - 세션 단위 검사
        - 애플리케이션 방식
            - 프록시 방식
- IDS/IPS
    - IDS 침입탐지시스템
        - 시스템에 원하지 않는 조작을 탐지하여 경고하는 시스템
        - 방화벽 기능 보완
        - 모든 패킷이 지나가는 경로에 설치
    - IPS 침입방지(예방)시스템
        - IDS의 탐지 기능을 포함한 차단기능까지 수행

|구분|방화벽(침입차단)|IDS(침입탐지)|IPS(침입방지)|
|:---:|:---:|:---:|:---:|
|패킷차단|O|X|O|
|패킷 내용 분석|X|O|O|
|이상/오용 탐지|X|O|O|
|이상/오용 차단|X|X|O|
- VPN
    - 공용망을 마치 전용선처럼 이용하기 위해 사용하는 기술
    - 전송되는 데이터에 대한 암호화 및 인증 등의 보안 기능 제공
    - 터널링
        - 인터넷을 사적이고 안전한 네트워크 일부로 사용하게 하는 기술
    - 캡슐화
        -  터널 장비를 지날때 원래 패킷 정보를 그대로 전송하는 기술
- DDoS Mitigation
    - Distributed Denial of Service 분산서비스거부 공격
    - DDoS 공격에 대한 탐지하고, 공격 트래픽 필터링 및 정상 트래픽 보장하기 위한 보안 시스템
    - 방화벽 앞에 설치
- UTM
    - Unified Threat Management
    - 하나의 네트워크 장비에 방화벽, VPM, IPS, IDS, DDoS Mitigation 등의 다양한 보안기능 제공하는 보안 시스템 
- WAF
    - Web Application Firewall
        - 웹 서버의 취약점을 악용한 네트워크 공격을 탐지 및 차단하는 보안 시스템
        - SQL 인젝션, XSS 등 다양한 웹 취약점 공격에 대한 방어
        - 웹서버 앞에 설치
- NAC
    - Network Access Control 네트워크 접근제어
    - 내부망에서 발생하는 문제 탐지하기 위한 장비
    - 인가되지 않은 사용자 및 PC 접근제어
    - 접속한 사용자 이상행위 탐지 및 접속 차단
### 2) 네트워크 망분리
- 외부 인터넷 망을 법률적인 접근과 내부 정보 유출 차단
- 업무망과 외부 인터넷망을 분리하는 망 차단조치
- 공공기관
    - 국가정보보안 기본지침
- 금융기관
    - 전자금융감독규정
- 민간(일반기업)
    - 정보통신망법 근거
- 망분리 방식
    - 물리적 망분리
        - 물리적 별도의 네트워크 회선 및 PC사용
        - 업무망과 외부 인터넷망 분리
        - 높은 보안성
        - 많은 비용발생
    - 논리적 망분리
        - 가상화 기술 이용한 업무망과 외부 인터넷망 분리
        - 서버기반 망분리
        - 클라이언트기반 망분리