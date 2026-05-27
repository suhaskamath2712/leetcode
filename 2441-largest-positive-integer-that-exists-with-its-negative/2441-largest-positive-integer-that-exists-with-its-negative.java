class Solution {
    public int findMaxK(int[] nums)
    {
        boolean[][] arr = new boolean[2][1001];

        for (int num : nums)
            if (num > 0)
                arr[0][num] = true;
            else
                arr[1][-1*num] = true;

        for (int i = arr[0].length - 1; i >= 0; i--)
            if (arr[0][i] && arr[1][i])
                return i;

        return -1;    
    }
}