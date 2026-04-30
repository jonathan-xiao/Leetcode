class Solution(object):
    def trap(self, height):
        # idea: the tallest block cannot be overflowed, so we work on both sides of it
        # track the current tallest on both sides
        # if taller, update current, else add the difference
        count = 0
        maxindex = 0
        lmax = 0
        rmax = 0
        cmax = 0
        l = len(height)
        for i in range(l):
            if height[i] > cmax:
                cmax = height[i]
                maxindex = i

        for i in range(maxindex):
            if height[i] > lmax:
                lmax = height[i]
            elif lmax - height[i] > 0:
                count += lmax - height[i]

        for i in range(l-1, maxindex-1, -1):
            if height[i] > rmax:
                rmax = height[i]
            elif rmax - height[i] > 0:
                count += rmax - height[i]
        
        return count
        