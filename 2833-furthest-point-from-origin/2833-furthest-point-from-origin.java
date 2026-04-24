class Solution {
    public int furthestDistanceFromOrigin(String moves)
    {
        byte left = 0, right = 0, any = 0;

        for (char c : moves.toCharArray())
            if (c == 'L')
                left++;
            else if (c == 'R')
                right++;
            else
                any++;
        
        return Math.abs(left - right) + any;
    }
}