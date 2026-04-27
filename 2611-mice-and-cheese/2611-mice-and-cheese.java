class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k)
    {
        int res = 0;
        int[] diff = new int[reward1.length];

        for (int i = 0; i < reward1.length; i++)
        {
            diff[i] = reward1[i] - reward2[i];
            res += reward2[i];
        }

        Arrays.sort(diff);

        for (int i = diff.length - 1; i >= diff.length - k; i--)
            res += diff[i];
        
        return res;
    }
}