class Solution {
    public int minAddToMakeValid(String s)
    {
        int openCnt = 0, closeCnt = 0;

        for (char c : s.toCharArray())
        {
            if (c == '(')
                openCnt++;
            else if (c == ')')
                if (openCnt > 0)
                    openCnt--;
                else
                    closeCnt++;
        }

        return closeCnt+openCnt;
    }
}