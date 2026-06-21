class Solution {
    public int maxIceCream(int[] costs, int coins)
    {
        int ans = 0;

        Arrays.sort(costs);
        
        for (int i : costs)
        {
            if (coins >= i)
            {
                ans++;
                coins -= i;
            }
            else
                break;
        }

        return ans;
    }
}