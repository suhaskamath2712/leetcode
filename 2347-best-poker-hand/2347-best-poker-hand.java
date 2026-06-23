class Solution {
    public String bestHand(int[] ranks, char[] suits)
    {
        boolean flush = true;

        for (int i = 0; i < suits.length-1 && flush; i++)
            flush = (suits[i] == suits[i+1]);

        if (flush)
            return "Flush";
        
        byte[] rankFreq = new byte[14];

        for (int rank : ranks)
            rankFreq[rank]++;
        
        byte max = Byte.MIN_VALUE;

        for (byte freq : rankFreq)
            max = max < freq ? freq : max;
        
        if (max >= 3)
            return "Three of a Kind";
        else if (max == 2)
            return "Pair";
        
        else return "High Card";
    }
}