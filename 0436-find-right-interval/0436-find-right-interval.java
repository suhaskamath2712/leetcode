class Solution {
    public int[] findRightInterval(int[][] intervals) {
        // build indexMap
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] curr = intervals[i];
            indexMap.put(
                Arrays.toString(curr),
                i
            );
        }

        // preSort intervals
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        int[] result = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] right = occurrenceBS(intervals, i, curr[1]);

            result[indexMap.get(Arrays.toString(curr))] = (
                (right == null) ? -1
                : indexMap.get(Arrays.toString(right))
            );
        }

        return result;
    }

    // find the FIRST interval with .start > currEND in interval[left: ]. Return null if NOT exists.
    private int[] occurrenceBS(
        int[][] intervals, int left,
        int currEND
    ) {
        int right = intervals.length - 1;

        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (intervals[mid][0] >= currEND) right = mid;
            else left = mid + 1;
        }

        // Post processing
        if (intervals[left][0] >= currEND) return intervals[left];
        if (intervals[right][0] >= currEND) return intervals[right];
        return null;
    }
}