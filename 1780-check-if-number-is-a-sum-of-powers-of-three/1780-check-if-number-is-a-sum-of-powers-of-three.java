class Solution {
    public boolean checkPowersOfThree(int n)
    {
        int pow = (int) (Math.log(n)/Math.log(3));

        while (n != 0 && pow >= 0)
        {
            int sub = (int) Math.pow(3,pow);

            if (sub <= n)
                n -= sub;

            pow--;
        }

        return (n==0);
    }
}