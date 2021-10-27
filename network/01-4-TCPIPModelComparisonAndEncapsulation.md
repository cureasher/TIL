## 04-TCP/IP 모델 비교와 캡슐화
### 1) TCP/IP?
- 정의
    - 네트워크 프로토콜 모음
    - IP : 패킷 통신 방식
    - TCP : 전송 조절 프로토콜
- 역사
    - 1960년대 말 방위고등연구계획국(DARPA) 연구
    - 1990년대 네트워크 표준 ISO모델, TCP/IP 모델로 좁혀짐
    - 1990년대 말 TCP/IP 모델이 자주 쓰이며 일반적 모델이 됨
### 2) TCP/IP 모델
- Application : 응용 프로그램간 표준화 된 데이터 교환
- Transport : TCP/UDP
- Network : 패킷을 처리하고 다른 네트워크 연결
- NetWork Interface : 물리 계층으로 네트워크 노드 상호 연결
### 3) TCP/IP와 OSI 7 Layer비교
|TCP/IP|Service & Protocol|OSI 7 Layer|
|---|:---:|---:|
| Application|HTTP, SMTP, DNS | Application </br>Presentation</br>Session |
|Transport|TCP, UDP|Transport|
|Network|IP, ICMP, OSPF|Network|
|Network Interface|Ethernet|DataLink</br> Physical|
### 4) 인캡슐레이션
- Application -> Pyshical
### 5) 디캡슐레이션
- Pyshical -> Application