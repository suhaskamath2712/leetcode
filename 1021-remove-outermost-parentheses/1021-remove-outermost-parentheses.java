class Solution {
    public String removeOuterParentheses(String s)
    {
        String ans = "";
        int lev = 0;

        for (char c : s.toCharArray())
        {
            if (c == '(')
            {
                ans += lev > 0 ? c : "";
                lev++;
            }
            else
            {
                lev--;
                ans += lev > 0 ? c : "";
            }
        }

        return ans;
    }
}