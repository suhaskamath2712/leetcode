class Solution {
    public int minimumPushes(String word)
    {
        int[] freq = new int[26];

        for (char c : word.toCharArray())
            freq[c-'a']++;

        int cnt = 0;

        Arrays.sort(freq);

        for (int i = 0; i < 26; i++)
        {
            cnt += (i/8 + 1) * freq[26 - i - 1];

            if (freq[26 - i - 1] == 0)
                break;
        }
        
        return cnt;    
    }
}