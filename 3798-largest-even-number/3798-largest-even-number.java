class Solution {
    public String largestEven(String s)
    {
        if ((s.charAt(s.length()-1) - '0') % 2 == 0)
            return s;
        
        if (s.length() == 1)
            return "";

        int earlistIdx = Integer.MIN_VALUE;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            if ((s.charAt(i)-'0') % 2 == 0)
            {
                earlistIdx = i;
                break;
            }
        }

        if (earlistIdx != Integer.MIN_VALUE)
            return s.substring(0,earlistIdx+1);
        
        return "";
    }
}