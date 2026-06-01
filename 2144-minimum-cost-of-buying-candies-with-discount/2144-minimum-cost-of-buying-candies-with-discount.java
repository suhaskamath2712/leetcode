class Solution {
    public int minimumCost(int[] cost)
    {
        Arrays.sort(cost);
        int minCst = 0, i;

        if (cost.length < 3)
        {
            for (int amt : cost)
                minCst += amt;

            return minCst;
        }
                
        for (i = cost.length - 1; i >= 2; i -= 3)
        {
            minCst += cost[i] + cost[i-1];
        }

        while (i >= 0)
        {
            minCst += cost[i];
            i--;
        }

        return minCst;
    }
}