class Solution {
    public boolean judgeCircle(String moves)
    {
        int upCnt = 0, rightCnt = 0;

        for (char move : moves.toCharArray())
            if (move == 'U')
                upCnt++;
            else if (move == 'D')
                upCnt--;
            else if (move == 'R')
                rightCnt++;
            else
                rightCnt--;
        
        return upCnt == 0 && rightCnt == 0;
    }
}