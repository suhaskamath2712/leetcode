class Solution {
    public int maxFrequency(int[] nums, int k)
    {
        int numKs = 0, gain = 0;

        //How many k's do we already have?
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == k)
                numKs++;
        
        //Only 50 values possible
        for (int i = 1; i <= 50; i++)
        {
            if (i == k)
                continue;
            
            int current = 0, maxCurrent = 0;

            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] == i)
                    current++;
                else if (nums[j] == k)
                    current--;

                current = Math.max(current, 0);
                maxCurrent = Math.max(current,maxCurrent); 
            }

            gain = Math.max(gain,maxCurrent);
        }

        return numKs + gain;
    }
}