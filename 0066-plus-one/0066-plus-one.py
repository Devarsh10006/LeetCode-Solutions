class Solution(object):
    def plusOne(self, digits):
        
        n = 0

        for i in digits:
            n = n * 10 + i

        n += 1

        ans = []
        t = 0
        rev = 0
        while n > 0:
            # rem =  n % 10
            # rev = rev * 10 + rem
            # ans[t] = rev
            # t += 1
            # n /= 10

            ans.append(n % 10)
            n //= 10
            
        return ans[::-1]