class Solution(object):
    def remDup(self, nums):
        # idea: first set cur to a lower number outside the bounds
        # iterate through nums, keeping track of where to next fill in
        # cur is the current number to compare for duplicates against
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