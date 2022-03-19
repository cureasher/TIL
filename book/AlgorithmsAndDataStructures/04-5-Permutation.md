## (5) 계단 오르기
### 1) 문제
- 입력된 문자열로 치환 가능한 문자열 모두 출력
- 문자열의 길이가 1이면 순열도 1개이므로 문자열 그대로 출력
- 입력한 문자열을 그대로 저장

### 2) 실습
```python
def find_permutation(words):
    if len(words) == 1:
        return list(words)

    answer = []
    current = words[0]
    words = words[1:]

    wordlist = find_permutation(words)

    for word in wordlist:
        for index in range(len(word) + 1):
            ans.append("".join([word[:index], current, word[index:]]))

    return answer
```