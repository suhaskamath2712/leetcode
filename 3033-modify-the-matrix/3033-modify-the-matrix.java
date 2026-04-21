class Solution {
    public int[][] modifiedMatrix(int[][] matrix)
    {
        //Check each column for -1
        for (int i = 0; i < matrix[0].length; i++)
        {
            ArrayList<Integer> blankIdxs = new ArrayList<Integer>();
            int max = -2;

            for (int j = 0; j < matrix.length; j++)
            {
                if (matrix[j][i] == -1)
                    blankIdxs.add(j);
                
                max = max < matrix[j][i] ? matrix[j][i] : max;
            }

            for (int blankIdx : blankIdxs)
                matrix[blankIdx][i] = max;
        }

        return matrix;
    }
}