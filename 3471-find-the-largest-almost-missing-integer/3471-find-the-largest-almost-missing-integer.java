class Solution {
    public int largestInteger(int[] nums, int k)
    {
        byte max = Byte.MIN_VALUE;

        for (int i : nums)
            max = max < i ? (byte) i : max;
        
        byte[] freq = new byte[max+1];

        for (byte i = 0; i <= nums.length-k; i++)
        {
            boolean[] seen = new boolean[max+1];
            for (byte j = i; j < i + k; j++)
            {
                if (!seen[nums[j]])
                {
                    freq[nums[j]]++;
                    seen[nums[j]] = true;
                }
            }
        }
        
        for (byte i = (byte) (freq.length-1); i >= 0; i--)
            if (freq[i] == 1)
                return i;
        
        return -1;
    }
}