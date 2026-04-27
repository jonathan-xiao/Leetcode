class Solution(object):
    def station(self, gas, cost):
        # idea: iterate through to find the minimum spot: this is the hardest place to get out of, so start after it
        # also, if there's not enough gas in total then we return -1
        minpos = 0
        minnum = 1000000
        cur = 0
        totalgas = 0
        totalcost = 0
        for i in range(len(gas)):
            totalgas += gas[i]
            totalcost += cost[i]
            cur = gas[i]-cost[i] + cur
            if (cur < minnum):
                minpos = i
                minnum = cur
        
        if (totalgas >= totalcost):
            return (minpos+1) % len(gas)
        else:
            return -1