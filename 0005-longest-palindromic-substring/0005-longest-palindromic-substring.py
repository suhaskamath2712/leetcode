class Solution(object):
    def longestPalindrome(self, s):
        def expandCenterOdd(index):
            i = index - 1
            j = index + 1
            palindrome = []
            while i >= 0 and j < len(s):
                if s[i] != s[j]:
                    break
                palindrome = s[i:j+1]

                i -= 1
                j += 1
            
            return palindrome

        def expandCenterEven(index):
            i = index - 1
            j = index
            palindrome = []
            while i >= 0 and j < len(s):
                if s[i] != s[j]:
                    break
                palindrome = s[i:j+1]

                i -= 1
                j += 1
            return palindrome
            
        max_palindrome = s[0]

        for i in range(len(s)):
            temp = expandCenterOdd(i)
            max_palindrome = temp if len(temp) > len(max_palindrome) else max_palindrome
            temp = expandCenterEven(i)
            max_palindrome = temp if len(temp) > len(max_palindrome) else max_palindrome
        
        return max_palindrome