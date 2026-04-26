class Solution {
    public boolean validDigit(int n, int x)
    {
        char[] arr = Integer.toString(n).toCharArray();
        if (arr[0] == '0'+x)
            return false;
        
        for (int i = 1; i < arr.length; i++)
            if (arr[i] == '0' + x)
                return true;

        return false;
    }
}