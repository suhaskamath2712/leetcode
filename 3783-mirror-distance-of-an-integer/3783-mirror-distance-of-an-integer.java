class Solution {
    public int mirrorDistance(int n)
    {
        int rev = 0, n_copy = n;

        while (n_copy > 0)
        {
            rev = rev*10 + n_copy%10;
            n_copy /= 10;
        }

        return Math.abs(rev-n);
    }
}