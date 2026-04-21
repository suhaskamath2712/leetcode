class Solution {
    public int minimizedStringLength(String s)
    {
        boolean[] letters = new boolean[26];
        int chars = 0;

        for (char c : s.toCharArray())
            letters[c - 'a'] = true;
        
        for (boolean b : letters)
            if (b)
                chars++;
        
        return chars;
    }
}