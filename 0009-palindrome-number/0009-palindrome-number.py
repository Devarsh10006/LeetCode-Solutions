class Solution(object):
    def isPalindrome(self, x):

        # rev = ""
        # string = str(x)
        # for ch in string:
        #     rev = ch + rev
        # if string == rev: return True
        # else: return False
        n = str(x)
        temp = str(x)
        if n == temp[::-1]: return True
        else: return False