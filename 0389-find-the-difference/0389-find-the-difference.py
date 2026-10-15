class Solution(object):
    def findTheDifference(self, s, t):
        
        # i = 0
        slen = len(s)
        tlen = len(t)

        # st = ""
        # while i < slen and i < tlen:
        #     if s[i] != t[i]:
        #         st.append(t[i])
        # return st

        s = sorted(s)
        t = sorted(t)

        for i in range(slen):
            if s[i] != t[i]:
                return t[i]
        return t[-1]

        