class Solution {
    public String maximumOddBinaryNumber(String s)
    {
        byte oneCnt = 0, zeroCnt = 0;

        for (char c : s.toCharArray())
            if (c == '1')
                oneCnt++;
            else
                zeroCnt++;
        
        String ans = "";

        for (byte i = 0; i < oneCnt-1; i++)
            ans += "1";

        for (byte i = 0; i < zeroCnt; i++)
            ans += "0";

        ans += "1";

        return ans;
    }
}