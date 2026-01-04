class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.lstrip()  # 1. Remove leading whitespace
        if not s:
            return 0
        
        sign = 1
        index = 0
        
        # 2. Check for sign
        if s[index] == '-':
            sign = -1
            index += 1
        elif s[index] == '+':
            index += 1
            
        num = 0
        
        # 3. Read digits
        while index < len(s):
            curr = s[index]
            
            if not curr.isdigit():
                # Stop parsing immediately if a non-digit is found
                break
            
            # Convert char to int safely
            digit = int(curr) 
            
            # Check for overflow/clamping *before* adding (optional in Python due to auto-size, 
            # but good for strict 32-bit logic) or handle at the end.
            num = num * 10 + digit
            index += 1
        
        num *= sign
        
        # 4. Clamp to 32-bit integer range [-2^31, 2^31 - 1]
        INT_MIN = -2**31
        INT_MAX = 2**31 - 1
        
        if num < INT_MIN:
            return INT_MIN
        if num > INT_MAX:
            return INT_MAX
            
        return num