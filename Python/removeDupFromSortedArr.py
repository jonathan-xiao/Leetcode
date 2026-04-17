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
    
    def remDupII(self, nums):
        # idea: same as above, but we add a boolean condition to see if we have had a repetition yet
        pos = 0
        cur = -1000001
        double = False
        for i in range (len(nums)):
            if (nums[i] == cur and double == True):
                pass
            elif (nums[i] == cur):
                double = True
                nums[pos] = nums[i]
                pos += 1
            else:
                nums[pos] = nums[i]
                pos += 1
                cur = nums[i]
                double = False
        
        return pos