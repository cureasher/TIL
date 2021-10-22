# (4) GroupAnagram
## 1) 문제
- 문자열이 서로 같은 애너그램끼리 묶어라
## 2) 제한사항
- 순서가 뒤섞이면 안됨
- 리스트의 모든 문자열은 소문자
## 3) 풀이
1. 정렬 및 해시 테이블
    - 해시맵으로 테이블 생성
    - 문자열을 키로받고 값은 리스트에 저장
    - 입력 words 문자열 word로 순회
    - word를 정렬해서 애너그램 확인
    - 정렬된 문자열을 키로 찾은 해시맵 
    - 테이블에 word 문자 추가
    - 시간복잡도: O(n*LlogL), 공간복잡도: O(n*L)
2. 문자 카운트 및 해시 테이블
    - 해시맵 테이블 생성
    - 앞파벳 개수에 맞게 빈리스트 0으로 채움
    - word의 character값 순회하며 카운트 증가
    - 카운트가 증가한 키를 기준으로 해시맵 테이블에 word 추가
    - 시간복잡도: O(n*L), 공간복잡도: O(n*L)
## 4) 실습
```python
from typing import List
import collections
def group_anagrams_sort_hashmap(words: List[str]) -> List[List[str]]:
    word_hashmap = collections.defaultdict(list)

    for word in words:
        word_hashmap["".join(sorted(word))].append(word)

    return word_hashmap.values()
```
```python
from typing import List
import collections
def group_anagrams_char_hashmap(words: List[str]) -> List[List[str]]:
    word_hashmap = collections.defaultdict(list)

    for word in words:
        count = [0] * 26

        for character in word:
            count[ord(character) - ord('a')] += 1
        word_hashmap[tuple(count)].append(word)

    return word_hashmap.values()
```
## 5) 결과
- 함수 실행
    - group_anagrams_sort_hashmap(["ate","eat","nat","tan","tea","bat"])
    - group_anagrams_char_hashmap(["ate","eat","nat","tan","tea","bat"])
- 결과
    - dict_values([['ate', 'eat', 'tea'], ['nat', 'tan'], ['bat']])