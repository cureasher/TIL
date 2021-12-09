## 47-클라이언트/서버와 웹 서비스, 웹 취약점
### 1) 클라이언트/서버 구조
- TCP/IP 프로토콜에서 클라이언트의 요청에 대해 서버가 응답하는 구조
### 2) 웹서비스
- web은 WWW(World Wide Web)의 줄임말
- web의 구성요소
    - URL(Uniform Resource Locator)
        - 네트워크 상의 자원의 위치를 나타내는 규약
    - HTML(HyperText, Markup Language)
        - 웹에 사용되는 웹 언어
    - HTTP(HyperText Transfer Protocol)
        - 웹에서 정보를 주고 받을 때 사용되는 프로토콜
- 동작방식
    - 정적방식
        - 클라이언트에게 고정된 웹 페이지 전달
    - 동적 방식
        - 클라이언트 요청에 맞게 서버가 생성한 HTML문서 보냄
### 3) Web Server와 WAS
- Web container유무에 따라 Web서버와 WAS를 구분할 수 있음
- Web 서버
    - HTML 문서와 같은 정적 컨텐츠 처리
- WAS
    - Web Server + Web Container
    - 동적 컨텐츠 처리하고 웹 응용프로그램 서비스 처리
- 웹 모의해킹
    - 취약점을 이용하여 실제 시스템을 공격