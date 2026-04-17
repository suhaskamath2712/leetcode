class Solution
{
    private int reverse (int n)
    {
        int rev = 0;

        while (n > 0)
        {
            rev *= 10;
            rev += n%10;
            n /= 10;
        }

        return rev;
    }

    public int minMirrorPairDistance(int[] nums)
    {
        int minDist = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                minDist = Math.min(minDist, i - map.get(nums[i]));
            
            map.put(reverse(nums[i]),i);

            if (minDist == 1)
                return 1;
        }

        if (minDist == Integer.MAX_VALUE)
            return -1;
        
        else return minDist;
    }
}