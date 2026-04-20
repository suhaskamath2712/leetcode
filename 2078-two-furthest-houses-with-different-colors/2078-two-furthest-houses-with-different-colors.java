class Solution {
    public int maxDistance(int[] colors)
    {
        int maxLeft = 0, maxRight = 0;

        for (int i = 0; i < colors.length; i++)
            if (colors[i] != colors[colors.length-1])
            {
                maxLeft = i;
                break;
            }

        for (int i = colors.length - 1; i >= 0; i--)
            if (colors[i] != colors[0])
            {
                maxRight = i;
                break;
            }

        return Math.max (colors.length - 1 - maxLeft, maxRight);
    }
}