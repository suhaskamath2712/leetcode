class Solution {
    public boolean validMountainArray(int[] arr)
    {
        if (arr.length < 3)
            return false;
        
        //no up/down slope
        if ((arr[0] > arr[1])      //no up slope
        || (arr[arr.length-1] > arr[arr.length-2])) //no down slope
            return false;

        boolean dec = false;

        for (int i = 1; i < arr.length; i++)
        {
            if (!dec && arr[i] < arr[i-1])
                dec = true;
            if (dec && arr[i] > arr[i-1])
                return false;
            if (arr[i] == arr[i-1])
                return false;
        }
        
        return true;
    }
}