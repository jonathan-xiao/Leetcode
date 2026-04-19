class Solution(object):
    def rotateArray1(self, nums, k):
        # idea: make a new array, and shift each element down to the right spot
        # then copy back into the old array
        new = nums[:]
        for i in range (len(nums)):
            new[((i+k) % (len(nums)))] = nums[i]

        for i in range (len(nums)):
            nums[i] = new[i]

    def rotateArray2(self, nums, k):
        # idea: improve on the first version by removing the second loop
        new = nums[:]
        for i in range (len(nums)):
            nums[((i+k) % (len(nums)))] = new[i]