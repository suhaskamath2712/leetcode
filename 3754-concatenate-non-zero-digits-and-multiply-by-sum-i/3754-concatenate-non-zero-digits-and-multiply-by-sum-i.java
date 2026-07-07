class Solution {
    public long sumAndMultiply(int n)
    {
        int x = 0, sum = 0;

        while (n != 0)
        {
            int dig = n%10;
            sum += dig;

            if (dig != 0)
            {
                x *= 10;
                x += dig;
            }

            n /= 10;
        }

        int revX = 0;

        while (x != 0)
        {
            revX *= 10;
            revX += x%10;
            x /= 10;
        }

        System.out.println(revX);

        return (long) revX * (long) sum;
    }
}