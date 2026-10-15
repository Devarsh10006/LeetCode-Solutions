class Solution(object):
    def countConsistentStrings(self, allowed, words):

        allowed = set(allowed)
        count = 0

        for word in words:
            for ch in word:
                if ch not in allowed:
                    break
            else:
                count += 1

        return count

        # return sum(set(word) <= set(allowed) for word in words)