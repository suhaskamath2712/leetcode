class Solution {
    public int countElements(int[] nums, int k)
    {
        if (k == 0)
            return nums.length;
            
        Arrays.sort(nums);

        int threshold = nums[nums.length - k], ans = 0;

        for (int num : nums)
            if (num < threshold)  //strictly less than
                ans++;
        
        return ans;
    }
}