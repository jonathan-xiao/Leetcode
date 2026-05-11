class Solution(object):
    def minsize(self, target, nums):
        # idea: sliding window approach
        # move right through the array
        # move left until the subarray is less than target if possible
        mins = len(nums)+1
        left = 0
        right = 0
        cur = 0
        while right < len(nums):
            cur += nums[right]
            
            while cur >= target:
                mins = min(mins, right - left + 1)
                cur -= nums[left]
                left += 1

            right += 1

        if mins > len(nums):
            return 0
        else:
            return mins
        
    def longnonrep(self, s):
        # idea: sliding window with a set to track characters we are holding
        left = 0
        right = 0
        longest = 0
        track = set()
        while right < len(s):
            while s[right] in track:
                track.remove(s[left])
                left += 1
            
            track.add(s[right])
            longest = max(longest, right - left + 1)
            right += 1

        return longest

