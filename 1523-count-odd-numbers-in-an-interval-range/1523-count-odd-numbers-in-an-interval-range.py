class Solution(object):
    def countOdds(self, low, high):
        length =  high - low + 1

        if length % 2 == 0: return length // 2
        
        else:
            if low % 2 == 1: return length // 2 + 1

            else: return length // 2