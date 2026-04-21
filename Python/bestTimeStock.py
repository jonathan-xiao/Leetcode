class Solution(object):
    def bestTime(self, prices):
        # idea: iterate through the array, keeping track of the current minimum and best profit so far
        # if the minimum shrinks then update, and then record if the new profit is better
        profit = 0
        min = 100000
        for i in range (len(prices)):
            if (prices[i] < min):
                min = prices[i]
            
            profit = max(profit, (prices[i] - min))

        return profit

    def bestTimeII(self, prices):
        # idea: simple greedy algorithm
        profit = 0
        for i in range ((len(prices))-1):
            if (prices[i] < prices[i+1]):
                profit += (prices[i+1]-prices[i])
        
        return profit