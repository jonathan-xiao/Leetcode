class Solution(object):
    def happy(self, n):
        # idea: use a set to track cycles
        if n == 1: return True
        hs = set()
        temp = n

        def digsqr(self, n):
            sum = 0
            while n != 0:
                sum += (n % 10) * (n % 10)
                n /= 10
            return sum

        while (not (temp in hs)) and temp != 1:
            hs.add(temp)
            temp = digsqr(self, temp)
            if temp == 1:
                return True
            
        return False
