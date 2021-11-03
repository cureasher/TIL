## 11-스패닝트리 프로토콜과 루핑
### 1) Looping
- 같은 네트워크 대역 대에서 스위치에 연결된 경로가 2개 이상인 경우 발생
### 2) STP(Spanning Tree Protocol)
- 루핑 방지를 자동으로 하기 위한 프로토콜
- 구성요소
    - Root Bridge, Roopt Port, Designated Port, Path Cost
- 상태변화
    - Disabled - Blocking - Listening - Learning - Forwarding
- RSTP
    -컨버전스 타임을 개선한
- MST
    - 부하를 줄이고 효율적 관리를 위한 