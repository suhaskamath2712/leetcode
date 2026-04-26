class Solution {
    public int numberOfSpecialChars(String word)
    {
        byte[] letters = new byte[26];

        //0: letter has not appeared in string
        //1: lowercase letter has appeared -> next appearance may be uppercase/lowercase
        //2: uppercase letter has appeared -> next appearance can only be uppercase
        //-1 screwed

        for (char c : word.toCharArray())
        {
            boolean isLower = (c >= 'a');
            int idx = isLower ? c - 'a' : c - 'A';

            if (letters[idx] == -1)
                continue;

            //Lowercase char that had never appeared
            if (isLower && letters[idx] == 0)
                letters[idx] = 1;
            
            //Lowercase char that is appearing after an uppercase char
            //Uppercase char showing up before lowercase counterpart
            else if ((isLower && letters[idx] == 2) || (!isLower && letters[idx] == 0))
                letters[idx] = -1;

            //Uppercase char showing after lowercase counterpart (valid)
            else if (!isLower && letters[idx] == 1)
                letters[idx] = 2;
        }

        int count = 0;

        for (byte b : letters)
            if (b == 2)
                count++;
        
        return count;
    }
}