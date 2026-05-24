class Solution {
    public String oddString(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, String> patternMap = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder();
            String word = words[i];
            for(int j = 0; j < word.length() - 1; j++){
                int diff = word.charAt(j + 1) - word.charAt(j);
                sb.append(diff).append(",");
            }
            String pattern = sb.toString();
            map.put(pattern, map.getOrDefault(pattern, 0) + 1);
            patternMap.put(pattern, word);
        }
        for(String pattern : map.keySet()){
            if(map.get(pattern) == 1){
                return patternMap.get(pattern);
            }
        }
        return "";
    }
} 