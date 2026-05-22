class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k)
    {
        int j = 0, cnt = 0;

        for (int i = 0; i < colors.length + k - 1; i++)
        {
            if (i > 0 && colors[i%colors.length] == colors[(i-1)%colors.length])
                j = i;
            if (i - j + 1 >= k)
                cnt++;
        }

        return cnt;    
    }
}