class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        
        n = len(nums)
        ans = [0]*n

        for i in range(n):
            count = 0
            for j in range(n):
                if nums[j] < nums[i]:
                    count += 1
            ans[i] = count
        return ans