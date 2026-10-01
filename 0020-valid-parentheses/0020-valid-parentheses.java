class Solution {
    public boolean isValid(String s)
    {
        Stack<Character> ps = new Stack<Character>();

        for (int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '[' || curr == '{')  ps.push(curr);
            else if (!ps.isEmpty())
            {
                if (curr == ')' && ps.pop() != '(')             return false;
                else if (curr == ']' && ps.pop() != '[')        return false;
                else if (curr == '}' && ps.pop() != '{')        return false;
            }
            else    return false;
        }

        if (ps.isEmpty())   return true;

        return false;
    }
}