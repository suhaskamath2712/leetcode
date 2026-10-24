class Solution
{
    private boolean sod (int i, int max)
    {
        int sum = 0;

        while (i != 0)
        {
            sum += i%10;
            i /= 10;

            if (sum > max)
                return false;
        }

        if (sum == max)
            return true;

        return false;
    }

    public int smallestIndex(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
            if (sod(nums[i],i))
                return i;

        return -1;    
    }
}