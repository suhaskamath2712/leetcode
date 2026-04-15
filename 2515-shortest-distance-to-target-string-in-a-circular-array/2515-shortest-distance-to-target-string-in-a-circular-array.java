import java.util.*;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        List<Integer> hits = new ArrayList<>();

        // 1. Find all indices where the word matches the target
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                hits.add(i);
            }
        }

        // 2. If the target was never found, return -1
        if (hits.isEmpty()) {
            return -1;
        }

        int running_min = words.length;

        // 3. Calculate the shortest circular distance for each hit
        for (int idx : hits)
            running_min = Math.min(running_min, Math.min(Math.abs(startIndex - idx), words.length - Math.abs(startIndex - idx)));

        return running_min;
    }
}