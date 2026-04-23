class Solution {
    public String trimTrailingVowels(String s)
    {
        int cut;

        for (cut = s.length() - 1; cut >= 0; cut--)
        {
            char c = s.charAt(cut);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                break;
        }

        return s.substring(0,cut+1);
    }
}