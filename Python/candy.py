class Solution(object):
    def candy(self, ratings):
        # currently incorrect implementation
        # problem is that the increments can be by more than +-1. 
        # also, i need to track the length of the current "chain"
        curcandy = 0
        curmin = 0
        curcount = 0
        tcount = 0
        ending = False
        for i in range(1,len(ratings)):
            if ratings[i] == ratings[i-1]:
                tcount += curcount
                tcount += (1-curmin)*len(ratings)
                curmin = 0
                curcount = 0
                curcandy = 0
                ending = True
            elif ratings[i] > ratings[i-1]:
                curcandy += 1
                curcount += curcandy
                ending = False
            else:
                curcandy -= 1
                curcount += curcandy
                curmin = min(curmin, curcandy)
                ending = False

        if ending == False:
            tcount += curcount
            tcount += (1-curmin)*len(ratings)
        return tcount
    
    def candy2(self, ratings):
        # idea: use two passes instead, checking the conditions in both directions
        # then simply return the total number of candies
        # O(N) space, so this can be optimized a little further
        count = [1] * len(ratings)
        for i in range (1, len(ratings)):
            if (ratings[i] > ratings[i-1]):
                count[i] = count[i-1]+1
            
        for i in range(len(ratings)-2, -1, -1):
            if (ratings[i] > ratings[i+1]):
                count[i] = max(count[i], count[i+1]+1)

        return sum(count)
