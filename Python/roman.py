class Solution(object):
    def romanInt(self, s):
        # idea: go through the string, keeping track of the previous character to identify subtraction cases
        # keep a tally and return it based on the cases
        prev = 'a'
        tally = 0
        for c in s:
            if (c == 'M'):
                if (prev == 'C'):
                    tally += 800
                else:
                    tally += 1000
                prev = c
            elif (c == 'D'):
                if (prev == 'C'):
                    tally += 300
                else:
                    tally += 500
                prev = c
            elif (c == 'C'):
                if (prev == 'X'):
                    tally += 80
                else:
                    tally += 100
                prev = c
            elif (c == 'L'):
                if (prev == 'X'):
                    tally += 30
                else:
                    tally += 50
                prev = c
            elif (c == 'X'):
                if (prev == 'I'):
                    tally += 8
                else:
                    tally += 10
                prev = c
            elif (c == 'V'):
                if (prev == 'I'):
                    tally += 3
                else:
                    tally += 5
                prev = c
            elif (c == 'I'):
                tally += 1
                prev = c
        
        return tally