class Solution(object):
    def lengthOfLastWord(self, s):
        # idea: last holds the candidate for the length of the last
        # if we encounter a space, then we update cur to 0
        # otherwise, we know there is a valid word so we update cur and set last
        last = 0
        cur = 0
        for c in s:
            if c == ' ':
                cur = 0
            else:
                cur += 1
                last = cur

        return last
    
    def lcp(self, strs):
        # idea: the prefix must be less or the same as the first word
        # check every word in the set char by char, starting with the first
        # any discrepancy means we return what we accumulated
        if len(strs) == 0:
            return ''
        if (len(strs[0]) == 0):
            return ''
        
        maxpre = ''
        cur = strs[0][0]
        for i in range(len(strs[0])):
            cur = (strs[0])[i]
            for c in strs:
                if i >= len(c) or c[i] != cur:
                    return maxpre
            
            maxpre += cur
        
        return maxpre
