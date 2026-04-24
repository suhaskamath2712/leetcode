class RLEIterator
{
    int[] enc;
    static int currIdx;

    public RLEIterator(int[] encoding)
    {
        this.enc = encoding;
        this.currIdx = 0;    
    }
    
    public int next(int n)
    {
        while(currIdx < enc.length && n > enc[currIdx])
        {
            n = n - enc[currIdx];
            currIdx += 2;
        }
        
        if(currIdx >= enc.length)
            return -1;
        
        enc[currIdx] -= n;
        return enc[currIdx + 1];
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */