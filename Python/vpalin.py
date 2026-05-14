class Solution(object):
    def vpalin(self, s):
        # idea: two pointer solution 
        # keep track of nonvalid characters as we go
        # continue blocks are important to skip comparison when rejecting non-alnum chars
        s = s.lower()
        left = 0
        right = len(s)-1
        while left < right:
            if not (s[left]).isalnum():
                left += 1
                continue
            if not (s[right]).isalnum():
                right -= 1
                continue
            if s[left] != s[right]:
                return False
            else:
                left += 1
                right -= 1
        
        return True
    
    def pten(self, n):
        if n < 10:
            return 1
        else:
            return 1 + self.pten(n // 10)
    
    def ispalin(self, x):
        if x < 0:
            return False
        elif x != 0 and x % 10 == 0:
            return True
        else:
            right = self.pten(x)

        first = x // pow(10, right - 1)
        last = x % 10
        if first == last:
            middle = (x % pow(10, right - 1)) // 10
            return self.ispalin(middle)
        else:
            return False
        
    def ispalinStr(self, x):
        if x < 0:
            return False
        s = str(x)
        return s == s[::-1]

