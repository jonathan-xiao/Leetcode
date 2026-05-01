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