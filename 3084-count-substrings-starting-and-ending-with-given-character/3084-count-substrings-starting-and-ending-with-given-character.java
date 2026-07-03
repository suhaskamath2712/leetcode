class Solution {
    public long countSubstrings(String s, char c)
    {
        int cnt = 0;
        long ans = 0;

        for (char ch : s.toCharArray())
        {
            if (ch == c)
            {
                cnt++;
                ans += cnt;
            }
        }

        return ans;
    }
}