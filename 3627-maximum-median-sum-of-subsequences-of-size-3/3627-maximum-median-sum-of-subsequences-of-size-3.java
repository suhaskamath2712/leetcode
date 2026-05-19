class Solution
{
    public long maximumMedianSum(int[] nums)
    {
        Arrays.sort(nums);
        long sum = 0;
        int k = nums.length / 3; // no of groups
        int index = nums.length - 2;
        
        for (int i = 0; i < k; i++)
        {
            sum += nums[index];
            index -= 2;
        }

        return sum;
    }
}