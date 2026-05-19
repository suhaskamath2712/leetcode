class Solution {
    public int getCommon(int[] nums1, int[] nums2)
    {
        HashSet<Integer> num1Set = new HashSet<>();

        for (int num : nums1)
            num1Set.add(num);
        
        for (int num : nums2)
            if (num1Set.contains(num))
                return num;
        
        return -1;
    }
}