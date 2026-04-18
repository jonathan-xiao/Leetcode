class Solution(object):
    def majorityElement(self, nums):
        # idea: exact implementation of the simplest Moore-Booth Voting Algorithm
        candidate = nums[0]
        count = 0
        for i in range (len(nums)):
            if (nums[i] == candidate):
                count += 1
            elif (count == 0):
                candidate = nums[i]
            else:
                count -= 1

        return candidate