class Solution
{
    public int halveArray(int[] nums)
    {
        double target, sum = 0;
        int ops = 0;

        PriorityQueue<Double> q = new PriorityQueue<>((a,b) -> Double.compare(b,a));

        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            q.add((double) nums[i]);
        }

        target = sum/2;

        while (sum > target)
        {
            double max = q.poll();
            q.add(max/2);
            sum -= max/2;
            ops++;
        }

        return ops;
    }
}