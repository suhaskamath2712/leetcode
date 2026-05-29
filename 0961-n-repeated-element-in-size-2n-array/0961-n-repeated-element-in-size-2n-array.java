class Solution {
    public int repeatedNTimes(int[] nums)
    {
        boolean[] attendance = new boolean[10001];

        for (int num : nums)
        {
            if (attendance[num])
                return num;
            
            attendance[num] = true;
        }    

        return -1;
    }
}