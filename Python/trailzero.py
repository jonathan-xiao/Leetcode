class Solution(object):
    def trail(self, n):
        # idea: legendre's algorithm
        count = 0
        i = 1
        while (pow(5, i) <= n):
            count += (n / pow(5,i))
            i += 1

        return count