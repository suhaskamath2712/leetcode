class Solution {
    public int minPairSum(int[] nums)
    {
        Arrays.sort(nums);

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length/2; i++)
        {
            int sum = nums[i] + nums[nums.length-i-1];
            maxSum = maxSum < sum ? sum : maxSum;
        }

        return maxSum;    
    }
}