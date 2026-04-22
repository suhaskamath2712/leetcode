class Bitset
{
    Set<Integer> ones, zeros;
    int size;

    public Bitset(int size)
    {
        ones = new HashSet<>();
        zeros = new HashSet<>();

        this.size = size;

        for (int i = 0; i < size; i++)
            zeros.add(i);
    }
    
    public void fix(int idx)
    {
        zeros.remove(idx);
        ones.add(idx);  
    }
    
    public void unfix(int idx)
    {
        ones.remove(idx);
        zeros.add(idx);   
    }
    
    public void flip()
    {
        Set<Integer> temp = ones;
        ones = zeros;
        zeros = temp;  
    }
    
    public boolean all()
    {
        return (ones.size() == this.size);
    }
    
    public boolean one()
    {
        return (ones.size() > 0);
    }
    
    public int count()
    {
        return (ones.size());
    }
    
    public String toString()
    {
        String str = "";

        for (int i = 0; i < size; i++)
            if (ones.contains(i))
                str += "1";
            else
                str += "0";

        return str;
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */