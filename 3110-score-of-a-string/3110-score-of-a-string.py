class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        num = []
        check = 0
        for i in range(0,len(s)-1):
            check = ord(s[i]) - ord(s[i + 1])
    
            if check < 0: 
                check *= -1
                num.append(check)
        
            else:
                num.append(check)
   
        sum = 0
        for j in range(0, len(num)):
            sum = sum + num[j]

        return sum

        