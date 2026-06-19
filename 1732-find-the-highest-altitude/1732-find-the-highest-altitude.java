class Solution {
    public int largestAltitude(int[] gain)
    {
        int max = 0, curr = 0;

        for (int gai : gain)
        {
            curr += gai;
            max = max < curr ? curr : max;
        }    

        return max;
    }
}