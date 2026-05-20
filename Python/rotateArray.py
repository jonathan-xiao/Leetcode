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

    def spiral(self, matrix):
        # idea: simulation
        # have corner variables and for loop between them
        # add checks to the last two cases to resolve flat matrix cases
        if (not matrix): return []
        left = 0
        right = len(matrix[0])-1
        top = 0
        bottom = len(matrix)-1
        res = []
        while left <= right and top <= bottom:
            for i in range(left, right+1):
                res.append(matrix[top][i])
            top += 1

            for j in range(top, bottom+1):
                res.append(matrix[j][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for j in range(bottom, top-1, -1):
                    res.append(matrix[j][left])
                left += 1
    
        return res
