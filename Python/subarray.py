class Solution(object):
    def minsize(self, target, nums):
        mins = len(nums)+1
        left = 0
        right = 1
        cur = 0
        while right < len(nums)-1 and left < right:
            if cur < target:
                right += 1
                cur += nums[right]
            else:
                mins = min(mins, right - left)
                cur -= nums[left]
                left += 1

        if mins > len(nums):
            return 0
        else:
            return mins
