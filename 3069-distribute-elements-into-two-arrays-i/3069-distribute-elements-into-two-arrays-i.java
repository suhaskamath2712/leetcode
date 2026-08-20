class Solution {
    public int[] resultArray(int[] nums)
    {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int arr1Idx = 1, arr2Idx = 1, numsIdx = 2;
        
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        while (numsIdx < nums.length)
        {
            if (arr1[arr1Idx-1] > arr2[arr2Idx-1])
            {
                arr1[arr1Idx] = nums[numsIdx];
                arr1Idx++;
            }
            else
            {
                arr2[arr2Idx] = nums[numsIdx];
                arr2Idx++;
            }
            numsIdx++;
        }

        for (int i = 0; i < arr2Idx; i++,arr1Idx++)
            arr1[arr1Idx] = arr2[i];

        return arr1;
    }
}