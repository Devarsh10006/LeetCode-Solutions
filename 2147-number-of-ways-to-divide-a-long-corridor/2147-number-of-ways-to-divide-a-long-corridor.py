class Solution(object):
    def numberOfWays(self, corridor):
        MOD = 10**9 + 7

        seats = corridor.count('S')
        if seats == 0 or seats % 2 != 0:
            return 0
        
        ways = 1
        noOfSeats = 0
        noOfPlant = 0

        for ch in corridor:
            if ch == 'S':
                noOfSeats += 1
                if noOfSeats == 3:
                    ways = (ways * (noOfPlant + 1)) % MOD
                    noOfSeats = 1
                    noOfPlant = 0
            else:
                if noOfSeats == 2:
                    noOfPlant += 1

        return ways