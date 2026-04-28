class Solution(object):
    def candy(self, ratings):
        # currently incorrect implementation
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
            
