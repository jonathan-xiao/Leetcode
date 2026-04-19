class Solution(object):
    def bestTime(self, prices):
        profit = 0
        min = 100000
        for i in range (len(prices)):
            if (prices[i] < min):
                min = prices[i]
            
            profit = max(profit, (prices[i] - min))

        return profit

