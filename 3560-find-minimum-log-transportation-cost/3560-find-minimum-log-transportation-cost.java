class Solution {
    public long minCuttingCost(int n, int m, int k)
    {
        int maxLength = 0;
        maxLength = Math.max(n-k,maxLength);
        maxLength = Math.max(m-k,maxLength);
        return ((long) maxLength)*k;
    }
}