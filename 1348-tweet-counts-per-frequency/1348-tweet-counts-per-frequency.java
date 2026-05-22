class TweetCounts
{
    HashMap<String, List<Integer>> map;
    public TweetCounts() {
        map = new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        if (map.containsKey(tweetName))
            map.get(tweetName).add(time);
        else
            map.put(tweetName,new ArrayList<>(List.of(time)));
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime)
    {
        int interval = 60;

        if (freq.equals("hour"))
            interval = 3600;
        else if (freq.equals("day"))
            interval = 86400;

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < (endTime - startTime) / interval + 1; i++)
            ans.add(0);

        for (int time : map.get(tweetName))
            if (startTime <= time && endTime >= time)
                ans.set((time - startTime) / interval, ans.get((time - startTime) / interval) + 1);
        
        return ans;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */