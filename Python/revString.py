class Solution(object):
    def reverse(self, s):
        # idea: very naive solution
        # traverse the entire string, building words as you find them
        # then concatenate onto the accumulator, and finally strip it at the end
        cur = ''
        new = ''
        for c in s:
            if c == ' ' and cur != '':
                new = cur + ' ' + new 
                cur = ''
            elif c == ' ':
                continue
            else:
                cur += c

        return strip(cur + ' ' + new)
    
    def zigzag(self, s, numRows):
        # idea: go up and down, with a list-slot for every row
        # dir tracks whether we are going up or down
        # cur tracks which index to add to
        if numRows == 1 or numRows >= len(s):
            return s
        
        rows = [""] * numRows
        cur = 0
        dir = -1

        for c in s:
            rows[cur] += c
            if cur == 0 or cur == numRows - 1:
                dir *= -1
            cur += dir

        return "".join(rows)