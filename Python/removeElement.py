class Solution(object):
    def removeElement(self, nums, val):
        shift = 0
        k = 0
        for i in range (len(nums)):
            if (nums[i] == val):
                k += 1
            else:
                nums[shift] = nums[i]
                shift += 1
        
        return (len(nums)-k)
        