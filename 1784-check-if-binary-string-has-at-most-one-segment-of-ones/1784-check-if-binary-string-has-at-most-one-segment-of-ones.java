class Solution {
    public boolean checkOnesSegment(String s)
    {
        boolean oneDone = (s.charAt(0) == '1');

        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
                if (s.charAt(i-1) != '1' && oneDone)
                    return false;
                else
                    oneDone = true;
        }

        return true;
    }
}