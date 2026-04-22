class Solution {
    public int minimumChairs(String s)
    {
        int freeChairs = 0, totalChairs = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'E')
                if (freeChairs > 0)
                    freeChairs--;
                else
                    totalChairs++;
            
            else
                freeChairs++;
        }

        return totalChairs;
    }
}