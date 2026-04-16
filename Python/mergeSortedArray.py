import sys

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        temp1 = -sys.maxsize - 1
        temp2 = -sys.maxsize - 1
        j = 0
        for i in range (m+n):
            temp2 = nums2[j]
            if (nums1[i] <= temp2):
                pass
            else:
                temp1 = nums1[i]
                nums1[i] = temp2
                j += 1



            

