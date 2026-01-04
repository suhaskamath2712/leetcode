class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        temp = []
        unique = [0]
        for let in s:
            if let not in temp:
                temp.append(let)
            else:
                unique.append(len(temp))
                temp = temp[temp.index(let)+1:]
                temp.append(let)
        
        unique.append(len(temp))
        
        return max(unique)