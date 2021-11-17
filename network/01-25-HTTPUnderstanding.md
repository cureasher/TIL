## 25-HTTP의 이해
### 1) HTTP 개요
1. 정의
    - HTTP(HyperText Transfer Protocol)
    - WWW상에서 정보를 공유하는 프로토콜
    - Port 80
    - HTML(HyperText Markup Language)-웹페이지 언어
    - 팀 버너스 리-1989년
    - 1999년 HTTP v1.1 -RFC 2616
    - 2015년 HTTP/2- RFC 7540
2. URL(Uniform Resource Locator)
    - 웹페이지를 찾기위한 주소
    - Request-Client, Response-Server 구성
### 2) HTTP Request
- 클라이언트가 서버에게 특정 메서드를 사용하여 요청
- Head, Body로 구성
- HTTP 메서드
    - GET, POST, PUT, HEAD, DELETE
### 3) HTTP Response
- 클라이언트 요청에 따른 Server의 응답
- 상태코드
    - 2xx Success
        - 200 Ok
    - 3xx Redirection
    - 4xx Client Error
        - 404 Not Found
    - 5xx Server Error
        - 503 Service Unavilable