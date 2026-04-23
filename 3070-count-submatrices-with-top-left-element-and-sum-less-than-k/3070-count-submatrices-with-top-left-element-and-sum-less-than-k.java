class Solution {
    public int countSubmatrices(int[][] grid, int k)
    {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        int count = 0;

        for (int i = 1; i < dp.length; i++)
        {
            for (int j = 1; j < dp[0].length; j++)
            {
                dp[i][j] = grid[i-1][j-1] + dp[i-1][j] + dp[i][j-1]- dp[i-1][j-1];
                if (dp[i][j] <= k) count++;
                else break;
            }
        }

        return count;
    }
}