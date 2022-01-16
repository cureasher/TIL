## (6) 동전교환
### 1) 문제
- 물건 값을 지불하고 남은 잔돈을 거슬러주는 과정에서, 가장 적은 개수의 동전을 반환하는 문제
### 2) 실습
```python
def coinExchange(coins: List[int], value: int) -> int:
    def change(left_money:int):
        if left_money == 0:
            return 0

        min_coin_count = sys.maxsize
        for coin in coins:
            if (left_money - coin) >= 0:
                change_count = change(left_money - coin)
                if change_count < min_coin_count:
                    min_coin_count = change_count

        return min_coin_count + 1

    answer = change(value)

    return answer if answer != sys.maxsize + 1 else -1
```