import sys

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        back1 = m-1
        back2 = n-1
        last = m+n-1
        while (back1 >= 0 and back2 >= 0):
            if (nums1[back1] > nums2[back2]):
                nums1[last] = nums1[back1]
                last -= 1
                back1 -= 1
            else:
                nums1[last] = nums2[back2]
                last -= 1
                back2 -= 1
        
        while (back2 >= 0):
            nums1[last] = nums2[back2]
            last -= 1
            back2 -= 1
    

        





            

