class Solution(object):
    def canJump(self, nums):
        # idea: max_reach tracks the furthest location we can get to so far
        # try all values in the array as we get are eligible to go there
        # if we get stuck it is false, otherwise we continue
        max_reach = 0
        for i in range(len(nums)):
            if i > max_reach:
                return False
        
            max_reach = max(max_reach, i + nums[i])
        
            if max_reach >= len(nums) - 1:
               return True
    
        return True
    
    def canJumpII(self, nums):
        # idea: keep track of the current farthest and the next farthest
        # greedy - every time we reach the end of current, we change it to the next farthest
        # and then increment count
        # also need edge case handling
        if (len(nums) <= 1):
            return 0
        count = 0
        cur = 0
        maxnext = 0
        for i in range(len(nums)-1):
            maxnext = max(maxnext, i+nums[i])
            if cur == i:    
                cur = maxnext
                count += 1

        return count


def main():
    solver = Solution()
    nums = [2, 3, 1, 1, 4]
    print(solver.canJumpII(nums))


if __name__ == "__main__":
    main()
