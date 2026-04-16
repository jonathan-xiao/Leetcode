class Solution(object):
    def removeElement(self, nums, val):
        # idea: keep track of the next place to put items
        # if we need to move an item, move it and increment shift
        # k keeps track of the number of duplicates, so length - k is the number of non-duplicates
        shift = 0
        k = 0
        for i in range (len(nums)):
            if (nums[i] == val):
                k += 1
            else:
                nums[shift] = nums[i]
                shift += 1
        
        return (len(nums)-k)
        