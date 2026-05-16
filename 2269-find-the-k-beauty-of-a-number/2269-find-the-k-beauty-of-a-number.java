class Solution {
    public int divisorSubstrings(int num, int k)
    {
        int mod = (int) Math.pow(10,k), beauty = 0;
        final int NUMFINAL = num;

        while (num >= mod/10)
        {
            int k_gram = num%mod;
            if (k_gram != 0 && NUMFINAL%k_gram == 0)
                beauty++;
            
            num /= 10;
        }

        return beauty;
    }
}