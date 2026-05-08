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