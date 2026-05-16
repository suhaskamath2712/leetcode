class Solution {
    public int divisorSubstrings(int num, int k)
    {
        List<Integer> k_grams = new ArrayList<>();
        String num_str = Integer.toString(num);

        for (int i = 0; i < num_str.length() + 1 - k; i++)
            k_grams.add(Integer.parseInt(num_str.substring(i,i+k)));

        int beauty = 0;

        for (int k_gram : k_grams)
            if (k_gram != 0 && num % k_gram == 0)
                beauty++;
        
        return beauty;
    }
}