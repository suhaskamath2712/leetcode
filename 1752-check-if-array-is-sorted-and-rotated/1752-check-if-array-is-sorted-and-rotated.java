class Solution {
    public boolean check(int[] nums)
    {
        boolean split = false;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > nums[(i+1)%nums.length])
            {
                if (split)
                    return false;
                split = true;
            }
        }
        return true;
    }
}