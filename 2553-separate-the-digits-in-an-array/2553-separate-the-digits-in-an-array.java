class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);
            for (char ch : s.toCharArray())
                list.add(ch - '0');
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}