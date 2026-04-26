class Solution {
    public boolean checkDivisibility(int n)
    {
        int temp, digSum = 0, digProd = 1;

        temp = n;

        while (temp != 0)
        {
            digSum += temp%10;
            digProd *= temp%10;
            temp /= 10;
        }

        return (n % (digSum + digProd)) == 0;
    }
}