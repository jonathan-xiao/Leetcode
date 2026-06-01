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
    
    def containsNearbyDuplicate(self, nums, k):
        # idea: use a dict to store more recent seen index
        d = dict()
        for i in range(len(nums)):
            if nums[i] in d:
                if i - d[nums[i]] <= k:
                    return True
                else:
                    d[nums[i]] = i
            else:
                d[nums[i]] = i

        return False
    
    def longestConsecutive(self, nums):
        # idea: the set helps see if where to start each chain
        # if not the start of a chain, skip, else count
        numset = set(nums)
        long = 0
        for n in numset:
            if n-1 not in numset:
                cur = n
                l = 1
                while cur+1 in numset:
                    cur += 1
                    l += 1
                
                long = max(long, l)

        return long



