class Solution {
    public boolean equalFrequency(String word)
    {
        byte[] freq = new byte[26];

        for (char c : word.toCharArray())
            freq[c-'a']++;

        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i] == 0)
                continue;

            freq[i]--;

            if (isValid(freq))
                return true;
            
            freq[i]++;
        }

        return false;
    }

    private boolean isValid(byte[] freq)
    {
        byte exp = 0;

        for (byte b : freq)
        {
            if (b == 0)
                continue;
            if (exp == 0)
                exp = b;
            else if (exp != b)
                return false;
        }
        return true;
    }
}