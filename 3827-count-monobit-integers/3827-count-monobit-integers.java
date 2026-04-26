class Solution {
    public int countMonobit(int n)
    {
        int[] monobits = new int[]{1,3,7,15,31,63,127,255,511};
        int count = 1;

        for (int i : monobits)
            if (i <= n)
                count++;

        return count;    
    }
}