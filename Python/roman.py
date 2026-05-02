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
    
    def intRoman(self, num):
        # idea: similar idea to above working backward from larger increments down
        s = ''
        while num > 0:
            if num >= 1000:
                s += 'M'
                num -= 1000
            elif num >= 900:
                s += 'CM'
                num -= 900
            elif num >= 500:
                s += 'D'
                num -= 500
            elif num >= 400:
                s += 'CD'
                num -= 400
            elif num >= 100:
                s += 'C'
                num -= 100
            elif num >= 90:
                s += 'XC'
                num -= 90
            elif num >= 50:
                s += 'L'
                num -= 50
            elif num >= 40:
                s += 'XL'
                num -= 40
            elif num >= 10:
                s += 'X'
                num -= 10
            elif num >= 9:
                s += 'IX'
                num -= 9
            elif num >= 5:
                s += 'V'
                num -= 5
            elif num >= 4:
                s += 'IV'
                num -= 4
            elif num >= 1:
                s += 'I'
                num -= 1

        return s