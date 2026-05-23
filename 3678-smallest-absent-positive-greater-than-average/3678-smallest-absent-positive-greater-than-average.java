class Solution {
    public int smallestAbsent(int[] nums)
    {
        int avg = 0, min;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            avg += num;

        avg /= nums.length;
        avg++;

        for (int num : nums)
            if (num >= avg)
                set.add(num);
        
        if (avg <= 0)
            avg = 1;
        
        while (set.contains(avg))
            avg++;
        
        return avg;
    }
}