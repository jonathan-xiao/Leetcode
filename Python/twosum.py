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