class Solution {
    public int compareBitonicSums(int[] nums)
    {
        long sum = 0;
        int i = 0;

        while (nums[i] < nums[i + 1])
        {
            sum += nums[i];
            i++;
        }

        System.out.println(sum);

        i++;

        while (i < nums.length)
        {
            sum -= nums[i];
            i++;
        }

        System.out.println(sum);

        if (sum > 0)   return 0;
        if (sum < 0)   return 1;
        return -1; 
    }
}