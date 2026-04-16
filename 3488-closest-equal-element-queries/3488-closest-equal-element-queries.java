class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries)
    {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            if (map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else
                map.put(nums[i],new ArrayList<>(Arrays.asList(i)));
        
        System.out.println(map.toString());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.length; i++)
        {
            int query = queries[i];
            //This list will contain the indexes of the elements that contain nums[query]
            ArrayList<Integer> idx_list = map.get(nums[query]);

            //Only one of the element is in the array, there is no neighbour
            if (idx_list.size() == 1)
                result.add(-1);
            else
            {
                int pos = Collections.binarySearch(idx_list, query), running_min = Integer.MAX_VALUE;

                // left neighbor
                int left = Math.abs(query - idx_list.get((pos - 1 + idx_list.size()) % idx_list.size()));
                running_min = Math.min(running_min, Math.min(left, nums.length - left));

                // right neighbor
                int right = Math.abs(query - idx_list.get((pos + 1) % idx_list.size()));
                running_min = Math.min(running_min, Math.min(right, nums.length - right));
         
                result.add(running_min);
            }
        }
        return result;
    }
}