class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < queries.length; i++)
        {
            for (int j = 0; j < dictionary.length; j++)
            {
                byte diff = 0;

                for (int k = 0; k < queries[i].length() && diff <= 2; k++)
                    if (queries[i].charAt(k) != dictionary[j].charAt(k))
                        diff++;

                if (diff <= 2)
                {
                    res.add(queries[i]);
                    break;
                }
            }
        }

        return res;
    }
}