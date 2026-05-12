class Solution(object):
    def twoSumII(self, numbers, target):
        # idea: two pointers, standard algorithm
        res = [1, len(numbers)]
        while True:
            if numbers[(res[0]-1)] + numbers[(res[1]-1)] == target:
                return res
            elif numbers[(res[0]-1)] + numbers[(res[1]-1)] > target:
                res[1] = res[1] - 1
            else:
                res[0] = res[0] + 1

    def threeSum(self, nums):
        lst = []
        for i in range(len(nums)-2):
            target = -nums[i]
            hash = set()
            for j in range(i+1, len(nums)):
                if (target - nums[j]) in hash:
                    lst.append([nums[i], nums[j], -nums[i]-nums[j]])
                else:
                    hash.add(target - nums[j])

        return lst
    
    def threeSumII(self, nums):
        # idea: sort, then two pointers
        # carefully avoid duplicates by tracking duplicate numbers
        nums.sort()
        lst = []
        for i in range(len(nums)-2):
            if i != 0 and nums[i] == nums[i-1]:
                continue

            left = i+1
            right = len(nums)-1

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total == 0:
                    lst.append([nums[i], nums[left], nums[right]])
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1
                
                elif total < 0:
                    left += 1
                else:
                    right -= 1
        
        return lst
