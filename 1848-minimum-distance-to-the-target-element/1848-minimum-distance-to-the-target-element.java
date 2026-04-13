class Solution {
    public int getMinDistance(int[] nums, int target, int start)
    {
        short minleft = Short.MAX_VALUE, minright = Short.MAX_VALUE;

        //Left Search
        for (short i = (short) start; i >= 0 && minleft == Short.MAX_VALUE; i--)
            if (nums[i] == target)
                minleft = (short) (start - i);

        //Right Search
        for (short i = (short) start; i < nums.length && minright == Short.MAX_VALUE; i++)
            if (nums[i] == target)
                minright = (short) (i - start);

        return (minleft < minright) ? minleft : minright;
    }
}