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