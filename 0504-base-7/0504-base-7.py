class Solution(object):
    def convertToBase7(self, num):
        
        if num == 0: return "0"

        sign = ""
        if num < 0:
            sign = "-"
            num = -num

        base7 = ""
        while  num > 0:
            base7 = str(num % 7) + base7
            num //= 7

        return sign + base7
        