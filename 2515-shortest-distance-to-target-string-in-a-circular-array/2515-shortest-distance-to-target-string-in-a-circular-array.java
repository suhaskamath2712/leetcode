import java.util.*;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int running_min = words.length + 1;

        // 1. Find all indices where the word matches the target
        for (int i = 0; i < words.length; i++)
            if (words[i].equals(target))
                running_min = Math.min(running_min, Math.min(Math.abs(startIndex - i), words.length - Math.abs(startIndex - i)));

        if (running_min == words.length + 1)
            return -1;
        
        return running_min;
    }
}