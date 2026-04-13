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

        /*
        int i = 0;

        //Explore in both directions
        while (start-i >= 0 && start+i < nums.length)
        {
            if (nums[start-i] == target || nums[start+i] == target)
                return i;
            
            i++;
        }

        System.out.println("Bidirectional search failed!");
        
        int temp = i;

        //Explore left
        while (start-temp >= 0)
        {
            if (nums[start-temp] == target)
                return temp;
            temp++;
        }

        System.out.println("Left search failed!");
        
        temp = i;

        //Explore right
        while (start+temp < nums.length)
        {   
            if (nums[start+temp] == target)
                return temp;
        }

        System.out.println("Right search failed!");

        return -1;
        */
    }
}