# (5) IPv4IPv6Validate
## 1) 문제
- 문자열 불러와서 유효한지 확인
## 2) 제한사항
- IPv4 확인
    - ip 숫자를 점으로 구분
    - 점으로 숫자 4개가 나옴
    - 0~255의 각 숫자의 범위
    - 0이 아닌 경우 0으로 시작하는 경우 없음
- IPv6 확인
    - 숫자 구분 콜론(:)
    - 8개의 숫자로 구분
    - 각 숫자는 4자리 16진수 0000에서 FFFF까지
    - 4자리를 다채워야하므로 0으로 시작할 수 있음
    - 각 숫자는 4자리를 넘지 않음
    - 콜론 사이에 숫자가 없으면 유효 안함
- 리스트의 모든 문자열은 소문자
## 3) 풀이
1. 정규 표현식
    - IPv4, IPv6 규칙에 맞는 정규 문법 작성
    - 규칙에 맞는 결과 반환
    - 시간복잡도: O(1), 공간복잡도: O(1)
## 4) 실습
```python
from typing import List
import re
def validIPv4IPv6Address(checkIP: str) -> str:
    IPV4 = '(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])'

    ipv4 = re.compile(r'^({p}\.){{3}}{p}$'.format(p=IPV4))

    if ipv4.match(checkIP):
        return "IPv4"

    IPV6 = '([0-9a-f]{1,4})'

    ipv6 = re.compile(r'^({p}\:){{7}}{p}$'.format(p=IPV6),
                  re.IGNORECASE)

    if ipv6.match(checkIP):
        return "IPv6"

    return "Neither"
```
## 5) 결과
- 함수 실행
    - validIPv4IPv6Address("172.168.10.5")
    - validIPv4IPv6Address("2611:0db8:85a3:0:0:8A2E:0370:7334")
    validIPv4IPv6Address("256.168.10.5")
- 결과
    - IPv4
    - IPv6
    - Neither