## 50-시큐어코딩과 SW개발보안
- 웹보안의 모델
    - 웹 방화벽
        - 외부 침임 방어
        - 웹의 앞 단에서 방어
    - 시큐어 코딩
        - 개발에서 설계단계부터 보안을 고려하여 코딩
        - 근본적이며 웹 보안의 시작
    - 악성코드 탐지
        - 주기적 점검 내부
        - 내부에서 문제점이 존재하는지 찾는 것
    - 취약점 점검
        - 주기적 점검 외부
        - 스캐너 또는 인력을 통해 취약점을 찾는 것
    - 암호화
        - 중요자산 보호
        - 암호화 등 추가적 보호 조치
### 1) 시큐어 코딩
- 설계 단계부터 보안을 고려하여 SW 코드를 작성하는 것
- 필요성
    - 인터넷상의 공격 시도의 약 75%는 SW의 보안취약점 악용
    - 보안장비로는 응용프로그램이 취약점에 대한 공격을 완벽하게 방어 불가능
### 2) SW 개발보안
- 안전한 SW를 개발하기 위한 일련의 보안 활동
- 시큐어 코딩을 절차화
- SW개발 생명주기의 각 단계별로 요구되는 보안활동 수행
- 기존의 SW개발 방법론에서 소프트웨어 개발 생명주기 전반에 걸쳐 보안 활동 추가
- 대표적인 SW 개발보안 방법론
    - MS SDL, Seven Touchpoints, CLASP
    - MS SDL
        - Microsoft Secure Development Lifecycle
        - MS사 자체 수립한 SDL(Secure Development Lifecycle) 방법론
    - Seven Touchpoints
        - 소프트웨어 보안의 모범사례를 소프트웨어 개발 라이프사이클(SDLC)에 통합한 것
    - CLASP
        - Comprehensive, Lightweight Application Security Process
        - 이미 운영 중인 시스템에 적용하기 좋음
        - 안전한 소프트웨어를 개발하기 위해 5가지 관점에 따라 개발보안 프로세스를 수행할 것 제안
        - 5가지 관점
            - 개념관점, 역할기반 관점, 활동평가 관점, 활동구현 관점, 취약성관점
- SW개발보안 적용 효과
    - SW개발보안 적용 시 취약점의 대폭적 감소와 유지보수 비용 절감
    - 국내 경우 2012년 SW개발보안 제도가 도입되어 단계적으로 의무화