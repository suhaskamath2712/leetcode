class Solution {
    public List<Integer> findMissingElements(int[] nums)
    {
        boolean[] present = new boolean[101];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i : nums)
        {
            present[i] = true;
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min + 1; i < max; i++)
            if (!present[i])
                ans.add(i);

        return ans;
    }
}