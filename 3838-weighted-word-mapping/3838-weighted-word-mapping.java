class Solution {
    public String mapWordWeights(String[] words, int[] weights)
    {
        String res = "";

        for (String word : words)
        {
            int score = 0;
            for (char c : word.toCharArray())
                score += weights[c-'a'];

            res += (char) ('z' - (score%26));
        }

        return res;
    }
}