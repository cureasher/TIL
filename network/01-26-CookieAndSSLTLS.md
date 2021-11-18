## 26-Cookie & SSL/TLS
### 1) HTTP 속성
- Stateless
    - 통신이 끝나면 상태 정보를 유지 하지 않음
    - 요청에 대한 응답을 보내고 접속을 끊음
        - 커넥션 리소스 비용 줄임
    - 상태 정보가 필요한 경우 Cookie & Session 사용
- Stateful
    - 상태정보 유지
### 2) HTTP Cookie
- Cookie
    - 클라이언트 웹 브라우저 로컬에 저장되는 정보 - 로그인, 장바구니
- Session
    - 동일한 웹브라우저의 요청을 하나의 상태로 구분하여 서버에 정보를 저장
### 3) SSL/TLS
- SSL(Secure Socket Layer)
- TLS(Transport Layer Security)
- TCP/IP 통신간 보안을 제공하는 프로토콜
- TLS 계층
    - 상위 HandShake, Change Cipher Spec, Alert, 하위 Record 프로토콜 구성