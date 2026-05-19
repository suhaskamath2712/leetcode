class Solution {
    public int getCommon(int[] nums1, int[] nums2)
    {
        HashSet<Integer> num1Set = new HashSet<>();

        for (int num1 : nums1)
        {
            num1Set.add(num1);
            for (int num2 : nums2)
            {
                if (num1 < num2)
                    break;
                if (num1Set.contains(num2))
                    return num2;
            }
        }
        
        return -1;
    }
}