class Solution {
    public int minElement(int[] nums)
    {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++)
        {
            int temp = 0;

            while (nums[i] != 0)
            {
                temp += nums[i]%10;
                nums[i] /= 10;
            }

            min = min > temp ? temp : min;
        }

        return min;
    }
}