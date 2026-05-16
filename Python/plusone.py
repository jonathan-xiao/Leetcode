class Solution(object):
    def plus(self, digits):
        # idea: simple list traversal, accounting for carries
        digits.reverse()
        carry = False
        for i in range(len(digits)):
            if digits[i] >= 0 and digits[i] < 9 and (not carry):
                digits[i] += 1
                break
            elif digits[i] >= 0 and digits[i] < 9 and carry:
                digits[i] += 1
                break
            elif digits[i] == 9 and i != len(digits)-1:
                digits[i] = 0
                carry = True
            else:
                digits[i] = 0
                digits.append(1)

        digits.reverse()
        return digits
