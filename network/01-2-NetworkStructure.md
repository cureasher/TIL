## 02-네트워크 구조
### 1) 네트워크의 구조
- 규모
    - 사용자, 대역폭
- 업종
    - 공공기관, 제조, 금융, 게임 등의 서비스 중요도
- 통신 방식과 경로
    - Server & Client, Peer to Peer
- 토폴로지
    - Star, Ring, Mesh, Bus, Tree, Redundancy
### 2) 홈 네트워크
- 인터넷 - ISP - 모뎀 - 공유기 - 컴퓨터
### 3) 기업용 네트워크
- 인터넷 - ISP(전용선) - 라우터 - 방화벽
- 1 - L3백본 - L2스위치 - 서버, 컴퓨터
- 2 - L4로드밸런서, DMZ
### 4) 클라우드 네트워크 - AWS 기준
- 인터넷 - Route53 - IGW - VPC - ELB - Auto Scaling - Security Group - EC2