class Solution {
    public boolean isPalindrome(int x)
    {
        int n = 0, temp = x;

        while (temp > 0)
        {
            n = (n*10)+(temp%10);
            temp /= 10;
        }

        return (n == x);
    }
}