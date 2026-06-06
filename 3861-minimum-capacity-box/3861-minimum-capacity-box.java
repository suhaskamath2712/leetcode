class Solution {
    public int minimumIndex(int[] capacity, int itemSize)
    {
        int idx = -1;

        for (int i = 0; i < capacity.length; i++)
            if (capacity[i] > itemSize && (idx == -1 || capacity[idx] > capacity[i]))
                idx = i;
            else if (capacity[i] == itemSize)
                return i;

        return idx;    
    }
}