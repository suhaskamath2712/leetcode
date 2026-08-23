class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rez = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int len = getLen(grid[i][j]);

                if (rez[j] < len) {
                    rez[j] = len;
                }

            }
        }

        return rez;
    }

    private int getLen(int num) {
        int len = num <= 0 ? 1 : 0;

        while (num != 0) {
            num /= 10;
            len++;
        }

        return len;
    }
}