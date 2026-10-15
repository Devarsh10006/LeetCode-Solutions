class Solution(object):
    def maximumWealth(self, accounts):
        
        # MAX = 0

        # for customer in accounts:
        #     sum = 0
        #     for money in customer:
        #         sum += money
            
        #     if MAX < sum:
        #         MAX = sum
        
        # return MAX
        return max(map(sum, accounts))