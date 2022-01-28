fun maxProfit(prices: IntArray) : Int{
    var min_price = Int.MAX_VALUE
    var profitCheck = 0

    prices.forEach { currentPrice ->
        min_price = Math.min(min_price, currentPrice)
        profitCheck = Math.max(profitCheck, currentPrice-min_price)
    }

    return profitCheck
}