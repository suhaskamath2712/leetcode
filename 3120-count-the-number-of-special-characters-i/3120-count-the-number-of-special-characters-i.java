class Solution {
    public int numberOfSpecialChars(String word)
    {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char c : word.toCharArray())
            if (c >= 'a')
                lower[c-'a'] = true;
            else
                upper[c-'A'] = true;

        int cnt = 0;

        for (int i = 0; i < lower.length; i++)
            if (lower[i] && upper[i])
                cnt++;

        return cnt;    
    }
}