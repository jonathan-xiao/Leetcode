class Solution(object):
    def remDup(self, nums):
        cur = -101
        pos = 0
        for i in range (len(nums)):
            if (nums[i] == cur):
                pass
            else:
                nums[pos] = nums[i]
                pos += 1
                cur = nums[i]
        
        return pos