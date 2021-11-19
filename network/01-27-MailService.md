## 27-메일 서비스 
### 1) Email 개요
- 전자메일로 1982년 표준 RFC 821 공개
- 웹메일, ERP 기업용 메일, 아웃룩
- SMTP(Simple Mail Transfer Protocol)
    - 메일 발신
- POP3(Post Office Protocol Version3)
    - 서버에서 메일을 가져오고 서버에서 삭제
- IMAP4(Internet Message Access Protocol4)
    - 중앙서버에서 메일 열람 관리
### 2) 동작과정
- 메일서버
    - MTA(Mail Transfer Agent) 메일전송
- 메일 클라이언트
    - MTU(Mail User Agent) 메일 송수신 프로그램
- MDA(Mail Delivery Agent)
    - MTA가 수신한 메일을 수신자 우편한에 기록
- MRA(Mail Retrieval Agent)
    - 리모트 서버의 우편함에서 사용자에게 메일을 가져오는 프로그램