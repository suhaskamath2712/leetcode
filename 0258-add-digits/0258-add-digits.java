class Solution {
    public int addDigits(int num)
    {
        //Sum of digits is just num % 9 if it is not divisible by 9. If it is divisible by 9, the sum of digits is 9.
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}