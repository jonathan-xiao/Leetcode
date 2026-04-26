class Solution(object):
    def prod(self, nums):
        l = len(nums)
        prefix = [1] * l
        suffix = [1] * l
        prefix[0] = 1
        suffix[l-1] = 1
        for i in range(1, l):
            prefix[i] = nums[i-1] * prefix[i-1]
            suffix[l-1-i] = nums[l-i] * suffix[l-i]

        for i in range(0,l):
            nums[i] = prefix[i] * suffix[i]

        return nums
        