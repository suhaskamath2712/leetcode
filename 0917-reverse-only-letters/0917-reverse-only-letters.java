class Solution {
    public String reverseOnlyLetters(String s)
    {
        char[] arr = s.toCharArray();
        int lo = 0, hi = arr.length - 1;

        //two pointer solution
        while (lo <= hi)
        {
            //lo is a char
            if ((arr[lo] >= 65 && arr[lo] <= 90) || (arr[lo] >= 97 && arr[lo] <= 122))
            {
                //are both letters, swap both chars
                if ((arr[hi] >= 65 && arr[hi] <= 90) || (arr[hi] >= 97 && arr[hi] <= 122))
                {
                    char temp = arr[lo];
                    arr[lo] = arr[hi];
                    arr[hi] = temp;
                    lo++;
                }
                
                hi--;
            }
            else lo++;
        }

        return String.valueOf(arr);
    }
}