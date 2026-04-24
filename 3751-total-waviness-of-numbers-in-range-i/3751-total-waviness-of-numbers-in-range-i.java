class Solution {
    public int totalWaviness(int num1, int num2)
    {
        int total = 0;

        for (int i = Math.max(100,num1); i <= num2; i++)
        {
            char[] s = Integer.toString(i).toCharArray();

            for (int j = 1; j < s.length - 1; j++)
                if ((s[j] > s[j-1] && s[j] > s[j+1]) || (s[j] < s[j-1] && s[j] < s[j+1]))
                    total++;
        }

        return total;
    }
}