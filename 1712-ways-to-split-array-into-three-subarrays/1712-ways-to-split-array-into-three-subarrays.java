class Solution {
    public int waysToSplit(int[] nums) {
            
        int MOD = (int) (1e9 + 7);

        // prefix array
        int[] A = new int[nums.length];
        
        A[0] = nums[0];
        
        for (int i = 1; i < nums.length; ++i)
            A[i] = A[i - 1] + nums[i];

        int res = 0;
        for (int i = 1; i < nums.length - 1; ++i)
        {
            if (A[i - 1] > (A[nums.length - 1] - A[i - 1]) / 2)
                break;

            int left = helper(A, A[i - 1], i, true);
            int right = helper(A, A[i - 1], i, false);

            if (left == -1 || right == -1)
                continue;  // none is satisfied

            res = (res + (right - left + 1) % MOD) % MOD;
        }

        return res;
    }

    private int helper(int[] A, int leftSum, int index, boolean searchLeft)
    {
        int l = index, r = A.length - 2;
        int res = -1;

        while (l <= r)
        {
            int m = (r - l) / 2 + l;
            int midSum = A[m] - A[index - 1];
            int rightSum = A[A.length - 1] - A[m];

            if (leftSum <= midSum && midSum <= rightSum)
            {
                res = m;
                if (searchLeft)
                    r = m - 1;
                else
                    l = m + 1;
            }
            else if (leftSum > midSum)  // shrink left
                l = m + 1;
            else // shrink right
                r = m - 1;
        }

        return res;
    }
}