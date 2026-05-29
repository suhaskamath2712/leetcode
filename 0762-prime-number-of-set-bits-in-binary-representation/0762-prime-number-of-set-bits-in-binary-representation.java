class Solution {
    final byte[] primeArr = new byte[]{2,3,5,7,11,13,17,19};
    private byte numBits (int num)
    {
        byte numBits = 0;
        while (num != 0)
        {
            numBits += (byte) (num % 2);
            num >>= 1;
        }
        return numBits;
    }

    private boolean isPrime(byte num)
    {
        for (int prime : primeArr)
            if (num == prime)
                return true;
            else if (prime > num)
                return false;
        
        return false;
    }

    public int countPrimeSetBits(int left, int right)
    {
        int cnt = 0;

        for (int i = left; i <= right; i++)
        {
            if (isPrime(numBits(i)))
                cnt++;
        }

        return cnt;
    }
}