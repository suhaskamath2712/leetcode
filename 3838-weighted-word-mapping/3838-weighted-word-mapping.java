class Solution {
    public String mapWordWeights(String[] words, int[] weights)
    {
        String res = "";

        for (String word : words)
        {
            int score = 0;
            for (char c : word.toCharArray())
                score += weights[c-'a'];

            char c = (char) ('a' + 25 - (score%26));
            res += c;
        }

        return res;
    }
}