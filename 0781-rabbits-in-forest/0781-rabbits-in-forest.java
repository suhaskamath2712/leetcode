class Solution {
    public int numRabbits(int[] answers)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int a : answers)
            map.put(a,map.getOrDefault(a,0)+1);

        int cnt = 0;

        for (Map.Entry<Integer,Integer> rec : map.entrySet())
            cnt += (rec.getValue() + rec.getKey()) / (rec.getKey() + 1) * (rec.getKey() + 1);
        
        return cnt;
    }
}