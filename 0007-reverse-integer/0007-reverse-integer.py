class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0

        num = 0

        neg = x/abs(x)

        x *= neg
        
        while x != 0:
            num *= 10
            num += x%10
            x //= 10
            print(num)

        if num > (2**31 - 1):
            return 0
        
        return num*neg


        