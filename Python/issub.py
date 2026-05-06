class Solution(object):
    def isSub(self, s, t):
        # idea: two pointers
        # greedily check s characters and move along
        sub = 0
        big = 0
        while sub < len(s) and big < len(t):
            if s[sub] == t[big]:
                sub += 1
            big += 1
        
        if sub == len(s):
            return True
        return False
        