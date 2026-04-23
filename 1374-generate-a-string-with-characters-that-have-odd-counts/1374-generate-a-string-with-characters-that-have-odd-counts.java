class Solution {
    public String generateTheString(int n)
    {
        char[] arr = new char[n];

        for (int i = 0; i < n - 1; i++)
            arr[i] = 'a';

        arr[n-1] = n%2 == 0 ? 'b' : 'a';

        return new String(arr);    
    }
}