## 61-개인정보처리시스템 접근통제, 접속기록, 암호화 등
### 1) 개인정보처리시스템 접근통제 및 권한관리
- 접근통제의 목적
    - 인가되지 않은 접근 차단
- 고의 또는 실수로 인한 정보의 유출이나 변조, 훼손 등 위험 예방
- 접근통제 조치
    - 비인가 접근 차단, 안전한 인증수단 필요
- 접근 권한관리 목적
    - 목적외 불필요한 접근 최소화
    - 인가되지 않은 접근 차단
    - 업무 범위 별로 권한 차등 부여
#### (1) 접속통제(접근제한)
- 개인정보처리시스템에 대한 접속 IP주소, 포트, MAC 주소 등으로 제한
- 접속한 정보 분석 불법 적인 개인정보 유출 시도 탐지 및 조치
#### (2) 접속권한관리
- 업무수행 최소한의 범위, 담당자에 차등 부여
- 개인정보 분실, 도난, 유출 변조 또는 훼손 방지
#### (3) 안전한 접속 및 인증수단 적용
- 개인정보취급자가 정보통신망을 통해 외부에서 개인정보처리시스템 접속할 경우 
    - 안전한 접속수단 적용
        - 가상사살망(VPN) 또는 전용선 등 
    - 안전한 인증수단 적용
#### (4) 사용자 계정(1인 1계정)
- 동일한 업무를 수행해도 하나의 아이디를 공유하지 않아야함
- 책임추적성(Accountability) 확보
#### (5) 안전한 비밀번호 작성규칙 적용
- 안전하지 않은 비밀번호는 브루트포스 공격으로 정보가 노출위험 있음
- 일정 수준 이하의 비밀번호는 설정되지 못하도록 하는 시스템 구성
- 편의성 고려, 적절한 수준 설정
### 2) 접속기록의 보관 및 점검
#### (1) 개요
- 접속기록
    - 불법적인 접근 또는 행동을 확인할 수 있는 중요한 자료
    - 계정, 접속일시, 접속지 정보, 처리한 정보주체 정보, 수행업무 등 전자적으로 기록한 것
#### (2) 보관 및 점검
- 접속한 기록 1년이상 보관 관리
- 월 1회이상 점검
- 개인정보 다운로드한 것이 발견된 경우
    - 그 사유 반드시 확인(내부관리 계획)
    - 다운로드 시 사유 입력하는 기능 구현
#### (3) 안전한 보관 
- 접속기록 백업 수행
- 별도의 보조저장매체나 별도의 저장장치에 보관
### 3) 개인정보의 암호화
#### (1) 암호화 대상 정보
- 고유식별정보
    - 주민등록번호, 여권번호, 면허번호, 외국인등록번호
- 비밀번호
- 바이오 정보
    - 지문, 얼굴, 홍채, 정맥, 음성, 필적
- 시스템 운영을 위한 키값
    - 부분암호화 조치
#### (2) 송수신하거나 저장하는 경우(암호화 필요)
- 고유식별정보, 비밀번호, 바이오 정보
- 보조저장매체 등을 통하여 전달할 경우 
#### (3) 일방향 암호화
- 비밀번호
    - 복호화 되지 않도록 일방향 암호화 해야함
    - 저장된 값으로 원본 값을 유추하거나 복호화 할수 없도록 한 암호화
- 바이오 정보
    - 양방향 암호화 저장 필요
    - 식별 및 인증 등의 고유기능에 사용되는 경우로 한정
- 음성기록이나 일반 사진 정보는 암호화 대상에서 제외
#### (4) 인터넷 구간 내 고유식별정보 저장
- DMZ 구간
    - 고유식별정보를 저장하는 경우 암호화해 저장
    - 외부망에서 직접 접근이 가능한 영역
### 4) 개인정보처리시스템 취약점 점검
- 웹 취약점 점검
    - 홈페이지를 통해 고유식별정보 처리
    - 연 1회 이상 취야점 점검 및 보완조치
    - 인터넷 홈페이지
        - 정기적으로 웹 취약점 점검
### 5) 보안프로그램 설치 및 운영
#### (1) 보안프로그램 자동 업데이트
- 자동 업데이트 기능 사용
- 일 1회 이상 업데이트 실시
    - 최신 상태 유지
#### (2) 제조사 보안 업데이트(보안패치)
- 현재 운영중인 응용 프로그램과 정합성 고려해 최신 보안패치 적용