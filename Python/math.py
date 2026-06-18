class Solution(object):
    def mySqrt(self, x):
      # idea: binary search
      if x < 2:
          return x
      left, right = 1, x // 2
      while left <= right:
          mid = (left + right) // 2
          if mid * mid == x:
              return mid
          elif mid * mid < x:
              left = mid + 1
          else:
              right = mid - 1
      return right
    
import random
class RandomizedSet(object):

    def __init__(self):
        self.arr = []
        self.map = dict()


    def insert(self, val):
        if val in self.map:
            return False
        else:
            self.arr.append(val)
            self.map[val] = len(self.arr) - 1
            return True
        

    def remove(self, val):
        if val not in self.map:
            return False
        else:
            index = self.map[val]
            temp = self.arr[-1]
            self.arr[index] = temp
            self.map[temp] = index
            self.arr.pop()
            del self.map[val]
            return True

        

    def getRandom(self):
        return random.choice(self.arr)