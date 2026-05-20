class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        int[] res = new int[A.length];
        boolean[] seen = new boolean[A.length];

        for (int i = 0; i < A.length; i++)
        {
            if (seen[A[i] - 1]) count++;
            else seen[A[i] - 1] = true;

            if (seen[B[i] - 1]) count++;
            else seen[B[i] - 1] = true;

            res[i] = count;
        }

        return res;
    }
}