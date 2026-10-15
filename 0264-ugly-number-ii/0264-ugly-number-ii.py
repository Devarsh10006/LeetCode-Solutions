# class Solution(object):
#     def nthUglyNumber(self, n):
        
#         if n == 1: return 1

#         else:
#             count = 1
#             nth = 2

#             while count != n:

#                 temp = nth
                
#                 while temp % 2 == 0:
#                     temp //= 2
#                 while temp % 3 == 0:
#                     temp //= 3
#                 while temp % 5 == 0:
#                     temp //= 5

#                 if temp == 1:
#                     count += 1
#                     if count == n:
#                         return nth
                
#                 nth +=  1


class Solution(object):
    def nthUglyNumber(self, n):

        ugly = [0] * n
        ugly[0] = 1

        i2 = i3 = i5 = 0
        next2 = 2
        next3 = 3
        next5 = 5

        count = 1
        nth = 1

        while count < n:

            nxt = min(next2, next3, next5)
            ugly[count] = nxt
            nth = nxt

            if nxt == next2:
                i2 += 1
                next2 = ugly[i2] * 2

            if nxt == next3:
                i3 += 1
                next3 = ugly[i3] * 3

            if nxt == next5:
                i5 += 1
                next5 = ugly[i5] * 5

            count += 1

        return nth


        