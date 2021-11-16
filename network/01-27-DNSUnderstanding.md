## 24-DNS의 이해
### 1) 애플리케이션 계층
- TCP/IP 모델에서 최상위 계층
- 사용자와 가장 가까운 인터페이스 제공
- HTTP, DNS, SMTP, SSH BGP, DHCP
### 2) DNS 개요
- 도메인 주소를 IP주소로 변환해주는 서비스
- Port 53
- 계층적 구조
- DNS서버 정보타입
- Recusive Query
    - Local DNS 서버가 재귀적으로 여러 서버에게 질의하여 응답 받는 과정
- Iterative Query
    - Local DNS 서버가 반복적 질의
- Resource Records
    - DNS 레코드, DNS 서버가 가지고 있는 IP 매핑 정보 테이블
    - Type
        - A : 호스트
        - NS : 네임서버
        - CNAME : 별칭
        - MX : 메일서버
- DNS 메시지
    - 쿼리와 응답으로 구분되며 쿼리 전에 hosts.txt & DNS 캐시 테이블 참조
- hosts.txt
    - 호스트 이름과 IP주소가 맵핑되어 저장된 파일
- DNS 캐시 테이블 
    - 기존에 응답 받은 DNS 정보를 일정시간(TTL) 저장하고 동일한 질의시 응답