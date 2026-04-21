class Solution(object):
    def canJump(self, nums):
        # idea: max_reach tracks the furthest location we can get to so far
        # try all values in the array as we get are eligible to go there
        # if we get stuck it is false, otherwise we continue
        max_reach = 0
        for i in range(len(nums)):
            if i > max_reach:
                return False
        
            max_reach = max(max_reach, i + nums[i])
        
            if max_reach >= len(nums) - 1:
               return True
    
        return True