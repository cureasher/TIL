## 37-웹 방화벽
### 1) 개요
- WAF(Web Application Firewall)로 불리며 HTTP/HTTPS 트래픽을 검사
- 기본 통신구조
    - TCP Connection
        - 3 way handshake
    - HTTP Transfer
        - Request
            - Header
            - Body
                - GET : Blank
                - POST, PUT, DELETE, OPTION
        - Response
            - 프로토콜 버전 및 응답 코드, 웹서버 배너 정보
            - MIME 타입, HTTP-Body 사이즈
        - Proxy
            - 물리적으로 인라인과 원암(with LB) 구성
### 2) OWASP
1. 정의
    - 오픈소스 웹 애플리케이션 보안프로젝트 4년 주기로 취약점 TOP 10 발표
2. 인젝션
    - 신뢰할 수 없는 데이터가 명령어 or 질의어의 일부분으로써 인터프리터에 보내질때 발생
3. Cross site script
    - 신뢰할 수 없는 데이터를 웹 브라우저를 통해 보낼 때 발생