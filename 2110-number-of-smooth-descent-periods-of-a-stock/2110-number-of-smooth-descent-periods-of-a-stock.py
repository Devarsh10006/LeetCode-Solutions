class Solution(object):
    def getDescentPeriods(self, prices):
            
        length = len(prices)
        ans = 1
        curr = 1

        for i in range(1, length):
            if prices[i - 1] - prices[i] == 1:
                curr += 1
            else:
                curr = 1
            
            ans += curr
        
        return ans
        
    