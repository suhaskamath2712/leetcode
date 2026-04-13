class Solution {
    public int getMinDistance(int[] nums, int target, int start)
    {
        int minleft = Integer.MAX_VALUE, minright = Integer.MAX_VALUE;

        //Left Search
        for (int i = start; i >= 0 && minleft == Integer.MAX_VALUE; i--)
            if (nums[i] == target)
                minleft = start - i;

        //Right Search
        for (int i = start; i < nums.length && minright == Integer.MAX_VALUE; i++)
            if (nums[i] == target)
                minright = i - start;

        return (minleft < minright) ? minleft : minright;
    }
}