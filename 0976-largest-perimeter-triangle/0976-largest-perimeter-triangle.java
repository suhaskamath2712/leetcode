class Solution {
    public int largestPerimeter(int[] nums)
    {
        Arrays.sort(nums);
        
        int i = nums.length - 3;

        while (i >= 0)
        {
            if (nums[i+2] < nums[i+1] + nums[i])
                return nums[i+2] + nums[i+1] + nums[i];

            i--;
        }
        
        return 0;
    }
}